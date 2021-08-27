package de.scribble.lp.killtherng.networking;

import de.scribble.lp.killtherng.SeedingModes;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class SeedingModePacket implements IMessage{

	private short number;
	
	public SeedingModePacket() {
	}
	
	public SeedingModePacket(SeedingModes mode){
		number=(short)mode.ordinal();
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		number=buf.readShort();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeShort(number);
	}
	
	public SeedingModes getMode() {
		return SeedingModes.values()[number];
	}
}
