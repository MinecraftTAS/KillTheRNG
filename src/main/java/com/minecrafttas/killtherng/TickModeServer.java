package com.minecrafttas.killtherng;

import com.minecrafttas.killtherng.networking.ChangeSeedPacket;

public class TickModeServer {

	public void onTick() {
		if ( (KillTheRNG.mode == SeedingModes.TickChange || KillTheRNG.mode == SeedingModes.TickNoChange) && !KillTheRNG.isLibrary) {
			KillTheRNG.NETWORK.sendToAll(new ChangeSeedPacket(KillTheRNG.commonRandom.nextSeed()));
		}
	}
	
	public void tickCustom() {
		if ( (KillTheRNG.mode == SeedingModes.TickChange || KillTheRNG.mode == SeedingModes.TickNoChange) && KillTheRNG.isLibrary) {
			KillTheRNG.NETWORK.sendToAll(new ChangeSeedPacket(KillTheRNG.commonRandom.nextSeed()));
		}
	}
}
