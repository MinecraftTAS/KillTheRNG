package de.scribble.lp.killtherng;

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
			URToolsServer.nextSeed();
		}
	}
}
