package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.particle.Particle;

@Mixin(Particle.class)
public class MixinParticle {
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1417(Random rand) {
		return KillTheRNG.randomness.random_1417.nextFloat();
	}

	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1418(Random rand) {
		return KillTheRNG.randomness.random_1418.nextFloat();
	}

	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1419(Random rand) {
		return KillTheRNG.randomness.random_1419.nextFloat();
	}

	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1420(Random rand) {
		return KillTheRNG.randomness.random_1420.nextFloat();
	}

}
