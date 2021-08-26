package de.scribble.lp.killtherng.networking;

import de.scribble.lp.killtherng.KillTheRNG;
import de.scribble.lp.killtherng.SeedingModes;
import de.scribble.lp.killtherng.URToolsClient;
import de.scribble.lp.killtherng.URToolsServer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class ChangeSeedPacketHandler implements IMessageHandler<ChangeSeedPacket, IMessage>{

	@Override
	public IMessage onMessage(ChangeSeedPacket message, MessageContext ctx) {
		if(ctx.side.isServer()) {
			if(KillTheRNG.trackedPlayer.getUniqueID().equals(ctx.getServerHandler().player.getUniqueID())) {
				if(message.next) {
					SeedingModes.nextPlayerInput();
				} else {
					URToolsServer.setSeedAll(message.seed);
				}
			}
		}else {
			URToolsClient.setSeedAll(message.seed);
		}
		return null;
	}

}
