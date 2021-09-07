package de.scribble.lp.killtherng.networking;

import de.scribble.lp.killtherng.KillTheRNG;
import de.scribble.lp.killtherng.URToolsClient;
import de.scribble.lp.killtherng.URToolsServer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class ChangeSeedPacketHandler implements IMessageHandler<ChangeSeedPacket, IMessage> {

	@Override
	public IMessage onMessage(ChangeSeedPacket message, MessageContext ctx) {
		if (ctx.side.isServer()) {
			if (message.name.isEmpty()) {
				URToolsServer.setSeedAll(message.seed);
			} else {
				if (URToolsServer.isRandomInList(message.name)) {
					URToolsServer.getRandomFromString(message.name).setSeed(message.seed);;
					KillTheRNG.NETWORK.sendToAll(message);
				}
			}

		} else {
			if(message.name.isEmpty()) {
				URToolsClient.setSeedAll(message.seed);
			}else {
				URToolsClient.getRandomFromString(message.name).setSeed(message.seed);
			}
		}
		return null;
	}

}
