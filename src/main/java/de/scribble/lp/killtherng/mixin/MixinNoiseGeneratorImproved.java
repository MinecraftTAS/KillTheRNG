package de.scribble.lp.killtherng.mixin;

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
	public double redirect_random_1636_0(Random rand) {
		return KillTheRNG.randomness.random_1636.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_1637_1(Random rand) {
		return KillTheRNG.randomness.random_1637.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_1638_2(Random rand) {
		return KillTheRNG.randomness.random_1638.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1639_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1639.nextInt(i);
	}

}
