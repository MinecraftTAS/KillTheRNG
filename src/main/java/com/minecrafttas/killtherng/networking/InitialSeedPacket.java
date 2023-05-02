package com.minecrafttas.killtherng.networking;

import com.minecrafttas.killtherng.KillTheRNG;
import com.minecrafttas.killtherng.ServerPlayerManager;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class InitialSeedPacket implements IMessage{

	private long seed;
	
	public InitialSeedPacket() {
	}
	
	public InitialSeedPacket(long seed) {
		this.seed = seed;
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeLong(seed);
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		seed = buf.readLong();
	}
	
	public static class InitialSeedPacketHandler implements IMessageHandler<InitialSeedPacket, IMessage> {

		@Override
		public IMessage onMessage(InitialSeedPacket message, MessageContext ctx) {
			if(ctx.side.isServer()) {
				ServerPlayerManager manager = KillTheRNG.playerManager;
				if(manager != null) {
//					manager.reserve(ctx.getServerHandler().player, message.seed);
				} else {
					KillTheRNG.LOGGER.error("The player manager is null!");
				}
			}
			return null;
		}
		
	}
}
