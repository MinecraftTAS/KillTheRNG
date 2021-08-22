package de.scribble.lp.killtherng;

/**
 * Used to switch between different seeding methods
 * @author ScribbleLP
 *
 */
public enum SeedingModes {
	None,
	PlayerInput,
	Ticks,
	Fixed;
	
	public static void nextPlayerInput() {
		if(KillTheRNG.mode==PlayerInput) {
			URTools.nextSeed();
		}
	}

	public static void nextTick() {
		if(KillTheRNG.mode==Ticks) {
			URTools.nextSeed();
		}
	}
}
