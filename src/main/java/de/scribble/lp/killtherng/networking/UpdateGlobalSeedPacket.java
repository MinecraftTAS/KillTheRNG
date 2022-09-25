package de.scribble.lp.killtherng.networking;

import de.scribble.lp.killtherng.KillTheRNG;
import de.scribble.lp.killtherng.URToolsServer;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class UpdateGlobalSeedPacket implements IMessage {

	long seed;

	public UpdateGlobalSeedPacket() {
		seed = 0;
	}

	public UpdateGlobalSeedPacket(long seed) {
		this.seed = seed;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		seed = buf.readLong();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeLong(seed);
	}

	public static class UpdateGlobalSeedPacketHandler implements IMessageHandler<UpdateGlobalSeedPacket, IMessage> {

		@Override
		public IMessage onMessage(UpdateGlobalSeedPacket message, MessageContext ctx) {
			if (ctx.side.isClient()) {
				long seed = KillTheRNG.clientRandom.GlobalClient.getSeed();
				KillTheRNG.LOGGER.info("Sending {} to the server", seed);
				KillTheRNG.NETWORK.sendToServer(new UpdateGlobalSeedPacket(seed));
			} else if (ctx.side.isServer()) {
				KillTheRNG.LOGGER.info("Updating global seed to {}", message.seed);
				URToolsServer.setSeedAll(message.seed);
			}
			return null;
		}

	}
}
