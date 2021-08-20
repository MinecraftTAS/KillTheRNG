package de.scribble.lp.killtherng.random2mixin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.objectweb.asm.Opcodes;

import de.scribble.lp.killtherng.URTools;
import de.scribble.lp.killtherng.custom.CustomRandom;

public class Csv2Mixin {
	
	private static File dir=new File("./src/main");
	
	private static File dirKTRNG;
	
	private static FileOutputStream urStream;
	
	private static FileOutputStream mixinStream;
	
	private static FileOutputStream mixinConfigStream;
	
	private static String prevClassName;

	public static void main(String[] args) {
		
		dirKTRNG=new File(dir, "java/de/scribble/lp/killtherng/mixin");
		
		//Loading in the file
		File logfile=new File("./ktrng","Randomness 1.12.2 extreme - Oh no.csv");
		
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
			startUltimateRandomnessFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//process lines
		for (String line :lines) {
			if(line.startsWith("Recognisable")) continue;
			String[] split = line.split(",");
			
			String name=split[0];
			String description=split[1];
			String qualName=split[2];
			String target=split[3];
			String ordinal=split[4];
			int classAccess=Integer.parseInt(split[5].replaceFirst("0x", ""), 16);
			int methodAccess=Integer.parseInt(split[6].replaceFirst("0x", ""), 16);
			
			String className=getClassName(qualName);
			String className2=getClassPath(qualName);
			String methodName=getMethodName(qualName);
			RandomType targetType=getTargetName(target);
			
			addRandomnessUR(name, description);
			
			if(!className.equals(prevClassName)) {
				try {
					switchClassFileMixin(className, className2, classAccess);
					addToMixinConfig(className);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				prevClassName=className;
			}
			
			try {
				addRedirect(methodName, ordinal, targetType, name, methodAccess, description);
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

	private static void closeMixinConf() throws IOException{
		writeLineMixinConf("\t]\n}");
	}


	private static void addToMixinConfig(String className) throws IOException {
		writeLineMixinConf("\t\"Mixin"+className+"\",");
	}


	private static void addRedirect(String methodName, String ordinal, RandomType targetType,
			String name, int methodAccess, String description) throws IOException {
		writeLineMixin("\t/**\n"
				+ "\t* "+description+"\n"
						+ "\t*/");
		switch (targetType) {
		case Int:
			addIntRedirect(methodName, ordinal, name, methodAccess);
			break;
		case IntBound:
			addIntBoundRedirect(methodName, ordinal, name, methodAccess);
			break;
		case Float:
			addFloatRedirect(methodName, ordinal, name, methodAccess);
			break;
		case Double:
			addDoubleRedirect(methodName, ordinal, name, methodAccess);
			break;
		case Boolean:
			addBooleanRedirect(methodName, ordinal, name, methodAccess);
			break;
		case Bytes:
			addBytesRedirect(methodName, ordinal, name, methodAccess);
			break;
		case Gaussian:
			addGaussianRedirect(methodName, ordinal, name, methodAccess);
			break;
		case Long:
			addLongRedirect(methodName, ordinal, name, methodAccess);
			break;
		case SetSeed:
			addSetSeedRedirect(methodName, ordinal, name, methodAccess);
			break;
		}
	}

	private static void addIntRedirect(String methodName, String ordinal, String name, int methodAccess) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextInt()I\", ordinal = %s))", methodName, ordinal));
		writeLineMixin(String.format("\t%s int redirect_%s_%s(Random rand) {", getAccess(methodAccess, methodName), name, ordinal));
		writeLineMixin(String.format("\t\treturn KillTheRNG.randomness.%s.nextInt();", name));
		writeLineMixin("\t}\n");
	}


	private static void addIntBoundRedirect(String methodName, String ordinal, String name, int methodAccess) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextInt(I)I\", ordinal = %s))", methodName, ordinal));
		writeLineMixin(String.format("\t%s int redirect_%s_%s(Random rand, int i) {", getAccess(methodAccess, methodName), name, ordinal));
		writeLineMixin(String.format("\t\treturn KillTheRNG.randomness.%s.nextInt(i);", name));
		writeLineMixin("\t}\n");
	}
	
	private static void addDoubleRedirect(String methodName, String ordinal, String name, int methodAccess) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextDouble()D\", ordinal = %s))", methodName, ordinal));
		writeLineMixin(String.format("\t%s double redirect_%s_%s(Random rand) {", getAccess(methodAccess, methodName), name, ordinal));
		writeLineMixin(String.format("\t\treturn KillTheRNG.randomness.%s.nextDouble();", name));
		writeLineMixin("\t}\n");
	}

	private static void addFloatRedirect(String methodName, String ordinal, String name, int methodAccess) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextFloat()F\", ordinal = %s))", methodName, ordinal));
		writeLineMixin(String.format("\t%s float redirect_%s_%s(Random rand) {", getAccess(methodAccess, methodName), name, ordinal));
		writeLineMixin(String.format("\t\treturn KillTheRNG.randomness.%s.nextFloat();", name));
		writeLineMixin("\t}\n");
	}

	private static void addBooleanRedirect(String methodName, String ordinal, String name, int methodAccess) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextBoolean()Z\", ordinal = %s))", methodName, ordinal));
		writeLineMixin(String.format("\t%s boolean redirect_%s_%s(Random rand) {", getAccess(methodAccess, methodName), name, ordinal));
		writeLineMixin(String.format("\t\treturn KillTheRNG.randomness.%s.nextBoolean();", name));
		writeLineMixin("\t}\n");
	}
	
	private static void addBytesRedirect(String methodName, String ordinal, String name, int methodAccess) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextBytes([B)V\", ordinal = %s))", methodName, ordinal));
		writeLineMixin(String.format("\t%s void redirect_%s_%s(Random rand, byte[] bytes) {", getAccess(methodAccess, methodName), name, ordinal));
		writeLineMixin(String.format("\t\tKillTheRNG.randomness.%s.nextBytes(bytes);", name));
		writeLineMixin("\t}\n");
	}

	private static void addGaussianRedirect(String methodName, String ordinal, String name, int methodAccess) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextGaussian()D\", ordinal = %s))", methodName, ordinal));
		writeLineMixin(String.format("\t%s double redirect_%s_%s(Random rand) {", getAccess(methodAccess, methodName), name, ordinal));
		writeLineMixin(String.format("\t\treturn KillTheRNG.randomness.%s.nextGaussian();", name));
		writeLineMixin("\t}\n");
	}
	
	private static void addLongRedirect(String methodName, String ordinal, String name, int methodAccess) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextLong()J\", ordinal = %s))", methodName, ordinal));
		writeLineMixin(String.format("\t%s long redirect_%s_%s(Random rand) {", getAccess(methodAccess, methodName), name, ordinal));
		writeLineMixin(String.format("\t\treturn KillTheRNG.randomness.%s.nextLong();", name));
		writeLineMixin("\t}\n");
	}
	
	private static void addSetSeedRedirect(String methodName, String ordinal, String name, int methodAccess) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;setSeed(J)V\", ordinal = %s))", methodName, ordinal));
		writeLineMixin(String.format("\t%s void redirect_%s_%s(Random rand, long unused) {", getAccess(methodAccess, methodName), name, ordinal));
		writeLineMixin("\t}\n");
	}
	
	private static String getAccess(int methodAccess, String methodName) {
		if((methodAccess|Opcodes.ACC_STATIC)==methodAccess) {
			return "private static";
		}else {
			return "public";
		}
	}
	
	private static void switchClassFileMixin(String className, String className2, int classAccess) throws IOException {
		if(mixinStream!=null) {
			writeLineMixin("}");
		}
		mixinStream=new FileOutputStream(new File(dirKTRNG, "Mixin"+className+".java"));
		writeLineMixin("package de.scribble.lp.killtherng.mixin;\n");
		writeLineMixin("import java.util.Random;\n");
		
		writeHardCodedImports(className);
		
		if(classAccess==0x30||classAccess==0x20||classAccess==0x420) {
			writeLineMixin("@Mixin(targets=\""+className2+"\")");
		}else {
			writeLineMixin("@Mixin("+className.replace("$", ".")+".class)");
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

	private static void addRandomnessUR(String name, String description) {
		try {
			if(!URTools.isRandomInList(name)) {
				new CustomRandom(name, description);
				writeLineUR(String.format("public CustomRandom %s=new CustomRandom(\"%s\", \"%s\");", name, name, description));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void startUltimateRandomnessFile() throws IOException, FileNotFoundException {
		urStream=new FileOutputStream(new File(dir, "java/de/scribble/lp/killtherng/UltimateRandomness.java"));
		writeLineUR("package de.scribble.lp.killtherng;\n");
		writeLineUR("import de.scribble.lp.killtherng.custom.CustomRandom;\n");
		writeLineUR("public class UltimateRandomness {\n");
		
		startMixinConfig();
	}


	private static void startMixinConfig() throws IOException {
		mixinConfigStream=new FileOutputStream(new File(dir, "resources/mixins.killtherng.json"));
		writeLineMixinConf("{\r\n" + 
				"  \"required\": true,\n" + 
				"  \"minVersion\": \"0.7.10\",\n" + 
				"  \"package\": \"de.scribble.lp.killtherng.mixin\",\n" + 
				"  \"refmap\": \"mixins.killtherng.refmap.json\",\n" + 
				"  \"compatibilityLevel\": \"JAVA_8\",\n" + 
				"  \"mixins\": [");
	}


	private static RandomType getTargetName(String target) {
		String method=target.split(";")[1];
		if(method.equals("nextInt()I")) return RandomType.Int;
		if(method.equals("nextInt(I)I")) return RandomType.IntBound;
		if(method.equals("nextFloat()F")) return RandomType.Float;
		if(method.equals("nextDouble()D")) return RandomType.Double;
		if(method.equals("nextBoolean()Z")) return RandomType.Boolean;
		if(method.equals("nextBytes([B)V")) return RandomType.Bytes;
		if(method.equals("nextGaussian()D")) return RandomType.Gaussian;
		if(method.equals("nextLong()J")) return RandomType.Long;
		if(method.equals("setSeed(J)V")) return RandomType.SetSeed;
		return null;
	}

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

	private static String getClassPath(String qualName) {
		String[] split = qualName.split(";",2);
		String first = split[0].replace("/", ".");
		String replaced=first.replaceFirst("L", "");
		return replaced;
	}
	
	private enum RandomType{
		Int,
		IntBound,
		Float,
		Double,
		Boolean,
		Bytes,
		Gaussian,
		Long,
		SetSeed
	}
	
	private static void writeLineUR(String line) throws IOException {
		line=line+"\n";
		urStream.write(line.getBytes());
	}
	
	private static void writeLineMixin(String line) throws IOException {
		line=line+"\n";
		mixinStream.write(line.getBytes());
	}
	
	private static void writeLineMixinConf(String line) throws IOException {
		line=line+"\n";
		mixinConfigStream.write(line.getBytes());
	}
	
}
