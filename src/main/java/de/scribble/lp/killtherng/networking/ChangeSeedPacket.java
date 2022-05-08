package de.scribble.lp.killtherng.networking;

import java.nio.charset.Charset;

import de.scribble.lp.killtherng.KillTheRNG;
import de.scribble.lp.killtherng.URToolsClient;
import de.scribble.lp.killtherng.URToolsServer;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class ChangeSeedPacket implements IMessage{
	
	
	public long seed;
	
	public String name;
	
	public ChangeSeedPacket() {
	}
	
	
	public ChangeSeedPacket(long seed) {
		this.seed=seed;
		name="";
	}
	
	public ChangeSeedPacket(String name, long seed) {
		this.seed=seed;
		this.name=name;
	}
	
	
	
	@Override
	public void fromBytes(ByteBuf buf) {
		seed=buf.readLong();
		int length=buf.readInt();
		name=(String) buf.readCharSequence(length, Charset.defaultCharset());
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeLong(seed);
		buf.writeInt(name.length());
		buf.writeCharSequence(name, Charset.defaultCharset());
	}

	public static class ChangeSeedPacketHandler implements IMessageHandler<ChangeSeedPacket, IMessage> {

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
}
