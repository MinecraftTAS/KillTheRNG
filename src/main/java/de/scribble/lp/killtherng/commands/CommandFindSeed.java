package de.scribble.lp.killtherng.commands;

import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;

public class CommandFindSeed extends CommandBase{

	@Override
	public String getName() {
		return "findseed";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		return "/findseed <mode> <value>";
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
	}
	
	@Override
	public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args,
			BlockPos targetPos) {
		if(args.length==1) {
		}
		return super.getTabCompletions(server, sender, args, targetPos);
	}

}
