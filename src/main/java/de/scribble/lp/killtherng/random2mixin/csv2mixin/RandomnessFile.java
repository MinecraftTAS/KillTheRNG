package de.scribble.lp.killtherng.random2mixin.csv2mixin;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RandomnessFile {
	
	private String className;
	
	private List<Tri<String, String, Boolean>> tris = new ArrayList<>();
	
	public RandomnessFile(String className, String packageName, Map<String, MixinClassData> data) {
		this.className = className;
		for(MixinClassData classData : data.values()) {
			for(MixinMethodData methodData : classData.randomData) {
				tris.add(new Tri<String, String, Boolean>(methodData.className, methodData.description, methodData.enabled));
			}
		}
	}
	
	public void addToList(String name, String description, boolean enabled) {
		tris.add(new Tri<String, String, Boolean>(name, description, enabled));
	}
	
	public void saveAs(File file) {
	}
	
	private class Tri<L, M, R>{
		L left;
		M middle;
		R right;
		
		public Tri(L left, M middle, R right) {
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
	}
}
