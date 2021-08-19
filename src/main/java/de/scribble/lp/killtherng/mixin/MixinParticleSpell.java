package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.particle.ParticleSpell;

@Mixin(ParticleSpell.class)
public class MixinParticleSpell {
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	private static double redirect_random_1430(Random rand) {
		return KillTheRNG.randomness.random_1430.nextDouble();
	}

	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	private static double redirect_random_1431(Random rand) {
		return KillTheRNG.randomness.random_1431.nextDouble();
	}

}
