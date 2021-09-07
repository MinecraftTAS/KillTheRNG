package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.NoiseGeneratorImproved;

@Mixin(NoiseGeneratorImproved.class)
public class MixinNoiseGeneratorImproved {

	/**
	* null
	*/
	@Redirect(method = "<init>(Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_1636_1(Random rand) {
//		return KillTheRNG.randomness.random_1636.nextDouble();
		KillTheRNG.randomness.random_1636.nextDouble();
		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_1637_2(Random rand) {
//		return KillTheRNG.randomness.random_1637.nextDouble();
		KillTheRNG.randomness.random_1637.nextDouble();
		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_1638_3(Random rand) {
//		return KillTheRNG.randomness.random_1638.nextDouble();
		KillTheRNG.randomness.random_1638.nextDouble();
		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1639_4(Random rand, int i) {
//		return KillTheRNG.randomness.random_1639.nextInt(i);
		KillTheRNG.randomness.random_1639.nextInt(i);
		return rand.nextInt(i);
	}

}
