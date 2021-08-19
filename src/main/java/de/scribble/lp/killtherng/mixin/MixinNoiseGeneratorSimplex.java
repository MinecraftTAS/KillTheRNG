package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.NoiseGeneratorSimplex;

@Mixin(NoiseGeneratorSimplex.class)
public class MixinNoiseGeneratorSimplex {
	@Redirect(method = "<init>(Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_1181(Random rand) {
		return KillTheRNG.randomness.random_1181.nextDouble();
	}

	@Redirect(method = "<init>(Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_1182(Random rand) {
		return KillTheRNG.randomness.random_1182.nextDouble();
	}

	@Redirect(method = "<init>(Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_1183(Random rand) {
		return KillTheRNG.randomness.random_1183.nextDouble();
	}

	@Redirect(method = "<init>(Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1184(Random rand, int i) {
		return KillTheRNG.randomness.random_1184.nextInt(i);
	}

}
