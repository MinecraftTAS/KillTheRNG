package de.scribble.lp.killtherng.networking;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class ChangeSeedPacket implements IMessage{
	
	public boolean next;
	
	public long seed;
	
	public ChangeSeedPacket() {
		next=true;
		seed=0;
	}
	
	public ChangeSeedPacket(long seed) {
		next=false;
		this.seed=seed;
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		next=buf.readBoolean();
		seed=buf.readLong();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeBoolean(next);
		buf.writeLong(seed);
	}

}
