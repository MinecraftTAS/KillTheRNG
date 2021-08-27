package de.scribble.lp.killtherng.networking;

import java.nio.charset.Charset;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class ChangeSeedPacket implements IMessage{
	
	public boolean next;
	
	public long seed;
	
	public String name;
	
	public ChangeSeedPacket() {
	}
	
	public ChangeSeedPacket(long seed, boolean next) {
		this.next=next;
		this.seed=seed;
		name="";
	}
	
	public ChangeSeedPacket(long seed) {
		next=false;
		this.seed=seed;
		name="";
	}
	
	public ChangeSeedPacket(String name, long seed) {
		next=false;
		this.seed=seed;
		this.name=name;
	}
	
	
	
	@Override
	public void fromBytes(ByteBuf buf) {
		next=buf.readBoolean();
		seed=buf.readLong();
		int length=buf.readInt();
		name=(String) buf.readCharSequence(length, Charset.defaultCharset());
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeBoolean(next);
		buf.writeLong(seed);
		buf.writeInt(name.length());
		buf.writeCharSequence(name, Charset.defaultCharset());
	}

}
