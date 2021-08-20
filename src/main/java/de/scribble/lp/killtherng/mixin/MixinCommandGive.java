package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.command.CommandGive;

@Mixin(CommandGive.class)
public class MixinCommandGive {

	/**
	* null
	*/
	@Redirect(method = "execute(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1483_0(Random rand) {
		return KillTheRNG.randomness.random_1483.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "execute(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1484_1(Random rand) {
		return KillTheRNG.randomness.random_1484.nextFloat();
	}

}
