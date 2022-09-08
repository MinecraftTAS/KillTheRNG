package de.scribble.lp.killtherng.random2mixin.csv2mixin;

import org.objectweb.asm.Opcodes;

public class MixinMethodData {

	public String name;
	public String description;
	public String qualName;
	public String target;
	public String ordinal;
	public int classAccess;
	public int methodAccess;
	public String remap;
	public boolean remapbool;
	public boolean enabled;
	public boolean client;
	public String className;
	public String classNameWithPath;
	public String methodName;
	public boolean staticmethod;
	public RandomType type;
	
	public enum RandomType{
		Int("Ljava/util/Random;nextInt()I"),
		IntBound("Ljava/util/Random;nextInt(I)I"),
		Float("Ljava/util/Random;nextFloat()F"),
		Double("Ljava/util/Random;nextDouble()D"),
		Boolean("Ljava/util/Random;nextBoolean()Z"),
		Bytes("Ljava/util/Random;nextBytes([B)V"),
		Gaussian("Ljava/util/Random;nextGaussian()D"),
		Long("Ljava/util/Random;nextLong()J"),
		SetSeed("Ljava/util/Random;setSeed(J)V"),
		Math("Ljava/lang/Math;random()D");
		
		private String identifier;
		
		RandomType(String merkmal) {
			this.identifier=merkmal;
		}
		
		private static RandomType fromString(String typeString){
			for(RandomType type : values()) {
				if(type.identifier.equals(typeString)) {
					return type;
				}
			}
			return null;
		}
	}
	
	public MixinMethodData(String name, String description, String qualName, String target, String ordinal, int classAccess, int methodAccess, boolean remap, boolean enabled, boolean client, String className, String classNameWithPath, String methodName, boolean staticmethod) {
		this.name = name;
		this.description = description;
		this.qualName = qualName;
		this.target = target;
		this.ordinal = ordinal;
		this.classAccess = classAccess;
		this.methodAccess = methodAccess;
		this.remapbool = remap;
		this.remap = remap ? ", remap = false" : "";
		this.enabled = enabled;
		this.client = client;
		this.className = className;
		this.classNameWithPath = classNameWithPath;
		this.methodName = methodName;
		this.type = RandomType.fromString(target); 
		this.staticmethod = staticmethod;
	}
	
	@Override
	public String toString() {
		String out = name+", " + description+ " " + (client?"[CLIENT]":"[SERVER]");
		return out;
	}

