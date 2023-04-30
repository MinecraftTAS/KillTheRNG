package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.command.CommandHelp.class)
public class MixinCommandHelp{

	/**
	* null
	*/
	@Redirect(method = "execute(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1485_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_1485.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_1485.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_1485.nextInt(i);
			return rand.nextInt(i);
		}
	}


}