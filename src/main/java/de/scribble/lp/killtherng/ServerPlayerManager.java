package de.scribble.lp.killtherng;

import de.scribble.lp.killtherng.networking.ChangeSeedPacket;
import net.minecraft.entity.player.EntityPlayerMP;

public class ServerPlayerManager {
	
	private EntityPlayerMP trackedPlayer;
	
	public ServerPlayerManager() {
	}
	
	public void reserve(EntityPlayerMP player, long seed) {
		if(trackedPlayer==null) {
			KillTheRNG.LOGGER.info("Set tracked player to " + player.getName());
			trackedPlayer = player;
			KillTheRNG.commonRandom.setSeedAll(seed);
		}else {
			KillTheRNG.NETWORK.sendTo(new ChangeSeedPacket(KillTheRNG.commonRandom.GlobalServer.getSeed()), player);
		}
	}
	
	public void free(EntityPlayerMP player) {
		if(trackedPlayer==player) {
			KillTheRNG.LOGGER.info("Remove tracked player " + player.getName());
			trackedPlayer = null;
		}
	}
}
