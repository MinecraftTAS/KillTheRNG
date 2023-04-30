package com.minecrafttas.killtherng;

/**
 * Used to switch between different seeding methods
 * @author ScribbleLP
 *
 */
public enum SeedingModes {
	/**
	 * True vanilla experience,
	 */
	None,
	/**
	 * The seed won't change automatically
	 */
	Fixed(true),
	/**
	 * The seed will change every new tick, but will not change during the tick
	 */
	TickNoChange(true),
	/**
	 * The seed will change every new tick, and can be changed during the tick
	 */
	TickChange(false);
	
	private boolean notChangeSeed;
	
	private SeedingModes() {
		notChangeSeed=false;
	}
	
	private SeedingModes(boolean dontChangeSeed) {
		this.notChangeSeed=dontChangeSeed;
	}
	
	public boolean isNotChangeSeed() {
		return notChangeSeed;
	}
}
