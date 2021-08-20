package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.command.CommandHelp;

@Mixin(CommandHelp.class)
public class MixinCommandHelp {

	/**
	* null
	*/
	@Redirect(method = "execute(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1485_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1485.nextInt(i);
	}

}
