package de.scribble.lp.killtherng.networking;

import java.nio.charset.StandardCharsets;

import com.mojang.realmsclient.gui.ChatFormatting;

import de.scribble.lp.killtherng.KillTheRNG;
import de.scribble.lp.killtherng.UltimateRandomness;
import de.scribble.lp.killtherng.commands.CommandKillTheRNG;
import de.scribble.lp.killtherng.custom.CustomRandom;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class SeedInfoPacket implements IMessage {

	private boolean request=false;
	
	private String name;

	private long timesCalled;

	private long seed;

	public SeedInfoPacket(String name) {
		
	}
	
	public SeedInfoPacket(CustomRandom rand) {
		name = rand.getName();
		timesCalled = rand.getTimesCalled();
		seed = rand.getSeed();
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		int length = buf.readInt();
		name = (String) buf.readCharSequence(length, StandardCharsets.UTF_8);
		request = buf.readBoolean();
		if(!request) {
			timesCalled = buf.readLong();
			seed = buf.readLong();
		}
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(name.length());
		buf.writeCharSequence(name, StandardCharsets.UTF_8);
		buf.writeBoolean(request);
		if(!request) {
			buf.writeLong(timesCalled);
			buf.writeLong(seed);
		}
	}

	public static class SeedInfoPacketHandler implements IMessageHandler<SeedInfoPacket, IMessage> {

		@Override
		public IMessage onMessage(SeedInfoPacket message, MessageContext ctx) {
			if(ctx.side.isServer()) {
				if(message.request) {
					CustomRandom inforand = UltimateRandomness.getRandomBothSides(message.name);
					
					if(inforand != null) {
						KillTheRNG.NETWORK.sendTo(new SeedInfoPacket(inforand), ctx.getServerHandler().player);
					} else {
						KillTheRNG.NETWORK.sendTo(message, ctx.getServerHandler().player);
					}
				}
			} else if (ctx.side.isClient()) {
				CustomRandom randToDisplay = null;
				if(message.request) {
					randToDisplay = KillTheRNG.clientRandom.getRandom(message.name);
				} else {
					randToDisplay = KillTheRNG.commonRandom.getRandom(message.name);
				}
				if(randToDisplay!=null) {
					CommandKillTheRNG.sendHelp(randToDisplay);
				} else {
					Minecraft.getMinecraft().ingameGUI.addChatMessage(ChatType.CHAT, new TextComponentString(ChatFormatting.RED + "The randomness you specified doesn't exist"));
				}
			}
			return null;
		}

	}
}
