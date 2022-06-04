package de.scribble.lp.killtherng.tickmode;

import de.scribble.lp.killtherng.KillTheRNG;
import de.scribble.lp.killtherng.SeedingModes;
import de.scribble.lp.killtherng.URToolsServer;
import de.scribble.lp.killtherng.networking.UpdateClientSeedPacket;

public class TickModeServer {

	public void onTick() {
		if (KillTheRNG.mode == SeedingModes.Tick && !KillTheRNG.isLibrary) {
			KillTheRNG.NETWORK.sendToAll(new UpdateClientSeedPacket(URToolsServer.nextSeed()));
		}
	}
	
	public void tickCustom() {
		if (KillTheRNG.mode == SeedingModes.Tick && KillTheRNG.isLibrary) {
			KillTheRNG.NETWORK.sendToAll(new UpdateClientSeedPacket(URToolsServer.nextSeed()));
		}
	}
}
