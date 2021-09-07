package de.scribble.lp.killtherng.networking;

import java.nio.charset.Charset;

import de.scribble.lp.killtherng.custom.CustomRandom;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class SeedInfoPacket implements IMessage{
	
    public String name;
    
    public long timesCalled;
    
    public long seed;
	
    public SeedInfoPacket() {
	}
    
	public SeedInfoPacket(CustomRandom rand){
		name=rand.getName();
		timesCalled=rand.getTimesCalled();
		seed=rand.getSeed();
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		int length=buf.readInt();
		name=(String) buf.readCharSequence(length, Charset.defaultCharset());
		timesCalled=buf.readLong();
		seed=buf.readLong();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(name.length());
		buf.writeCharSequence(name, Charset.defaultCharset());
		buf.writeLong(timesCalled);
		buf.writeLong(seed);
	}

}
