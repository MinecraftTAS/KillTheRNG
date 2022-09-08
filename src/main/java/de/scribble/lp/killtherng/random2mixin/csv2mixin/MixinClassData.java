package de.scribble.lp.killtherng.random2mixin.csv2mixin;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class MixinClassData {
	
	public final List<MixinMethodData> randomData = new ArrayList<>();
	private String mixinPackage;
	private String mixinClassName;
	private String classNameWithPath;
	private String className;
	private int classAccess;
	
	public MixinClassData(String mixinPackage, String classNameWithPath, String className, int classAccess) {
		this.mixinPackage = mixinPackage;
		this.mixinClassName = "Mixin"+className;
		this.classNameWithPath = classNameWithPath;
		this.className = className;
		this.classAccess = classAccess;
	}

	public void add(MixinMethodData newData) {
		randomData.add(newData);
	}
	
	public MixinMethodData get(int i) {
		return randomData.get(i);
	}
	
	public void saveAs(File file, String randomnessvar) {
		File outFile = new File(file, mixinClassName+".java");
		String out= getClassString(randomnessvar);
		try {
			FileUtils.write(outFile, out, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public String toString() {
		String out = className+":\n";
		for(MixinMethodData data : randomData) {
			out=out.concat("\t"+data+"\n");
		}
		out=out.concat("==========================================================================");
		return out;
	}
	
	private String getClassString(String randomnessvar) {
		String out = String.format("package %s;\n"
				+ "import java.util.Random;\n"
				+ "\n"
				+ "import org.spongepowered.asm.mixin.Mixin;\n"
				+ "import org.spongepowered.asm.mixin.injection.At;\n"
				+ "import org.spongepowered.asm.mixin.injection.Redirect;\n"
				+ "\n"
				+ "@Mixin(%s)\n"
				+ "public class %s{\n"
				+ "\n"
				, mixinPackage, getMixinAnnotation(), mixinClassName);
		
		int i = 1;
		for(MixinMethodData data : randomData) {
			out=out.concat(data.toMethodString(randomnessvar, i)+"\n");
			i++;
		}
		out=out.concat("\n}");
		
		return out;
	}
	
	private String getMixinAnnotation() {
		if(classAccess==0x30||classAccess==0x20||classAccess==0x420) {
			return "targets=\""+classNameWithPath+"\"";
		} else {
			return classNameWithPath.replace("$", ".")+".class";
		}
	}
	
//	private static void writeStream(FileOutputStream stream, String line) {
//		line=line.concat("\n");
//		try {
//			stream.write(line.getBytes());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}
