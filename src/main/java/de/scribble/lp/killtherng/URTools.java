package de.scribble.lp.killtherng;

import java.util.Set;

import de.scribble.lp.killtherng.custom.CustomRandom;

@Deprecated
public class URTools {
	
	public static CustomRandom getRandom(String randomName) {
		CustomRandom random = KillTheRNG.commonRandom.REGISTRY.get(randomName);
		if(random!=null) {
			return random;
		}else {
			return KillTheRNG.clientRandom.REGISTRY.get(randomName);
		}
	}
	
	public static boolean exists(String randomName) {
		return getRandom(randomName) != null;
	}
	
	public static String[] getNames() {
		Set<String> mergedRegistry = KillTheRNG.commonRandom.REGISTRY.keySet();
		mergedRegistry.addAll(KillTheRNG.clientRandom.REGISTRY.keySet());
		return (String[]) mergedRegistry.toArray();
	}
}
