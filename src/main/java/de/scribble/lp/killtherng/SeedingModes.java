package de.scribble.lp.killtherng;

/**
 * Used to switch between different seeding methods
 * @author ScribbleLP
 *
 */
public enum SeedingModes {
	None,
	PlayerInput(true),
	Fixed(true),
	Tick(true);
	
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
