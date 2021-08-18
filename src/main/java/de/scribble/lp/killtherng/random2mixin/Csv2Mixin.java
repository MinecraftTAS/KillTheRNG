package de.scribble.lp.killtherng.random2mixin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;

public class Csv2Mixin {
	
	private static File dir=new File("./ktrng");
	
	private static File dirKTRNG;
	
	private static FileOutputStream urStream;
	
	private static FileOutputStream mixinStream;
	
	private static String prevClassName;

	public static void main(String[] args) {
		//Creating the directory
		if (!dir.exists()) {
			dir.mkdir();
		}
		dirKTRNG=new File(dir, "mixin");
		if(!dirKTRNG.exists()) {
			dirKTRNG.mkdir();
		}
		
		//Loading in the file
		File logfile=new File(dir,"log.csv");
		
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
			String qualName=split[1];
			String target=split[2];
			String description=split[3];
			String ordinal=split[4];
			
			String className=getClassName(qualName);
			String methodName=getMethodName(qualName);
			RandomType targetType=getTargetName(target);
			
			addRandomnessUR(name, description);
			
			if(!className.equals(prevClassName)) {
				try {
					switchClassFileMixin(className);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				prevClassName=className;
			}
			
			try {
				addRedirect(methodName, ordinal, targetType, name);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			writeLineMixin("}");
			writeLineUR("}");
			urStream.close();
			mixinStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	private static void addRedirect(String methodName, String ordinal, RandomType targetType,
			String name) throws IOException {
		switch (targetType) {
		case Int:
			addIntRedirect(methodName, ordinal, name);
			break;
		case IntBound:
			addIntBoundRedirect(methodName, ordinal, name);
		case Float:
			addFloatRedirect(methodName, ordinal, name);
			break;
		case Double:
			addDoubleRedirect(methodName, ordinal, name);
			break;
		case Boolean:
			addBooleanRedirect(methodName, ordinal, name);
			break;
		case Bytes:
			addBytesRedirect(methodName, ordinal, name);
			break;
		case Gaussian:
			addGaussianRedirect(methodName, ordinal, name);
			break;
		case Long:
			addLongRedirect(methodName, ordinal, name);
			break;
		case SetSeed:
			addSetSeedRedirect(methodName, ordinal, name);
			break;
		}
	}

	private static void addIntRedirect(String methodName, String ordinal, String name) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextInt()I\", ordinal = %s))", methodName, ordinal));
		writeLineMixin(String.format("\tpublic int redirect_%s(Random rand) {", name));
		writeLineMixin(String.format("\t\treturn KillTheRNG.randomness.%s.nextInt();", name));
		writeLineMixin("\t}\n");
	}

	private static void addIntBoundRedirect(String methodName, String ordinal, String name) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextInt(I)I\", ordinal = %s))", methodName, ordinal));
		writeLineMixin(String.format("\tpublic int redirect_%s(Random rand, int i) {", name));
		writeLineMixin(String.format("\t\treturn KillTheRNG.randomness.%s.nextInt(i);", name));
		writeLineMixin("\t}\n");
	}
	
	private static void addDoubleRedirect(String methodName, String ordinal, String name) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextDouble()D\", ordinal = %s))", methodName, ordinal));
		writeLineMixin(String.format("\tpublic double redirect_%s(Random rand) {", name));
		writeLineMixin(String.format("\t\treturn KillTheRNG.randomness.%s.nextDouble();", name));
		writeLineMixin("\t}\n");
	}

	private static void addFloatRedirect(String methodName, String ordinal, String name) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextFloat()F\", ordinal = %s))", methodName, ordinal));
		writeLineMixin(String.format("\tpublic float redirect_%s(Random rand) {", name));
		writeLineMixin(String.format("\t\treturn KillTheRNG.randomness.%s.nextFloat();", name));
		writeLineMixin("\t}\n");
	}

	private static void addBooleanRedirect(String methodName, String ordinal, String name) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextBoolean()Z\", ordinal = %s))", methodName, ordinal));
		writeLineMixin(String.format("\tpublic boolean redirect_%s(Random rand) {", name));
		writeLineMixin(String.format("\t\treturn KillTheRNG.randomness.%s.nextBoolean();", name));
		writeLineMixin("\t}\n");
	}
	
	private static void addBytesRedirect(String methodName, String ordinal, String name) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextBytes([B)V\", ordinal = %s))", methodName, ordinal));
		writeLineMixin(String.format("\tpublic void redirect_%s(Random rand, byte[] bytes) {", name));
		writeLineMixin(String.format("\t\tKillTheRNG.randomness.%s.nextBytes(bytes);", name));
		writeLineMixin("\t}\n");
	}

	private static void addGaussianRedirect(String methodName, String ordinal, String name) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextGaussian()D\", ordinal = %s))", methodName, ordinal));
		writeLineMixin(String.format("\tpublic double redirect_%s(Random rand) {", name));
		writeLineMixin(String.format("\t\treturn KillTheRNG.randomness.%s.nextGaussian();", name));
		writeLineMixin("\t}\n");
	}
	
	private static void addLongRedirect(String methodName, String ordinal, String name) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextLong()J\", ordinal = %s))", methodName, ordinal));
		writeLineMixin(String.format("\tpublic long redirect_%s(Random rand) {", name));
		writeLineMixin(String.format("\t\treturn KillTheRNG.randomness.%s.nextLong();", name));
		writeLineMixin("\t}\n");
	}
	
	private static void addSetSeedRedirect(String methodName, String ordinal, String name) throws IOException {
		writeLineMixin(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;setSeed(J)V\", ordinal = %s))", methodName, ordinal));
		writeLineMixin(String.format("\tpublic void redirect_%s(Random rand) {", name));
		writeLineMixin("\t}\n");
	}
	
	private static void switchClassFileMixin(String className) throws IOException {
		if(mixinStream!=null) {
			writeLineMixin("}");
		}
		mixinStream=new FileOutputStream(new File(dirKTRNG, "Mixin"+className+".java"));
		writeLineMixin("package de.scribble.lp.killtherng.mixin;\n");
		writeLineMixin("import java.util.Random;\n");
		writeLineMixin("@Mixin("+className.replace("$", ".")+".class)");
		writeLineMixin("public class Mixin"+className+" {");
	}


	private static void addRandomnessUR(String name, String description) {
		try {
			writeLineUR(String.format("public CustomRandom %s=new CustomRandom(\"%s\", \"%s\");", name, name, description));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void startUltimateRandomnessFile() throws IOException, FileNotFoundException {
		urStream=new FileOutputStream(new File(dir, "UltimateRandomness.java"));
		writeLineUR("package de.scribble.lp.killtherng;\n");
		writeLineUR("import de.scribble.lp.killtherng.custom.CustomRandom;\n");
		writeLineUR("public class UltimateRandomness {\n");
		
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
}
