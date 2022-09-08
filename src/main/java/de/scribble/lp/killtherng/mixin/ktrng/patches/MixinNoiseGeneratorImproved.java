package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.NoiseGeneratorImproved.class)
public class MixinNoiseGeneratorImproved{

	/**
	* Terrain Generation
	*/
	@Redirect(method = "<init>(Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_noiseGeneration_1(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.noiseGeneration.nextDouble();
		de.scribble.lp.killtherng.KillTheRNG.randomness.noiseGeneration.nextDouble();
		return rand.nextDouble();
	}

	/**
	* Terrain Generation
	*/
	@Redirect(method = "<init>(Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_noiseGeneration_2(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.noiseGeneration.nextDouble();
		de.scribble.lp.killtherng.KillTheRNG.randomness.noiseGeneration.nextDouble();
		return rand.nextDouble();
	}

	/**
	* Terrain Generation
	*/
	@Redirect(method = "<init>(Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_noiseGeneration_3(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.noiseGeneration.nextDouble();
		de.scribble.lp.killtherng.KillTheRNG.randomness.noiseGeneration.nextDouble();
		return rand.nextDouble();
	}

	/**
	* Terrain Generation
	*/
	@Redirect(method = "<init>(Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_noiseGeneration_4(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.noiseGeneration.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.noiseGeneration.nextInt(i);
		return rand.nextInt(i);
	}


}