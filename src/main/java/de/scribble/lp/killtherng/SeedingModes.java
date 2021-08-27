package de.scribble.lp.killtherng;

import de.scribble.lp.killtherng.networking.ChangeSeedPacket;

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
			KillTheRNG.NETWORK.sendToServer(new ChangeSeedPacket(0L, true));
		}
	}
}
