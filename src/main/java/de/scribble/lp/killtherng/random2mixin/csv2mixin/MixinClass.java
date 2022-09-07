package de.scribble.lp.killtherng.random2mixin.csv2mixin;

import java.io.IOException;
import java.util.List;

public class MixinClass {

	String classContent;
	
	public MixinClass(String classPackage, String className, List<RandomnessMixinData> classData) {
		classContent = createClass(classPackage, className, classData);
	}

	private String createClass(String classPackage, String className, List<RandomnessMixinData> classData) {
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
	
}
