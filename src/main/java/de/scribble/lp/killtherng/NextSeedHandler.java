package de.scribble.lp.killtherng;

import de.scribble.lp.killtherng.networking.NextSeedPacket;

/**
 * Collects nextSeed calls before sending it to the server to minimize network
 * traffic
 * 
 * @author ScribbleLP
 *
 */
public class NextSeedHandler {
	private int nextSeedCounter = 0;

	public void increaseNextSeedCounter() {
		nextSeedCounter++;
	}

	public void sendAndReset() {
		if (nextSeedCounter > 0) {
			if (KillTheRNG.mode == SeedingModes.PlayerInput) {
				KillTheRNG.NETWORK.sendToServer(new NextSeedPacket(nextSeedCounter));
			}
			nextSeedCounter = 0;
		}
	}
	
	public int getNextSeedCounter() {
		return nextSeedCounter;
	}
}
