package de.scribble.lp.killtherng;

import de.scribble.lp.killtherng.custom.CustomRandom;

@Deprecated
public class URToolsClient {
	
	public static void setSeedAll(long seed) {
		KillTheRNG.clientRandom.REGISTRY.forEach((name, rand)->{
			rand.setSeed(seed);
		});
	}

	public static CustomRandom getRandom(String name) {
		CustomRandom rand = KillTheRNG.clientRandom.REGISTRY.get(name);
		if(rand!=null) {
			return rand;
		}else {
			return null;
		}
	}
	
	public static String[] getNames() {
		return (String[]) KillTheRNG.clientRandom.REGISTRY.keySet().toArray();
	}

	public static long nextSeed() {
		return nextSeed(1);
	}
	
	public static long nextSeed(int step) {
		//Advancing global variable
		KillTheRNG.clientRandom.GlobalClient.advance(step);
		//Getting the seed of the global variable
		long seed=KillTheRNG.clientRandom.GlobalClient.getSeed();
		//Setting the seed for every other global variable
		KillTheRNG.clientRandom.REGISTRY.forEach((name, rand)->{
			if(rand.getName().equals("Global"))return;
			rand.setSeed(seed, false);
		});
		return seed;
	}
}
