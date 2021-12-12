package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.NoiseGeneratorSimplex;

@Mixin(NoiseGeneratorSimplex.class)
public class MixinNoiseGeneratorSimplex {

	/**
	* Terrain Generation
	*/
	@Redirect(method = "<init>(Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_noiseGeneration_1(Random rand) {
//		return KillTheRNG.randomness.noiseGeneration.nextDouble();
		KillTheRNG.randomness.noiseGeneration.nextDouble();
		return rand.nextDouble();
	}

	/**
	* Terrain Generation
	*/
	@Redirect(method = "<init>(Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_noiseGeneration_2(Random rand) {
//		return KillTheRNG.randomness.noiseGeneration.nextDouble();
		KillTheRNG.randomness.noiseGeneration.nextDouble();
		return rand.nextDouble();
	}

	/**
	* Terrain Generation
	*/
	@Redirect(method = "<init>(Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_noiseGeneration_3(Random rand) {
//		return KillTheRNG.randomness.noiseGeneration.nextDouble();
		KillTheRNG.randomness.noiseGeneration.nextDouble();
		return rand.nextDouble();
	}

	/**
	* Terrain Generation
	*/
	@Redirect(method = "<init>(Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_noiseGeneration_4(Random rand, int i) {
//		return KillTheRNG.randomness.noiseGeneration.nextInt(i);
		KillTheRNG.randomness.noiseGeneration.nextInt(i);
		return rand.nextInt(i);
	}

}
