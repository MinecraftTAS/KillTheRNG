package de.scribble.lp.killtherng;

import de.scribble.lp.killtherng.networking.NextSeedPacket;

/**
 * Used to switch between different seeding methods
 * @author ScribbleLP
 *
 */
public enum SeedingModes {
	None,
	PlayerInput,
	Fixed;
	
	public static void nextPlayerInput() {
		if(KillTheRNG.mode==PlayerInput) {
			KillTheRNG.NETWORK.sendToServer(new NextSeedPacket());
		}
	}
}
