package de.scribble.lp.killtherng.networking;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class SeedingModePacketHandler implements IMessageHandler<SeedingModePacket, IMessage>{

	@Override
	public IMessage onMessage(SeedingModePacket message, MessageContext ctx) {
		if(ctx.side.isClient()) {
			KillTheRNG.mode=message.getMode();
		}
		return null;
	}

}
