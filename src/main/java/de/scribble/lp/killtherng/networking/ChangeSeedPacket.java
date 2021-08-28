package de.scribble.lp.killtherng.networking;

import java.nio.charset.Charset;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

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

}
