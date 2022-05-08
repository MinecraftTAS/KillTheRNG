package de.scribble.lp.killtherng.networking;

import java.nio.charset.Charset;

import de.scribble.lp.killtherng.commands.CommandKillTheRNG;
import de.scribble.lp.killtherng.custom.CustomRandom;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class SeedInfoPacket implements IMessage {

	public String name;

	public long timesCalled;

	public long seed;

	public SeedInfoPacket() {
	}

	public SeedInfoPacket(CustomRandom rand) {
		name = rand.getName();
		timesCalled = rand.getTimesCalled();
		seed = rand.getSeed();
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		int length = buf.readInt();
		name = (String) buf.readCharSequence(length, Charset.defaultCharset());
		timesCalled = buf.readLong();
		seed = buf.readLong();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(name.length());
		buf.writeCharSequence(name, Charset.defaultCharset());
		buf.writeLong(timesCalled);
		buf.writeLong(seed);
	}

	public static class SeedInfoPacketHandler implements IMessageHandler<SeedInfoPacket, IMessage> {

		@Override
		public IMessage onMessage(SeedInfoPacket message, MessageContext ctx) {
			if (ctx.side.isClient()) {
				CommandKillTheRNG.sendHelp(message.name, message.timesCalled, message.seed);
			}
			return null;
		}

	}
}
