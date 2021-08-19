package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.particle.ParticleExplosionHuge;

@Mixin(ParticleExplosionHuge.class)
public class MixinParticleExplosionHuge {
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_1446(Random rand) {
		return KillTheRNG.randomness.random_1446.nextDouble();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_1447(Random rand) {
		return KillTheRNG.randomness.random_1447.nextDouble();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_1448(Random rand) {
		return KillTheRNG.randomness.random_1448.nextDouble();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_1449(Random rand) {
		return KillTheRNG.randomness.random_1449.nextDouble();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_1450(Random rand) {
		return KillTheRNG.randomness.random_1450.nextDouble();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_1451(Random rand) {
		return KillTheRNG.randomness.random_1451.nextDouble();
	}

}
