package de.scribble.lp.killtherng.networking;

import de.scribble.lp.killtherng.KillTheRNG;
import de.scribble.lp.killtherng.URToolsServer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class RequestGlobalSeedPacketHandler implements IMessageHandler<RequestGlobalSeedPacket, IMessage>{

	@Override
	public IMessage onMessage(RequestGlobalSeedPacket message, MessageContext ctx) {
		if(ctx.side.isClient()) {
			long seed=KillTheRNG.randomness.Global.getSeed();
			KillTheRNG.LOGGER.info("Sending {} to the server", seed);
			KillTheRNG.NETWORK.sendToServer(new RequestGlobalSeedPacket(seed));
		}else if(ctx.side.isServer()) {
			KillTheRNG.LOGGER.info("Updating global seed to {}", message.seed);
			URToolsServer.setSeedAll(message.seed);
		}
		return null;
	}

}
