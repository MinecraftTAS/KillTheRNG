package de.scribble.lp.killtherng.random2mixin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.objectweb.asm.Opcodes;

import de.scribble.lp.killtherng.custom.CustomRandom;

public class Csv2Mixin {
	
	private static File dir=new File("../");
	
	private static File dirKTRNG;
	
	private static List<CustomRandom> processed=new ArrayList<>();
	
	private static FileOutputStream urStream;
	
	private static FileOutputStream mixinStream;
	
	private static FileOutputStream mixinConfigStream;
	
	private static String prevClassName;
	
	private static int counter=0;
	
	private static Map<String, SideType> mapper=new HashMap<>();
	
	private static List<String> both=new ArrayList<>();
	
	private static List<String> client=new ArrayList<>();
	
	private static List<String> server=new ArrayList<>();

	private enum RandomType{
		Int,
		IntBound,
		Float,
		Double,
		Boolean,
		Bytes,
		Gaussian,
		Long,
		SetSeed,
		Math
	}
	
	private enum SideType{
		Both,
		Client,
		Server;
	}
	
	public static void main(String[] args) {
		dirKTRNG=new File(dir, "src/main/java/de/scribble/lp/killtherng/mixin/ktrng/patches");
		
		if(!dirKTRNG.exists()) {
			dirKTRNG.mkdirs();
		}
		
		//Loading in the file
		File logfile=new File(dir,"Randomness 1.12.2 extreme - Oh no.tsv");
		File classfile=new File(dir, "Randomness 1.12.2 extreme - Classes.csv");
		
		if(classfile.exists()) {
			List<String> lines2=new ArrayList<>();
			try {
				lines2=FileUtils.readLines(classfile, Charset.defaultCharset());
			} catch (IOException e) {
				e.printStackTrace();
			}
			for(String line : lines2) {
				String[] split=line.split(",");
				mapper.put(split[0], SideType.valueOf(split[1]));
			}
		}
		
		//Check if it exists
		if(!logfile.exists()) {
			return;
		}
		//Read lines
		List<String> lines=new ArrayList<>();
		try {
			lines=FileUtils.readLines(logfile, Charset.defaultCharset());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			startURFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//process lines
		for (String line :lines) {
			if(line.startsWith("Recognisable")) continue;
			String[] split = line.split("\t");
			
			//The name of the randomness in question: "blockupdateLCG"
			String name=split[0];
			//The description of what the randomness does: "Linear Congruential Generator seed, for random block updates. Called when joining a World"
			String description=split[1];
			//The qualified name of the class and method that should be mixed into: "Lnet/minecraft/world/World;<init>(Lnet/minecraft/world/storage/ISaveHandler;Lnet/minecraft/world/storage/WorldInfo;Lnet/minecraft/world/WorldProvider;Lnet/minecraft/profiler/Profiler;Z)V"
			String qualName=split[2];
			//The qualified name of the redirect target: "Ljava/util/Random;nextInt()I"
			String target=split[3];
			//The ordinal of the randomness. If multiple redirect targets are the same, the ordinal will increase: "0"
			String ordinal=split[4];
			//The access information of the class, something like public, abstract, private etc... some special cases need this: "0x421"
			int classAccess=Integer.parseInt(split[5].replaceFirst("0x", ""), 16);
			//The access of the method that should be mixed into, something like public, private, protected, static etc... : "0x4"
			int methodAccess=Integer.parseInt(split[6].replaceFirst("0x", ""), 16);
			//If the random should be remapped. Some stuff like forge classes are still deobfuscated in the finished jar, which throws an error... : "FALSE"
			boolean remap=split[7].equals("TRUE")? true : false;
			//If the random should be enabled. If the value is "TRUE" it will be disabled in the mixin: "TRUE"
			boolean enabled=split[8].equals("TRUE")? false : true;
			//If the mixin should be called on the client
			boolean client=split[9].equals("TRUE")? true : false;
			
			/****Process qualified name****/
			String className=getClassName(qualName); //The actual class name to mix into without the package information: "World"
			String classNameWithPath=getClassNameWithPath(qualName);	//The class name with the path, this is used for classes that are private: "net.minecraft.world.World"
			String methodName=getMethodName(qualName);		//The method name plus descriptor: "<init>(Lnet/minecraft/world/storage/ISaveHandler;Lnet/minecraft/world/storage/WorldInfo;Lnet/minecraft/world/WorldProvider;Lnet/minecraft/profiler/Profiler;Z)V"
			RandomType targetType=getTargetName(target);
			
			if(client) {
				className=className+"2";
			}
			
			addRandomnessUR(name, description, enabled);
			
			if(!className.equals(prevClassName)) {
				try {
					switchClassFileMixin(className, classNameWithPath, classAccess, client);
					addToMixinConfig(className);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				prevClassName=className;
			}
			
			try {
				counter++;
				addRedirect(methodName, ordinal, targetType, name, methodAccess, description, className, remap, enabled);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			writeLineMixin("}");
			writeLineUR("}");
			closeMixinConf();
			urStream.close();
			mixinStream.close();
			mixinConfigStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//======================================================================
	
	private static void switchClassFileMixin(String className, String className2, int classAccess, boolean client) throws IOException {
		if(mixinStream!=null) {
			writeLineMixin("}");
		}
		counter=0;
		mixinStream=new FileOutputStream(new File(dirKTRNG, "Mixin"+className+".java"));
		writeLineMixin("package de.scribble.lp.killtherng.mixin.ktrng.patches;\n");
		writeLineMixin("import java.util.Random;\n");
		
		writeHardCodedImports(className);
		
		if(classAccess==0x30||classAccess==0x20||classAccess==0x420) {
			writeLineMixin("@Mixin(targets=\""+className2+"\")");
		}else {
			if(client) {
				writeLineMixin("@Mixin("+className.replace("$", ".").replace("2", "")+".class)");
			}else {
				writeLineMixin("@Mixin("+className.replace("$", ".")+".class)");
			}
			
		}
		writeLineMixin("public class Mixin"+className+" {\n");
	}
	
	/**
	 * Some imports to make my life a bit easier
	 * @throws IOException 
	 */
	private static void writeHardCodedImports(String className) throws IOException {
		if(className.equals("Block")) {
			writeLineMixin("import net.minecraft.block.Block;\n");
		} else if(className.equals("Entity")) {
			writeLineMixin("import net.minecraft.entity.Entity;\n");
		} else if(className.equals("WorldType")) {
			writeLineMixin("import net.minecraft.world.WorldType;\n");
		} else if(className.equals("Village")) {
			writeLineMixin("import net.minecraft.village.Village;\n");
		}
	}
	
	//======================================================================
	
	private static void addRedirect(String methodName, String ordinal, RandomType targetType,
			String name, int methodAccess, String description, String className, boolean remapIn, boolean enabled) throws IOException {
		writeLineMixin("\t/**\n"
				+ "\t* "+description+"\n"
						+ "\t*/");
		
		String access=getAccess(methodAccess, methodName, className);
		String remap= remapIn ? ", remap=false" :"";
		switch (targetType) {
		case Int:
			addIntRedirect(methodName, ordinal, name, access, remap, enabled);
			break;
		case IntBound:
			addIntBoundRedirect(methodName, ordinal, name, access, remap, enabled);
			break;
		case Float:
			addFloatRedirect(methodName, ordinal, name, access, remap, enabled);
			break;
		case Double:
			addDoubleRedirect(methodName, ordinal, name, access, remap, enabled);
			break;
		case Boolean:
			addBooleanRedirect(methodName, ordinal, name, access, remap, enabled);
			break;
		case Bytes:
			addBytesRedirect(methodName, ordinal, name, access, remap, enabled);
			break;
		case Gaussian:
			addGaussianRedirect(methodName, ordinal, name, access, remap, enabled);
			break;
		case Long:
			addLongRedirect(methodName, ordinal, name, access, remap, enabled);
			break;
		case SetSeed:
			addSetSeedRedirect(methodName, ordinal, name, access, remap, enabled);
			break;
		case Math:
			addMathRedirect(methodName, ordinal, name, access, remap, enabled);
			break;
		}
	}


	private static void addIntRedirect(String methodName, String ordinal, String name, String access, String remap, boolean enabled) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextInt()I\", ordinal = %s)%s)", methodName, ordinal, remap));
		writeLineMixin(String.format("\t%s int redirect_%s_%s(Random rand) {", access, name, counter));
		
		writeLineMixin(String.format("%s\t\treturn KillTheRNG.randomness.%s.nextInt();", enabled ? "" : "//", name));
		
		writeLineMixin(String.format("%s\t\tKillTheRNG.randomness.%s.nextInt();", !enabled ? "" : "//", name));
		writeLineMixin(String.format("%s\t\treturn rand.nextInt();", !enabled ? "" : "//"));
		writeLineMixin("\t}\n");
	}


	private static void addIntBoundRedirect(String methodName, String ordinal, String name, String access, String remap, boolean enabled) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextInt(I)I\", ordinal = %s)%s)", methodName, ordinal, remap));
		writeLineMixin(String.format("\t%s int redirect_%s_%s(Random rand, int i) {", access, name, counter));
		