	public String toMethodString(String ktrngvariable, int counter) {
		String out = "";
		
		out=out.concat("\t/**\n"
				+ "\t* "+description+"\n"
				+ "\t*/\n");
		
		if (type == RandomType.Int) {
			out=out.concat(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextInt()I\", ordinal = %s)%s)\n", methodName, ordinal, remap));
			out=out.concat(String.format("\t%s int redirect_%s_%s(Random rand) {\n", methodAccess(), name, counter));
			
			out=out.concat(String.format("\t\tif (%s.%s.isEnabled()) {\n", ktrngvariable, name));
			out=out.concat(String.format("\t\t\treturn %s.%s.nextInt();\n", ktrngvariable, name));
			out=out.concat("\t\t} else {\n");
			out=out.concat(String.format("\t\t\t%s.%s.nextInt();\n", ktrngvariable, name));
			out=out.concat(String.format("\t\t\treturn rand.nextInt();\n"));
			out=out.concat("\t\t}\n");
			out=out.concat("\t}\n");
		} else if(type == RandomType.IntBound){
			out=out.concat(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextInt(I)I\", ordinal = %s)%s)\n", methodName, ordinal, remap));
			out=out.concat(String.format("\t%s int redirect_%s_%s(Random rand, int i) {\n", methodAccess(), name, counter));
			out=out.concat(String.format("\t\tif (%s.%s.isEnabled()) {\n", ktrngvariable, name));
			out=out.concat(String.format("\t\t\treturn %s.%s.nextInt(i);\n", ktrngvariable, name));
			out=out.concat("\t\t} else {\n");
			out=out.concat(String.format("\t\t\t%s.%s.nextInt(i);\n", ktrngvariable, name));
			out=out.concat(String.format("\t\t\treturn rand.nextInt(i);\n"));
			out=out.concat("\t\t}\n");
			out=out.concat("\t}\n");
		} else if(type == RandomType.Double) {
			out=out.concat(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextDouble()D\", ordinal = %s)%s)\n", methodName, ordinal, remap));
			out=out.concat(String.format("\t%s double redirect_%s_%s(Random rand) {\n", methodAccess(), name, counter));
			out=out.concat(String.format("\t\tif (%s.%s.isEnabled()) {\n", ktrngvariable, name));
			out=out.concat(String.format("\t\t\treturn %s.%s.nextDouble();\n", ktrngvariable, name));
			out=out.concat("\t\t} else {\n");
			out=out.concat(String.format("\t\t\t%s.%s.nextDouble();\n", ktrngvariable, name));
			out=out.concat(String.format("\t\t\treturn rand.nextDouble();\n", !enabled ? "" : "//"));
			out=out.concat("\t\t}\n");
			out=out.concat("\t}\n");
		} else if(type == RandomType.Float) {
			out=out.concat(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextFloat()F\", ordinal = %s)%s)\n", methodName, ordinal, remap));
			out=out.concat(String.format("\t%s float redirect_%s_%s(Random rand) {\n", methodAccess(), name, counter));
			out=out.concat(String.format("\t\tif (%s.%s.isEnabled()) {\n", ktrngvariable, name));
			out=out.concat(String.format("\t\t\treturn %s.%s.nextFloat();\n", ktrngvariable, name));
			out=out.concat("\t\t} else {\n");   
			out=out.concat(String.format("\t\t\t%s.%s.nextFloat();\n", ktrngvariable, name));
			out=out.concat(String.format("\t\t\treturn rand.nextFloat();\n"));
			out=out.concat("\t\t}\n");
			out=out.concat("\t}\n");
		} else if(type == RandomType.Boolean) {
			out=out.concat(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextBoolean()Z\", ordinal = %s)%s)\n", methodName, ordinal, remap));
			out=out.concat(String.format("\t%s boolean redirect_%s_%s(Random rand) {\n", methodAccess(), name, counter));
			out=out.concat(String.format("\t\tif (%s.%s.isEnabled()) {\n", ktrngvariable, name));
			out=out.concat(String.format("\t\t\treturn %s.%s.nextBoolean();\n", ktrngvariable, name));
			out=out.concat("\t\t} else {\n");
			out=out.concat(String.format("\t\t\t%s.%s.nextBoolean();\n", ktrngvariable, name));
			out=out.concat(String.format("\t\t\treturn rand.nextBoolean();\n"));
			out=out.concat("\t\t}\n");
			out=out.concat("\t}\n");
		} else if(type == RandomType.Bytes) {
			out=out.concat(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextBytes([B)V\", ordinal = %s)%s)\n", methodName, ordinal, remap));
			out=out.concat(String.format("\t%s void redirect_%s_%s(Random rand, byte[] bytes) {\n", methodAccess(), name, counter));
			out=out.concat(String.format("\t\tif (%s.%s.isEnabled()) {\n", ktrngvariable, name));
			out=out.concat(String.format("\t\t\t%s.%s.nextBytes(bytes);\n", ktrngvariable, name));
			out=out.concat("\t\t} else {\n");
			out=out.concat(String.format("\t\t\t%s.%s.nextBytes(bytes);\n", ktrngvariable, name));
			out=out.concat(String.format("\t\t\trand.nextBytes(bytes);\n"));
			out=out.concat("\t\t}\n");
			out=out.concat("\t}\n");
		} else if(type == RandomType.Gaussian) {
			out=out.concat(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextGaussian()D\", ordinal = %s)%s)\n", methodName, ordinal, remap));
			out=out.concat(String.format("\t%s double redirect_%s_%s(Random rand) {\n", methodAccess(), name, counter));
			out=out.concat(String.format("\t\tif (%s.%s.isEnabled()) {\n", ktrngvariable, name));
			out=out.concat(String.format("\t\t\treturn %s.%s.nextGaussian();\n", ktrngvariable, name));
			out=out.concat("\t\t} else {\n");
			out=out.concat(String.format("\t\t\t%s.%s.nextGaussian();\n", ktrngvariable, name));
			out=out.concat(String.format("\t\t\treturn rand.nextGaussian();\n"));
			out=out.concat("\t\t}\n");
			out=out.concat("\t}\n");
		} else if(type == RandomType.Long) {
			out=out.concat(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;nextLong()J\", ordinal = %s)%s)\n", methodName, ordinal, remap));
			out=out.concat(String.format("\t%s long redirect_%s_%s(Random rand) {\n", methodAccess(), name, counter));
			out=out.concat(String.format("\t\tif (%s.%s.isEnabled()) {\n", ktrngvariable, name));
			out=out.concat(String.format("\t\t\treturn %s.%s.nextLong();\n", ktrngvariable, name));
			out=out.concat("\t\t} else {\n");
			out=out.concat(String.format("\t\t\t\t%s.%s.nextLong();\n", ktrngvariable, name));
			out=out.concat(String.format("\t\t\t\treturn rand.nextLong();\n"));
			out=out.concat("\t\t}\n");
			out=out.concat("\t}\n");
		} else if(type == RandomType.SetSeed) {
			out=out.concat(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/util/Random;setSeed(J)V\", ordinal = %s)%s)\n", methodName, ordinal, remap));
			out=out.concat(String.format("\t%s void redirect_%s_%s(Random rand, long seed) {\n", methodAccess(), name, counter));
			out=out.concat(String.format("\t\tif (%s.%s.isEnabled()) {\n", ktrngvariable, name));
			out=out.concat(String.format("\t\t\t%s.%s.setSeed(seed, true);", ktrngvariable, name));
			out=out.concat("\t\t} else {\n");
			out=out.concat(String.format("\t\t\trand.setSeed(seed);\n"));
			out=out.concat("\t\t}\n");
			out=out.concat("\t}\n");
		} else if(type == RandomType.Math) {
			out=out.concat(String.format("\t@Redirect(method = \"%s\", at = @At(value = \"INVOKE\", target = \"Ljava/lang/Math;random()D\", ordinal = %s)%s)\n", methodName, ordinal, remap));
			out=out.concat(String.format("\t%s double redirect_%s_%s() {\n", methodAccess(), name, counter));
			out=out.concat(String.format("\t\tif (%s.%s.isEnabled()) {\n", ktrngvariable, name));
			out=out.concat(String.format("\t\t\treturn %s.%s.nextDouble();\n", ktrngvariable, name));
			out=out.concat("\t\t} else {\n");
			out=out.concat(String.format("\t\t\t%s.%s.nextDouble();\n", ktrngvariable, name));
			out=out.concat(String.format("\t\t\treturn Math.random();\n"));
			out=out.concat("\t\t}\n");
			out=out.concat("\t}\n");
		}
		return out;
	}
	
	private String methodAccess() {
		if((methodAccess|Opcodes.ACC_STATIC)==methodAccess||staticmethod) {
			return "private static";
		}else {
			return "public";
		}
	}
}
