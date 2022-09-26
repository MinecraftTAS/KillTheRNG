package de.scribble.lp.killtherng.networking;

import java.nio.charset.StandardCharsets;

import com.mojang.realmsclient.gui.ChatFormatting;

import de.scribble.lp.killtherng.KillTheRNG;
import de.scribble.lp.killtherng.UltimateRandomness;
import de.scribble.lp.killtherng.commands.CommandKillTheRNG;
import de.scribble.lp.killtherng.commands.CommandKillTheRNG.RandomData;
import de.scribble.lp.killtherng.custom.CustomRandom;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class SeedInfoPacket implements IMessage {

	private boolean client = false;

	private String name;

	private long timesCalled;

	private long seed;

	private boolean enabled;

	public SeedInfoPacket() {
	}

	public SeedInfoPacket(String name) {
		this.name = name;
		client = true;
	}

	public SeedInfoPacket(CustomRandom rand) {
		name = rand.getName();
		timesCalled = rand.getTimesCalled();
		seed = rand.getSeed();
		enabled = rand.isEnabled();
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		int length = buf.readInt();
		name = (String) buf.readCharSequence(length, StandardCharsets.UTF_8);
		client = buf.readBoolean();
		if (!client) {
			timesCalled = buf.readLong();
			seed = buf.readLong();
			enabled = buf.readBoolean();
		}
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(name.length());
		buf.writeCharSequence(name, StandardCharsets.UTF_8);
		buf.writeBoolean(client);
		if (!client) {
			buf.writeLong(timesCalled);
			buf.writeLong(seed);
			buf.writeBoolean(enabled);
		}
	}

	public static class SeedInfoPacketHandler implements IMessageHandler<SeedInfoPacket, IMessage> {

		@Override
		public IMessage onMessage(SeedInfoPacket message, MessageContext ctx) {
			if (ctx.side.isServer()) {
				if (message.client) {
					CustomRandom inforand = UltimateRandomness.getRandomBothSides(message.name);

					if (!inforand.isClient()) {
						KillTheRNG.NETWORK.sendTo(new SeedInfoPacket(inforand), ctx.getServerHandler().player);
					} else {
						KillTheRNG.NETWORK.sendTo(message, ctx.getServerHandler().player);
					}
				}
			} else if (ctx.side.isClient()) {

				CommandKillTheRNG.RandomData data = null;

				if (message.client) {
					CustomRandom randToDisplay;
					randToDisplay = KillTheRNG.clientRandom.getRandom(message.name);

					if (randToDisplay != null) {
						data = new RandomData(randToDisplay);
					}

				} else {
					CustomRandom randToDisplay = UltimateRandomness.getRandomBothSides(message.name);

					if (randToDisplay != null) {
						data = new RandomData(randToDisplay, message.seed, message.timesCalled, message.enabled);
					}
				}

				if (data != null) {
					CommandKillTheRNG.sendHelp(data);
				} else {
					Minecraft.getMinecraft().ingameGUI.addChatMessage(ChatType.CHAT, new TextComponentString(ChatFormatting.RED + "The randomness you specified doesn't exist"));
				}
			}
			return null;
		}

	}
}