		writeLineMixin(String.format("%s\t\treturn KillTheRNG.randomness.%s.nextInt(i);", enabled? "" : "//", name));
		
		writeLineMixin(String.format("%s\t\tKillTheRNG.randomness.%s.nextInt(i);", !enabled ? "" : "//", name));
		writeLineMixin(String.format("%s\t\treturn rand.nextInt(i);", !enabled ? "" : "//"));
		writeLineMixin("\t}\n");
	}
	
	private static void addDoubleRedirect(String methodName, String ordinal, String name, String access, String remap, boolean enabled) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextDouble()D\", ordinal = %s)%s)", methodName, ordinal, remap));
		writeLineMixin(String.format("\t%s double redirect_%s_%s(Random rand) {", access, name, counter));
		
		writeLineMixin(String.format("%s\t\treturn KillTheRNG.randomness.%s.nextDouble();", enabled ? "" : "//", name));
		
		writeLineMixin(String.format("%s\t\tKillTheRNG.randomness.%s.nextDouble();", !enabled ? "" : "//", name));
		writeLineMixin(String.format("%s\t\treturn rand.nextDouble();", !enabled ? "" : "//"));
		writeLineMixin("\t}\n");
	}

	private static void addFloatRedirect(String methodName, String ordinal, String name, String access, String remap, boolean enabled) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextFloat()F\", ordinal = %s)%s)", methodName, ordinal, remap));
		writeLineMixin(String.format("\t%s float redirect_%s_%s(Random rand) {", access, name, counter));
		
		writeLineMixin(String.format("%s\t\treturn KillTheRNG.randomness.%s.nextFloat();", enabled? "" : "//", name));
		
		writeLineMixin(String.format("%s\t\tKillTheRNG.randomness.%s.nextFloat();", !enabled ? "" : "//", name));
		writeLineMixin(String.format("%s\t\treturn rand.nextFloat();", !enabled ? "" : "//"));
		writeLineMixin("\t}\n");
	}

	private static void addBooleanRedirect(String methodName, String ordinal, String name, String access, String remap, boolean enabled) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextBoolean()Z\", ordinal = %s)%s)", methodName, ordinal, remap));
		writeLineMixin(String.format("\t%s boolean redirect_%s_%s(Random rand) {", access, name, counter));
		
		writeLineMixin(String.format("%s\t\treturn KillTheRNG.randomness.%s.nextBoolean();", enabled? "" : "//", name));
		
		writeLineMixin(String.format("%s\t\tKillTheRNG.randomness.%s.nextBoolean();", !enabled ? "" : "//", name));
		writeLineMixin(String.format("%s\t\treturn rand.nextBoolean();", !enabled ? "" : "//"));
		writeLineMixin("\t}\n");
	}
	
	private static void addBytesRedirect(String methodName, String ordinal, String name, String access, String remap, boolean enabled) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextBytes([B)V\", ordinal = %s)%s)", methodName, ordinal, remap));
		writeLineMixin(String.format("\t%s void redirect_%s_%s(Random rand, byte[] bytes) {", access, name, counter));
		
		writeLineMixin(String.format("%s\t\tKillTheRNG.randomness.%s.nextBytes(bytes);", enabled ? "" : "//", name));
		
		writeLineMixin(String.format("%s\t\tKillTheRNG.randomness.%s.nextBytes(bytes);", !enabled? "" : "//", name));
		writeLineMixin(String.format("%s\t\trand.nextBytes(bytes);", !enabled ? "" : "//"));
		
		writeLineMixin("\t}\n");
	}

	private static void addGaussianRedirect(String methodName, String ordinal, String name, String access, String remap, boolean enabled) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextGaussian()D\", ordinal = %s)%s)", methodName, ordinal, remap));
		writeLineMixin(String.format("\t%s double redirect_%s_%s(Random rand) {", access, name, counter));
		
		writeLineMixin(String.format("%s\t\treturn KillTheRNG.randomness.%s.nextGaussian();", enabled ? "" : "//", name));
		
		writeLineMixin(String.format("%s\t\tKillTheRNG.randomness.%s.nextGaussian();", !enabled ? "" : "//", name));
		writeLineMixin(String.format("%s\t\treturn rand.nextGaussian();", !enabled ? "" : "//"));
		writeLineMixin("\t}\n");
	}
	
	private static void addLongRedirect(String methodName, String ordinal, String name, String access, String remap, boolean enabled) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextLong()J\", ordinal = %s)%s)", methodName, ordinal, remap));
		writeLineMixin(String.format("\t%s long redirect_%s_%s(Random rand) {", access, name, counter));
		
		writeLineMixin(String.format("%s\t\treturn KillTheRNG.randomness.%s.nextLong();", enabled? "" : "//", name));
		
		writeLineMixin(String.format("%s\t\tKillTheRNG.randomness.%s.nextLong();", !enabled? "" : "//", name));
		writeLineMixin(String.format("%s\t\treturn rand.nextLong();", !enabled ? "" : "//"));
		
		writeLineMixin("\t}\n");
	}
	
	//********************************************
	
	private static void addSetSeedRedirect(String methodName, String ordinal, String name, String access, String remap, boolean enabled) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;setSeed(J)V\", ordinal = %s)%s)", methodName, ordinal, remap));
		writeLineMixin(String.format("\t%s void redirect_%s_%s(Random rand, long seed) {", access, name, counter));
		writeLineMixin(String.format("\t\tKillTheRNG.randomness.%s.setSeed(seed, true);", name));
		writeLineMixin(String.format("%s\t\trand.setSeed(seed);", !enabled ? "" : "//"));
		writeLineMixin("\t}\n");
	}
	
	private static void addMathRedirect(String methodName, String ordinal, String name, String access, String remap, boolean enabled) throws IOException{
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/lang/Math;random()D\", ordinal = %s)%s)", methodName, ordinal, remap));
		writeLineMixin(String.format("\t%s double redirect_%s_%s() {", access, name, counter));
		
		writeLineMixin(String.format("%s\t\treturn KillTheRNG.randomness.%s.nextDouble();", enabled ? "" : "//", name));
		
		writeLineMixin(String.format("%s\t\tKillTheRNG.randomness.%s.nextDouble();", !enabled ? "" : "//", name));
		writeLineMixin(String.format("%s\t\treturn Math.random();", !enabled ? "" : "//"));
		writeLineMixin("\t}\n");
	}
	
	//********************************************
	
	private static String getAccess(int methodAccess, String methodName, String className) {
		if((methodAccess|Opcodes.ACC_STATIC)==methodAccess||(className.equals("ParticleSpell")&&counter<3)) {
			return "private static";
		}else {
			return "public";
		}
	}
	

	private static void writeLineMixin(String line) throws IOException {
		line=line+"\n";
		mixinStream.write(line.getBytes());
	}

	//======================================================================
	
	private static void startURFile() throws IOException, FileNotFoundException {
		urStream=new FileOutputStream(new File(dir, "src/main/java/de/scribble/lp/killtherng/UltimateRandomness.java"));
		writeLineUR("package de.scribble.lp.killtherng;\n");
		writeLineUR("import de.scribble.lp.killtherng.custom.CustomRandom;\n");
		writeLineUR("public class UltimateRandomness {\n");
		writeLineUR("public CustomRandom Global=new CustomRandom(\"Global\", \"The global randomness used in PlayerInput and Tick seedingmodes\");\n");
		startMixinConfig();
	}

	
	private static void addRandomnessUR(String name, String description, boolean enabled) {
		try {
			if(!isRandomInList(name)) {
				processed.add(new CustomRandom(name, description));
				writeLineUR(String.format("public CustomRandom %s=new CustomRandom(\"%s\", \"%s\", %b);", name, name, description, enabled));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeLineUR(String line) throws IOException {
		line=line+"\n";
		urStream.write(line.getBytes());
	}
	
	//======================================================================
	
	private static void addToMixinConfig(String className) throws IOException {
		switch (mapper.get(className)) {
		case Both:
			both.add(className);
			break;
		case Client:
			client.add(className);
			break;
		case Server:
			server.add(className);
			break;
		}
	}
	private static void startMixinConfig() throws IOException {
		mixinConfigStream = new FileOutputStream(new File(dir, "src/main/resources/mixins.killtherng.json"));
		writeLineMixinConf("{\r\n" + "  \"required\": true,\n" + "  \"minVersion\": \"0.7.10\",\n"
				+ "  \"package\": \"de.scribble.lp.killtherng.mixin\",\n"
				+ "  \"refmap\": \"mixins.killtherng.refmap.json\",\n" + "  \"compatibilityLevel\": \"JAVA_8\",\n"
				+ "  \"mixins\": [\n"
				+ "\t\"ktrng.MixinPlayerList\",\n"
				+ "\t\"ktrng.MixinMinecraftServer\",\n\n");
	}

	private static void closeMixinConf() throws IOException {
		for (int i = 0; i < both.size(); i++) {
			String line=both.get(i);
			String sep=",";
			if(i==both.size()-1) {
				sep="";
			}
			writeLineMixinConf("\t\"ktrng.patches.Mixin"+line+"\""+sep+"\n");
		}
		writeLineMixinConf("  ],\n"
				+ "  \"client\": [\n"
				+ "\t\"ktrng.MixinMinecraft\",\n"
				+ "\t\"ktrng.MixinGuiMainMenu\",\n\n");
		
		for (int i = 0; i < client.size(); i++) {
			String line=client.get(i);
			String sep=",";
			if(i==client.size()-1) {
				sep="";
			}
			writeLineMixinConf("\t\"ktrng.patches.Mixin"+line+"\""+sep+"\n");
		}
		writeLineMixinConf("  ],\n"
				+ "  \"server\": [\n");
				
		
		for (int i = 0; i < server.size(); i++) {
			String line=server.get(i);
			String sep=",";
			if(i==server.size()-1) {
				sep="";
			}
			writeLineMixinConf("\t\"ktrng.patches.Mixin"+line+"\""+sep+"\n");
		}
		
		writeLineMixinConf("\n\t]\n}\n");
	}

	private static void writeLineMixinConf(String line) throws IOException {
		mixinConfigStream.write(line.getBytes());
	}

	// ======================================================================
		
		
	private static String getMethodName(String qualName) {
		String[] split = qualName.split(";",2);
		return split[1];
	}

	private static String getClassName(String qualName) {
		String[] split = qualName.split(";",2);
		String first = split[0];
		String[] split2 = first.split("/");
		return split2[split2.length-1];
	}

	private static String getClassNameWithPath(String qualName) {
		String[] split = qualName.split(";",2);
		String first = split[0].replace("/", ".");
		String replaced=first.replaceFirst("L", "");
		return replaced;
	}
	
	private static RandomType getTargetName(String target) {
		if(target.equals("Ljava/util/Random;nextInt()I")) return RandomType.Int;
		if(target.equals("Ljava/util/Random;nextInt(I)I")) return RandomType.IntBound;
		if(target.equals("Ljava/util/Random;nextFloat()F")) return RandomType.Float;
		if(target.equals("Ljava/util/Random;nextDouble()D")) return RandomType.Double;
		if(target.equals("Ljava/util/Random;nextBoolean()Z")) return RandomType.Boolean;
		if(target.equals("Ljava/util/Random;nextBytes([B)V")) return RandomType.Bytes;
		if(target.equals("Ljava/util/Random;nextGaussian()D")) return RandomType.Gaussian;
		if(target.equals("Ljava/util/Random;nextLong()J")) return RandomType.Long;
		if(target.equals("Ljava/util/Random;setSeed(J)V")) return RandomType.SetSeed;
		if(target.equals("Ljava/lang/Math;random()D")) return RandomType.Math;
		return null;
	}

	public static CustomRandom getRandomFromString(String name) {
		for(CustomRandom rand : processed) {
			if(rand.getName().equalsIgnoreCase(name)) {
				return rand;
			}
		}
		return null;
	}
	
	public static boolean isRandomInList(String name) {
		return getRandomFromString(name)!=null;
	}
}
