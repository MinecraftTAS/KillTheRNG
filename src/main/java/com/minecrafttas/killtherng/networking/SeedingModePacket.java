package com.minecrafttas.killtherng.networking;

import com.minecrafttas.killtherng.KillTheRNG;
import com.minecrafttas.killtherng.SeedingModes;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class SeedingModePacket implements IMessage {

	private short number;

	public SeedingModePacket() {
	}

	public SeedingModePacket(SeedingModes mode) {
		number = (short) mode.ordinal();
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		number = buf.readShort();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeShort(number);
	}

	public SeedingModes getMode() {
		return SeedingModes.values()[number];
	}

	public static class SeedingModePacketHandler implements IMessageHandler<SeedingModePacket, IMessage> {

		@Override
		public IMessage onMessage(SeedingModePacket message, MessageContext ctx) {
			if (ctx.side.isClient()) {
				KillTheRNG.mode = message.getMode();
			}
			return null;
		}

	}
}
