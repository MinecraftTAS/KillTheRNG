package com.minecrafttas.killtherng.commands;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.minecrafttas.killtherng.KillTheRNG;
import com.minecrafttas.killtherng.UltimateRandomness;
import com.minecrafttas.killtherng.custom.CustomRandom;
import com.minecrafttas.killtherng.networking.ChangeSeedPacket;
import com.minecrafttas.killtherng.networking.SeedInfoPacket;
import com.mojang.realmsclient.gui.ChatFormatting;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CommandKillTheRNG extends CommandBase{

	@Override
	public String getName() {
		return "killtherng";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		return "/killtherng <RNGName> <seed>";
	}
	
	@Override
	public List<String> getAliases() {
		return ImmutableList.of("ktrng");
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		if(sender instanceof EntityPlayer) {
			
			if(args.length==0) {
				sender.sendMessage(new TextComponentString(ChatFormatting.GOLD+"-----------------------Help-----------------------\n"+ChatFormatting.RESET
						+ "This mod transforms all randomness in the game to something predictable. \n"
						+ "Just like a Minecraft world, every randomvariable has a 'seed'.\n"
						+ "Based on this seed, a random number will be generated, when the game needs randomness to occur.\n"
						+ "The game generates a new number and uses that for it's new seed and for its number.\n"
						+ "This makes it so if you have a start seed, every number generated after that will be the same\n\n"
						+ String.format("%s/killtherng %s<seed>%s - Set the seed for every RNG value\n", ChatFormatting.AQUA, ChatFormatting.GREEN, ChatFormatting.RESET)
						+ String.format("%s/killtherng %s<RNG-Value> %s<seed>%s - Set the RNG seed for that value\n", ChatFormatting.AQUA, ChatFormatting.YELLOW, ChatFormatting.GREEN, ChatFormatting.RESET)
						+ ChatFormatting.GRAY+"Current Global Seed: " + ChatFormatting.YELLOW + KillTheRNG.commonRandom.getRandom("GlobalServer").getSeed()));
				return;
			}
			
			CustomRandom rand = null;
			rand = UltimateRandomness.getRandomBothSides(args[0]);
			
			if(isNumeric(args[0])) {
				long seed = Long.parseLong(args[0]);
				KillTheRNG.commonRandom.setSeedAll(seed);
				KillTheRNG.NETWORK.sendToAll(new ChangeSeedPacket(seed));
				notifyCommandListener(sender, this, "Set seed %s for everything",  new Object[] {args[0]});
			}
			else if(rand != null) {
				if(args.length==1) {
					if(rand.isClient()) {
						KillTheRNG.NETWORK.sendTo(new SeedInfoPacket(args[0]), (EntityPlayerMP)sender);
					}else {
						KillTheRNG.NETWORK.sendTo(new SeedInfoPacket(rand), (EntityPlayerMP)sender);
					}
					return;
				}
				if(isNumeric(args[1])) {
					long seed=Long.parseLong(args[1]);
					rand.setSeed(seed);
					KillTheRNG.NETWORK.sendToAll(new ChangeSeedPacket(args[0], seed));
					notifyCommandListener(sender, this, "Set seed %s for %s",  new Object[] {args[1],args[0]});
				}
				else {
					throw new CommandException("Can't understand what you just typed in...", new Object[] {});
				}
			}
			else {
				throw new CommandException("Can't understand what you just typed in...", new Object[] {});
			}
		}
	}
	
	@SideOnly(Side.CLIENT)
	public static void sendHelp(RandomData data){
		EntityPlayerSP sender=Minecraft.getMinecraft().player;
		
		//Setting a clickable component in chat
		TextComponentString seedTextComponent = new TextComponentString(ChatFormatting.GRAY+"Current Seed: "+ChatFormatting.YELLOW+data.getSeed());
		String style ="/killtherng "+data.getName()+" "+data.getSeed();
		seedTextComponent.getStyle().setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, style));
		
		sender.sendMessage(new TextComponentString(ChatFormatting.GOLD+"-------------"+data.getName()+"-------------"));
		sender.sendMessage(new TextComponentString(data.getDescription()));
		sender.sendMessage(new TextComponentString(""));
		if(!data.isEnabled()) {
			sender.sendMessage(new TextComponentString(ChatFormatting.RED+"This variable has been disabled, since it causes bugs or softlocks if it is not random."));
			sender.sendMessage(new TextComponentString(ChatFormatting.RED+"Setting a seed will not do anything, but you can still view some information"));
		}
		sender.sendMessage(seedTextComponent);
		sender.sendMessage(new TextComponentString(ChatFormatting.DARK_GRAY+"The random variable has been called "+ data.getTimescalled() +" times"));
		sender.sendMessage(new TextComponentString(ChatFormatting.DARK_GRAY+(data.isClient() ? "Side: CLIENT" : "Side: SERVER")));
	}
	
	public static class RandomData {
		private String name;
		private long seed;
		private String description;
		private boolean enabled;
		private long timescalled;
		private boolean client;
		
		public RandomData(CustomRandom rand) {
			this.name = rand.getName();
			this.seed = rand.getSeed();
			this.description = rand.getDescription();
			this.enabled = rand.isEnabled();
			this.timescalled = rand.getTimesCalled();
			this.client = rand.isClient();
		}

		public RandomData(CustomRandom rand, long seed, long timescalled, boolean enabled) {
			this.name = rand.getName();
			this.seed = seed;
			this.description = rand.getDescription();
			this.enabled = enabled;
			this.timescalled = timescalled;
			this.client = rand.isClient();
		}
		
		public String getName() {
			return name;
		}

		public long getSeed() {
			return seed;
		}

		public String getDescription() {
			return description;
		}

		public boolean isEnabled() {
			return enabled;
		}

		public long getTimescalled() {
			return timescalled;
		}

		public boolean isClient() {
			return client;
		}
	}
	
	@Override
	public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args,
			BlockPos targetPos) {
		if(args.length==1) {
			return getListOfStringsMatchingLastWord(args, UltimateRandomness.getNames());
		} else if (UltimateRandomness.getRandomBothSides(args[0]) != null) {
			return getListOfStringsMatchingLastWord(args, "help");
		}
		return super.getTabCompletions(server, sender, args, targetPos);
	}
	
	@SuppressWarnings("unused")
	private boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
			long d = Long.parseLong(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	@SuppressWarnings("unused")
	private boolean isBoolean(String strNum) {
	    if(strNum.equalsIgnoreCase("true")||strNum.equalsIgnoreCase("false")) {
	    	return true;
	    }else {
	    	return false;
	    }
	}
}
