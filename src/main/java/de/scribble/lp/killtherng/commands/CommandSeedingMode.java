package de.scribble.lp.killtherng.commands;

import java.util.ArrayList;
import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;

import de.scribble.lp.killtherng.KillTheRNG;
import de.scribble.lp.killtherng.SeedingModes;
import de.scribble.lp.killtherng.networking.SeedingModePacket;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;

public class CommandSeedingMode extends CommandBase{

	@Override
	public String getName() {
		return "seedingmode";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		return "/seedingmode";
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		if(args.length==0) {
			sender.sendMessage(new TextComponentString(ChatFormatting.GOLD+"-----------------------Help-----------------------\n"+ChatFormatting.RESET
					+ "Sets how the rng seed should change.\n\n"
					+ String.format("%s/seedingmode %sNone%s - Closest to vanilla behaviour. Each random variable has a seed that will advance once the variable was called\n\n", ChatFormatting.AQUA, ChatFormatting.DARK_PURPLE, ChatFormatting.RESET)
					+ String.format("%s/seedingmode %sPlayerInput%s - Every random variable has one global seed, that is changed once the player presses something on the keyboard or moves the camera\n\n", ChatFormatting.AQUA, ChatFormatting.DARK_PURPLE, ChatFormatting.RESET)
					+ String.format("%s/seedingmode %sFixed%s - Every random variable does not change it's seed, once the variable gets called. Good for testing, but definitely not vanilla viable\n\n", ChatFormatting.AQUA, ChatFormatting.DARK_PURPLE, ChatFormatting.RESET)
					+ ChatFormatting.DARK_GRAY+"Current mode: "+ChatFormatting.GREEN+KillTheRNG.mode.toString()+ChatFormatting.RESET+"\n"
					+ ""));
			return;
		}else if(args.length>1) {
			new CommandException("Too many arguments");
		}else {
			try {
				SeedingModes mode=SeedingModes.valueOf(args[0]);
				KillTheRNG.NETWORK.sendToAll(new SeedingModePacket(mode));
				notifyCommandListener(sender, this, "Set the mode to %s", mode.toString());
			} catch (IllegalArgumentException e) {
				new CommandException("Wrong seeding mode: %s", e.getMessage());
			}  catch (Exception e) {
				new CommandException("Somrthing went wrong: %s", e.getMessage());
			} 
		}
	}

	@Override
	public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args,
			BlockPos targetPos) {
		List<String>out =new ArrayList<>();
		for (SeedingModes mode:SeedingModes.values()) {
			out.add(mode.toString());
		}
		return getListOfStringsMatchingLastWord(args, out);
	}
}
