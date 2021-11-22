package de.scribble.lp.killtherng.networking;

import de.scribble.lp.killtherng.KillTheRNG;
import de.scribble.lp.killtherng.URToolsClient;
import de.scribble.lp.killtherng.URToolsServer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class NextSeedPacketHandler implements IMessageHandler<NextSeedPacket, IMessage> {

	@Override
	public IMessage onMessage(NextSeedPacket message, MessageContext ctx) {
		if (ctx.side.isServer()) {
			if (ctx.getServerHandler().player.getUniqueID().equals(KillTheRNG.trackedPlayer.getUniqueID())) {
				long seed=URToolsServer.nextSeed();
				KillTheRNG.NETWORK.sendToAll(new NextSeedPacket(seed));
				
			}
		} else {
			URToolsClient.nextSeed(message.seed);
		}
		return null;
	}

}
