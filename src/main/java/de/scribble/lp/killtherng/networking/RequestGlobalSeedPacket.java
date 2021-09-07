package de.scribble.lp.killtherng.networking;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class RequestGlobalSeedPacket implements IMessage{

	long seed;
	
	public RequestGlobalSeedPacket() {
		seed=0;
	}
	
	public RequestGlobalSeedPacket(long seed) {
		this.seed=seed;
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		seed=buf.readLong();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeLong(seed);
	}
	
}
