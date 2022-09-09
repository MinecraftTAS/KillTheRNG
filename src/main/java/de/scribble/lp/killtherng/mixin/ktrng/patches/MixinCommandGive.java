package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.command.CommandGive.class)
public class MixinCommandGive{

	/**
	* Pitch of item being picked up sound when doing /give
	*/
	@Redirect(method = "execute(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_commandGiveSound_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.commandGiveSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.commandGiveSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.commandGiveSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of item being picked up sound when doing /give
	*/
	@Redirect(method = "execute(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_commandGiveSound_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.commandGiveSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.commandGiveSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.commandGiveSound.nextFloat();
			return rand.nextFloat();
		}
	}


}