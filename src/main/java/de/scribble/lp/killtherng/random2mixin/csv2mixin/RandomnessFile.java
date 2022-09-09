package de.scribble.lp.killtherng.random2mixin.csv2mixin;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class RandomnessFile {
	
	private ArrayList<TriSet<String, String, Boolean>> tris = new ArrayList<>();
	
	public RandomnessFile(Map<String, MixinClassData> data) {
		for(MixinClassData classData : data.values()) {
			for(MixinMethodData methodData : classData.randomData) {
				addToList(methodData.name, methodData.description, methodData.enabled);
			}
		}
	}
	
	public void addToList(String name, String description, boolean enabled) {
		addToList(tris.size(), name, description, enabled);
	}
	
	public void addToList(int index, String name, String description, boolean enabled) {
		TriSet<String, String, Boolean> newTri = new TriSet<String, String, Boolean>(name, description, enabled);
		if(!tris.contains(newTri)) {
			tris.add(index, newTri);
		}
	}
	
	public void saveAs(File file, String packagename) {
		String out = "package "+packagename+";\n\n"
				+ "import de.scribble.lp.killtherng.custom.CustomRandom;\n"
				+ "import java.util.HashMap;\n\n"
				+ "public class "+file.getName().replace(".java", "")+" {\n\n"
				+ "\tprivate HashMap<String, CustomRandom> REGISTRY = new HashMap<>();\n\n"
				+ "\tprivate CustomRandom registerRandom(String name, String description, boolean enabled) {\n"
				+ "\t\tCustomRandom newRandom = new CustomRandom(name, description, enabled);\n"
				+ "\t\tREGISTRY.put(name, newRandom);\n"
				+ "\t\treturn newRandom;\n"
				+ "\t}\n\n";
		
		for(TriSet<String, String, Boolean> tri : tris) {
			out = out.concat(String.format("\tpublic CustomRandom %s = registerRandom(\"%s\", \"%s\", %b);\n", tri.getLeft(), tri.getLeft(), tri.getMiddle(), tri.getRight()));
		}
		
		out = out.concat("}\n");
		
		try {
			FileUtils.write(file, out, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public class TriSet<L, M, R>{
		L left;
		M middle;
		R right;
		
		public TriSet(L left, M middle, R right) {
			this.left = left;
			this.middle = middle;
			this.right = right;
		}
		
		public L getLeft() {
			return left;
		}
		
		public M getMiddle() {
			return middle;
		}
		
		public R getRight() {
			return right;
		}
		
		@SuppressWarnings("unchecked")
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof TriSet<?, ?, ?>) {
				TriSet<L, M, R> tri = (TriSet<L, M, R>) obj;
				return left.equals(tri.getLeft());
			}else {
				return super.equals(obj);
			}
		}
	}
}
