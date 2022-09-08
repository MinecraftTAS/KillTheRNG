package de.scribble.lp.killtherng.random2mixin.csv2mixin;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class MixinConfig {

	private File outfile;
	
	private List<String> client = new ArrayList<>();
	private List<String> common = new ArrayList<>();
	
	public MixinConfig(File file) {
		outfile=file;
	}

	public void addToClient(MixinClassData data) {
		String packages = data.getMixinPackage().replace("de.scribble.lp.killtherng.mixin.", "");
		client.add(packages+"."+data.getMixinClassName());
	}
	
	public void addToCommon(MixinClassData data) {
		String packages = data.getMixinPackage().replace("de.scribble.lp.killtherng.mixin.", "");
		common.add(packages+"."+data.getMixinClassName());
	}
	
	public void save() {
		String out="{\n" 
				+ "  \"required\": true,\n" 
				+ "  \"minVersion\": \"0.7.10\",\n"
				+ "  \"package\": \"de.scribble.lp.killtherng.mixin\",\n"
				+ "  \"refmap\": \"mixins.killtherng.refmap.json\",\n" + "  \"compatibilityLevel\": \"JAVA_8\",\n"
				+ "  \"mixins\": [\n"
				+ "\t\"ktrng.MixinPlayerList\",\n"
				+ "\t\"ktrng.MixinMinecraftServer\",\n\n";
		
		for (int i = 0; i < common.size(); i++) {
			String commonstring = common.get(i);
			out = out.concat("\t\"" + commonstring + "\""+ (common.size()-1==i ? "" : ",")+"\n");
		}
		out = out.concat("  ],\n"
				+ "  \"client\": [\n"
				+ "\t\"ktrng.MixinMinecraft\",\n"
				+ "\t\"ktrng.MixinGuiMainMenu\",\n\n");
		
		for (int i = 0; i < client.size(); i++) {
			String clientstring = client.get(i);
			out = out.concat("\t\"" + clientstring + "\""+ (client.size()-1==i ? "" : ",")+"\n");
		}
		out = out.concat("\n\t]\n}\n");
		
		try {
			FileUtils.write(outfile, out, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
