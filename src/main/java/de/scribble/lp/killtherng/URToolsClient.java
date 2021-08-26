package de.scribble.lp.killtherng;

import de.scribble.lp.killtherng.custom.CustomRandom;

public class URToolsClient {
	public static CustomRandom getRandomFromString(String name) {
		for(CustomRandom rand: CustomRandom.LIST) {
			if(rand.getName().equalsIgnoreCase(name)) {
				return rand;
			}
		}
		return null;
	}
	
	public static void setSeedAll(long seed) {
		CustomRandom.LIST.forEach(rand->{
			if(rand.getName().equals("Global")) return;
			rand.setSeed(seed);
		});
	}
	
	public static boolean isRandomInList(String name) {
		return getRandomFromString(name)!=null;
	}
	
	public static String[] getNames() {
		String[] out=new String[CustomRandom.LIST.size()];
		for (int i = 0; i < out.length; i++) {
			out[i]=CustomRandom.LIST.get(i).getName();
		}
		return out;
	}
	
	public static void nextSeed() {
		setSeedAll(KillTheRNG.randomness.Global.nextLong());
	}
}
