package de.scribble.lp.killtherng.networking;

import de.scribble.lp.killtherng.URToolsClient;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class UpdateClientSeedPacket implements IMessage{

	long seed=0;
	
	public UpdateClientSeedPacket() {
	}
	
	public UpdateClientSeedPacket(long seed) {
		this.seed=seed;
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		this.seed=buf.readLong();
		
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeLong(seed);
	}
	
	public long getSeed() {
		return seed;
	}

	public static class UpdateClientSeedPacketHandler implements IMessageHandler<UpdateClientSeedPacket, IMessage>{

		@Override
		public IMessage onMessage(UpdateClientSeedPacket message, MessageContext ctx) {
			if(ctx.side.isClient()) {
				URToolsClient.setSeedAll(message.getSeed());
			}
			return null;
		}
		
	}
}
