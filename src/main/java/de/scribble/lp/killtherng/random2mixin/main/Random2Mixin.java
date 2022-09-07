package de.scribble.lp.killtherng.random2mixin.main;

import java.util.Map;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

public class Random2Mixin implements IFMLLoadingPlugin{

	@Override
	public String[] getASMTransformerClass() {
		String[] out=null;
//		out=new String[] {"de.scribble.lp.killtherng.random2mixin.Transformer"};
		return out;
	}

	@Override
	public String getModContainerClass() {
		return null;
	}

	@Override
	public String getSetupClass() {
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) {
		
	}

	@Override
	public String getAccessTransformerClass() {
		return null;
	}

}
