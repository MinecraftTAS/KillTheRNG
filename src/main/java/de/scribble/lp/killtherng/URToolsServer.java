package de.scribble.lp.killtherng;

import de.scribble.lp.killtherng.custom.CustomRandom;
import de.scribble.lp.killtherng.exceptions.RandomNotFoundException;
@Deprecated
public class URToolsServer {
	
	public static void setSeedAll(long seed) {
		KillTheRNG.commonRandom.REGISTRY.forEach((name, rand)->{
			rand.setSeed(seed);
		});
	}
	
	public static CustomRandom getRandom(String name) throws RandomNotFoundException {
		CustomRandom rand = KillTheRNG.commonRandom.REGISTRY.get(name);
		if(rand!=null) {
			return rand;
		}else {
			throw new RandomNotFoundException("The random "+name+" was not found");
		}
	}
	
	public static String[] getNames() {
		return (String[]) KillTheRNG.commonRandom.REGISTRY.keySet().toArray();
	}
	
	public static long nextSeed() {
		return nextSeed(1);
	}
	
	public static long nextSeed(int step) {
		//Advancing global variable
		KillTheRNG.commonRandom.GlobalServer.advance(step);
		//Getting the seed of the global variable
		long seed=KillTheRNG.commonRandom.GlobalServer.getSeed();
		//Setting the seed for every other global variable
		KillTheRNG.commonRandom.REGISTRY.forEach((name, rand)->{
			if(rand.getName().equals("Global"))return;
			rand.setSeed(seed, false);
		});
		return seed;
	}
	
}
