package de.scribble.lp.killtherng.random2mixin.csv2mixin;

public class RandomnessMixinData {

	public String name;
	public String description;
	public String qualName;
	public String target;
	public String ordinal;
	public int classAccess;
	public int methodAccess;
	public boolean remap;
	public boolean enabled;
	public boolean client;
	public String className;
	public String classNameWithPath;
	public String methodName;
	
	public RandomnessMixinData(String name, String description, String qualName, String target, String ordinal, int classAccess, int methodAccess, boolean remap, boolean enabled, boolean client, String className, String classNameWithPath, String methodName) {
		this.name = name;
		this.description = description;
		this.qualName = qualName;
		this.target = target;
		this.ordinal = ordinal;
		this.classAccess = classAccess;
		this.methodAccess = methodAccess;
		this.remap = remap;
		this.enabled = enabled;
		this.client = client;
		this.className = className;
		this.classNameWithPath = classNameWithPath;
		this.methodName = methodName;
	}
	
	@Override
	public String toString() {
		String out = name+", " + description+ " " + (client?"[CLIENT]":"[SERVER]");
		return out;
	}

}
