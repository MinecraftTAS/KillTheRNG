package de.scribble.lp.killtherng.commands;

import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;

import de.scribble.lp.killtherng.UltimateRandomness;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.event.ClickEvent;

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
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		if(sender instanceof EntityPlayer) {
			if(args.length==0) {
				sender.sendMessage(new TextComponentString("Set the RNG Seed here.\n"
						+ "/killtherng <Seed> to set the seed for every RNG value\n"
						+ "/killtherng <true|false> to enable/disable pseudo random for ever RNG value\n"
						+ "/killtherng <RNG-Value> <seed|true|false> Set the RNG seed or pseudo randomness for that value"));
			}
			if(isNumeric(args[0])) {
				UltimateRandomness.setSeedAll(Integer.parseInt(args[0]));
				notifyCommandListener(sender, this, "Set seed %s for everything",  new Object[] {args[0]});
			}
			else if(isBoolean(args[0])) {
				UltimateRandomness.setPseudoAll(Boolean.parseBoolean(args[0]));
				notifyCommandListener(sender, this, "Set pseudorandmomness to %s for everything",  new Object[] {args[0]});
			}
			else if(UltimateRandomness.isRandomInList(args[0])) {
				if(args.length==1) {
					sendHelp(sender, args);
					return;
				}
				if(isNumeric(args[1])) {
					UltimateRandomness.getRandomFromString(args[0]).setSeed(Long.parseLong(args[1]));
					notifyCommandListener(sender, this, "Set seed %s for %s",  new Object[] {args[1],args[0]});
				}
				else if(isBoolean(args[1])) {
					UltimateRandomness.getRandomFromString(args[0]).pseudoRandom=Boolean.parseBoolean(args[1]);
					notifyCommandListener(sender, this, "Set pseudorandmomness to %s for %s",  new Object[] {args[1],args[0]});
				}
				else if(args[1].equalsIgnoreCase("help")) {
					sendHelp(sender, args);
				}
				else {
					throw new CommandException("Can't understand what you just typed in...", new Object[] {});
				}
			}
		}
	}
	
	private void sendHelp(ICommandSender sender, String[] args) {
		String theimportantone=args[0];
		//Setting a clickable component in chat
		TextComponentString seed = new TextComponentString(ChatFormatting.GRAY+"Current Seed: "+ChatFormatting.YELLOW+UltimateRandomness.getSeedFromRandom(theimportantone));
		String style ="/killtherng "+UltimateRandomness.getNameFromRandom(theimportantone)+" "+UltimateRandomness.getSeedFromRandom(theimportantone);
		seed.getStyle().setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, style));
		
		sender.sendMessage(new TextComponentString(ChatFormatting.GOLD+UltimateRandomness.getNameFromRandom(theimportantone)));
		sender.sendMessage(new TextComponentString(UltimateRandomness.getDescriptionFromRandom(theimportantone)));
		sender.sendMessage(new TextComponentString(UltimateRandomness.getRandomVariableFromRandom(theimportantone)));
		sender.sendMessage(seed);
		sender.sendMessage(new TextComponentString(ChatFormatting.DARK_GRAY+"The random variable has been called "+UltimateRandomness.getCallsFromRandom(theimportantone)+" times"));
	}
	
	@Override
	public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args,
			BlockPos targetPos) {
		if(args.length==1) {
			return getListOfStringsMatchingLastWord(args, UltimateRandomness.randomKeysAsStringArray());
		}else if(UltimateRandomness.isRandomInList(args[0])) {
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
