package de.scribble.lp.killtherng.networking;

import java.nio.charset.StandardCharsets;

import com.mojang.realmsclient.gui.ChatFormatting;

import de.scribble.lp.killtherng.KillTheRNG;
import de.scribble.lp.killtherng.UltimateRandomness;
import de.scribble.lp.killtherng.UltimateRandomnessClient;
import de.scribble.lp.killtherng.UltimateRandomnessCommon;
import de.scribble.lp.killtherng.custom.CustomRandom;
import io.netty.buffer.ByteBuf;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

/**
 * Packet for changing 1 or all seeds on server and client
 * 
 * @author Scribble
 */
public class ChangeSeedPacket implements IMessage{
	
	/**
	 * The seed to change it to
	 */
	private long seed;
	
	/**
	 * The name of the random to change. If the string is empty, it changes every seed
	 */
	private String name;
	
	/**
	 * Forge needs this, do not use
	 */
	@Deprecated
	public ChangeSeedPacket() {
	}
	
	/**
	 * Change every seed on server and client
	 * @param seed The seed to change it to
	 */
	public ChangeSeedPacket(long seed) {
		this.seed=seed;
		name="";
	}
	
	/**
	 * Change a certain random variable to the specified seed.
	 * <p>
	 * If the variable is accessible on the server, it changes only on the server, else it will change every client variable
	 * @param name The name of the randomness
	 * @param seed The seed to change it to
	 */
	public ChangeSeedPacket(String name, long seed) {
		this.seed=seed;
		this.name=name;
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		seed=buf.readLong();
		int length=buf.readInt();
		name=(String) buf.readCharSequence(length, StandardCharsets.UTF_8);
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeLong(seed);
		buf.writeInt(name.length());
		buf.writeCharSequence(name, StandardCharsets.UTF_8);
	}

	public static class ChangeSeedPacketHandler implements IMessageHandler<ChangeSeedPacket, IMessage> {

		@Override
		public IMessage onMessage(ChangeSeedPacket message, MessageContext ctx) {
			/*======Server side======*/
			if (ctx.side.isServer()) {
				
				UltimateRandomnessCommon commonrandom = KillTheRNG.commonRandom;
				/*If every randomness should be changed*/
				if (message.name.isEmpty()) {
					commonrandom.setSeedAll(message.seed);
					KillTheRNG.NETWORK.sendToAll(message);
				/*If only one randomness should be changed*/
				} else {
					
					CustomRandom randomToChange = UltimateRandomness.getRandomBothSides(message.name);
					
					if (randomToChange != null) {
						if (randomToChange.isClient()) {
							KillTheRNG.NETWORK.sendToAll(message);
						} else {
							randomToChange.setSeed(message.seed);
						}
					} else {
						ctx.getServerHandler().player.sendMessage(new TextComponentString(ChatFormatting.RED + "The specified random doesn't exist: " + message.name));
					}
				}
			/*======Client side======*/
			} else {
				UltimateRandomnessClient clientrandom = KillTheRNG.clientRandom;
				/* If every randomness should be changed */
				if (message.name.isEmpty()) {
					clientrandom.setSeedAll(message.seed);
					/* If only one randomness should be changed */
				} else {
					clientrandom.getRandom(message.name).setSeed(message.seed);
				}
			}
			return null;
		}

	}
}
