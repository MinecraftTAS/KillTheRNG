package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.command.CommandWeather;

@Mixin(CommandWeather.class)
public class MixinCommandWeather {

	/**
	* null
	*/
	@Redirect(method = "execute(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1482_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1482.nextInt(i);
//		KillTheRNG.randomness.random_1482.nextInt(i);
//		return rand.nextInt(i);
	}

}
