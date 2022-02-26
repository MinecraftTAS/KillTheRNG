package de.scribble.lp.killtherng.commands;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.mojang.realmsclient.gui.ChatFormatting;

import de.scribble.lp.killtherng.KillTheRNG;
import de.scribble.lp.killtherng.URToolsClient;
import de.scribble.lp.killtherng.URToolsServer;
import de.scribble.lp.killtherng.custom.CustomRandom;
import de.scribble.lp.killtherng.networking.ChangeSeedPacket;
import de.scribble.lp.killtherng.networking.SeedInfoPacket;
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
						+ "Sets all or individual rng seeds.\n"
						+ String.format("%s/killtherng %s<seed>%s - Set the seed for every RNG value\n", ChatFormatting.AQUA, ChatFormatting.GREEN, ChatFormatting.RESET)
						+ String.format("%s/killtherng %s<RNG-Value> %s<seed>%s - Set the RNG seed for that value\n", ChatFormatting.AQUA, ChatFormatting.YELLOW, ChatFormatting.GREEN, ChatFormatting.RESET)
						+ ChatFormatting.GRAY+"Current Global Seed: "+ChatFormatting.YELLOW+URToolsServer.getRandomFromString("Global").getSeed()));
				return;
			}
			if(isNumeric(args[0])) {
				URToolsServer.setSeedAll(Long.parseLong(args[0]));
				notifyCommandListener(sender, this, "Set seed %s for everything",  new Object[] {args[0]});
			}
			else if(URToolsServer.isRandomInList(args[0])) {
				if(args.length==1) {
					KillTheRNG.NETWORK.sendTo(new SeedInfoPacket(URToolsServer.getRandomFromString(args[0])), (EntityPlayerMP)sender);
					return;
				}
				if(isNumeric(args[1])) {
					long seed=Long.parseLong(args[1]);
					URToolsServer.getRandomFromString(args[0]).setSeed(seed);
					KillTheRNG.NETWORK.sendToAll(new ChangeSeedPacket(args[0], seed));
					notifyCommandListener(sender, this, "Set seed %s for %s",  new Object[] {args[1],args[0]});
				}
				else {
					throw new CommandException("Can't understand what you just typed in...", new Object[] {});
				}
			}
		}
	}
	
	@SideOnly(Side.CLIENT)
	public static void sendHelp(String name, long timesCalled, long seed) {
		CustomRandom clientRandom=URToolsClient.getRandomFromString(name);
		EntityPlayerSP sender=Minecraft.getMinecraft().player;
		
		//Setting a clickable component in chat
		TextComponentString seedTextComponentClient = new TextComponentString(ChatFormatting.GRAY+"Current Seed (Client): "+ChatFormatting.YELLOW+clientRandom.getSeed());
		String style ="/killtherng "+clientRandom.getName()+" "+clientRandom.getSeed();
		seedTextComponentClient.getStyle().setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, style));
		
		//Setting a clickable component in chat
		TextComponentString seedTextComponentServer = new TextComponentString(ChatFormatting.GRAY+"Current Seed (Server): "+ChatFormatting.YELLOW+seed);
		seedTextComponentServer.getStyle().setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, style));
		
		sender.sendMessage(new TextComponentString(ChatFormatting.GOLD+"-------------"+clientRandom.getName()+"-------------"));
		sender.sendMessage(new TextComponentString(clientRandom.getDescription()));
		sender.sendMessage(new TextComponentString(""));
		if(!clientRandom.isEnabled()) {
			sender.sendMessage(new TextComponentString(ChatFormatting.RED+"This variable has been disabled, since it causes bugs or softlocks if it is not random."));
			sender.sendMessage(new TextComponentString(ChatFormatting.RED+"Setting a seed will not do anything, but you can still view some information"));
		}
		sender.sendMessage(seedTextComponentClient);
		sender.sendMessage(seedTextComponentServer);
		if(Minecraft.getMinecraft().isSingleplayer()) {
			sender.sendMessage(new TextComponentString(ChatFormatting.DARK_GRAY+"The random variable has been called "+clientRandom.getTimesCalled()+" times"));
		}else {
			sender.sendMessage(new TextComponentString(ChatFormatting.DARK_GRAY+"The random variable has been called "+clientRandom.getTimesCalled()+" times on the client and "+timesCalled+" on the server"));
		}
	}
	
	@Override
	public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args,
			BlockPos targetPos) {
		if(args.length==1) {
			return getListOfStringsMatchingLastWord(args, URToolsServer.getNames());
		}else if(URToolsServer.isRandomInList(args[0])) {
			return getListOfStringsMatchingLastWord(args, "help");
		}
		return super.getTabCompletions(server, sender, args, targetPos);
	}
	
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
	private boolean isBoolean(String strNum) {
	    if(strNum.equalsIgnoreCase("true")||strNum.equalsIgnoreCase("false")) {
	    	return true;
	    }else {
	    	return false;
	    }
	}
}
