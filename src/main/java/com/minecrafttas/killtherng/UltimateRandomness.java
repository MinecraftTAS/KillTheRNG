package com.minecrafttas.killtherng;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.minecrafttas.killtherng.custom.CustomRandom;

public class UltimateRandomness {
	
	public HashMap<String, CustomRandom> REGISTRY = new HashMap<>();

	protected CustomRandom registerRandom(String name, String description, boolean enabled, boolean client) {
		CustomRandom newRandom = new CustomRandom(name, description, enabled, client);
		REGISTRY.put(name, newRandom);
		return newRandom;
	}
	
	public void setSeedAll(long seed) {
		REGISTRY.forEach((name, rand)->{
			rand.setSeed(seed);
		});
	}
	
	public CustomRandom getRandom(String name) {
		return REGISTRY.get(name);
	}
	
	public Set<String> getAllKeys() {
		return REGISTRY.keySet();
	}
	
	public boolean exists(String randomName) {
		return getRandom(randomName) != null;
	}
	
	public long nextSeed() {
		return nextSeed(1);
	}
	
	public long nextSeed(int step) {
		//Advancing global variable
		KillTheRNG.commonRandom.GlobalServer.advance(step);
		//Getting the seed of the global variable
		long seed=KillTheRNG.commonRandom.GlobalServer.getSeed();
		//Setting the seed for every other global variable
		KillTheRNG.commonRandom.REGISTRY.forEach((name, rand)->{
			if(rand.getName().startsWith("Global"))return;
			rand.setSeed(seed, false);
		});
		return seed;
	}
	
	public static List<String> getNames() {
		List<String> mergedRegistry = Stream.concat(KillTheRNG.commonRandom.getAllKeys().stream(), KillTheRNG.clientRandom.getAllKeys().stream())
                .collect(Collectors.toList());
		return mergedRegistry;
	}
	
	public static CustomRandom getRandomBothSides(String name) {
		CustomRandom rand = KillTheRNG.commonRandom.getRandom(name);
		if(rand==null) {
			rand = KillTheRNG.clientRandom.getRandom(name);
		}
		return rand;
	}
}
