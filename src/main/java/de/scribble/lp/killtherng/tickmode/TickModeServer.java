package de.scribble.lp.killtherng.tickmode;

import de.scribble.lp.killtherng.KillTheRNG;
import de.scribble.lp.killtherng.SeedingModes;
import de.scribble.lp.killtherng.URToolsServer;

public class TickModeServer {

	public void tick() {
		if (KillTheRNG.mode == SeedingModes.Tick && !KillTheRNG.isLibrary) {
			URToolsServer.nextSeed();
		}
	}
}
