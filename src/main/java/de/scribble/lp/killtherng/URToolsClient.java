package de.scribble.lp.killtherng;

import de.scribble.lp.killtherng.custom.CustomRandom;
import de.scribble.lp.killtherng.networking.NextSeedPacket;

public class URToolsClient {
	
	public static CustomRandom getRandomFromString(String name) {
		for (CustomRandom rand : CustomRandom.LIST) {
			if (rand.getName().equalsIgnoreCase(name)) {
				return rand;
			}
		}
		return null;
	}

	public static void setSeedAll(long seed) {
		CustomRandom.LIST.forEach(rand -> {
			rand.setSeed(seed);
		});
	}

	public static boolean isRandomInList(String name) {
		return getRandomFromString(name) != null;
	}

	public static String[] getNames() {
		String[] out = new String[CustomRandom.LIST.size()];
		for (int i = 0; i < out.length; i++) {
			out[i] = CustomRandom.LIST.get(i).getName();
		}
		return out;
	}

	public static void nextSeedClient(long seed) {
		CustomRandom.LIST.forEach(rand -> {
			rand.setSeed(seed, true);
		});
		KillTheRNG.eventHandler.triggerEvents();
	}

	public static void nextSeedServer() {
		KillTheRNG.NETWORK.sendToServer(new NextSeedPacket());
	}
}
