package de.scribble.lp.killtherng.networking;

import de.scribble.lp.killtherng.commands.CommandKillTheRNG;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class SeedInfoPacketHandler implements IMessageHandler<SeedInfoPacket, IMessage>{

	@Override
	public IMessage onMessage(SeedInfoPacket message, MessageContext ctx) {
		if(ctx.side.isClient()) {
			CommandKillTheRNG.sendHelp(message.name, message.timesCalled, message.seed);
		}
		return null;
	}

}
