package com.minecrafttas.killtherng.random2mixin.csv2mixin;

import java.util.List;

public class MixinClass {

	String classContent;
	
	public MixinClass(String classPackage, String className, List<MixinMethodData> classData) {
		classContent = createClass(classPackage, className, classData);
	}

	private String createClass(String classPackage, String className, List<MixinMethodData> classData) {
		// Start
		String out=String.format("%s\n"
				+ "import java.util.Random;\n"
				+ "\n"
				+ "import org.spongepowered.asm.mixin.Mixin;\n"
				+ "import org.spongepowered.asm.mixin.injection.At;\n"
				+ "import org.spongepowered.asm.mixin.injection.Redirect;\n"
				+ "\n"
				+ "import de.scribble.lp.killtherng.KillTheRNG;\n"
				+ "\n" //TODO Add import for class e.g. net.minecraft.world.biome.Biome
				+ "\n"
				, classPackage);
		
		
		return out;
	}
	
//	private String writeMixinTag(int classAccess) {
//		if(classAccess==0x30||classAccess==0x20||classAccess==0x420) {
//			writeLineMixin("@Mixin(targets=\""+className2+"\")");
//		}else {
//			if(client) {
//				writeLineMixin("@Mixin("+className.replace("$", ".").replace("2", "")+".class)");
//			}else {
//				writeLineMixin("@Mixin("+className.replace("$", ".")+".class)");
//			}
//			
//		}
//	}
	
}
