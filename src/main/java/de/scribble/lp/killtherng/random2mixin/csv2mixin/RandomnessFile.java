package de.scribble.lp.killtherng.random2mixin.csv2mixin;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class RandomnessFile {
	
	private ArrayList<RandomData> data = new ArrayList<>();
	
	public RandomnessFile(Map<String, MixinClassData> data) {
		for(MixinClassData classData : data.values()) {
			for(MixinMethodData methodData : classData.randomData) {
				addToList(methodData.name, methodData.description, methodData.enabled, methodData.client);
			}
		}
	}
	
	public void addToList(String name, String description, boolean enabled, boolean client) {
		addToList(data.size(), name, description, enabled, client);
	}
	
	public void addToList(int index, String name, String description, boolean enabled, boolean client) {
		RandomData newData = new RandomData(name, description, enabled, client);
		if(!data.contains(newData)) {
			data.add(index, newData);
		}
	}
	
	public void saveAs(File file, String packagename) {
		String out = "package "+packagename+";\n\n"
				+ "import de.scribble.lp.killtherng.custom.CustomRandom;\n\n"
				+ "public class "+file.getName().replace(".java", "")+" extends UltimateRandomness {\n\n";
		
		for(RandomData oneData : data) {
			out = out.concat(String.format("\tpublic CustomRandom %s = registerRandom(\"%s\", \"%s\", %b, %b);\n", oneData.name, oneData.name, oneData.description, oneData.enabled, oneData.client));
		}
		
		out = out.concat("}\n");
		
		try {
			FileUtils.write(file, out, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private class RandomData{
		private String name;
		private String description;
		private boolean enabled;
		private boolean client;
		
		public RandomData(String name, String description, boolean enabled, boolean client) {
			this.name = name;
			this.description = description;
			this.enabled = enabled;
			this.client = client;
		}
		
		@SuppressWarnings("unchecked")
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof RandomData) {
				RandomData data = (RandomData) obj;
				return name.equals(data.name);
			}else {
				return super.equals(obj);
			}
		}
	}
}
