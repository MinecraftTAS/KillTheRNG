package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAIMate;

@Mixin(EntityAIMate.class)
public class MixinEntityAIMate {

	/**
	* null
	*/
	@Redirect(method = "spawnBaby()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_777_0(Random rand) {
		return KillTheRNG.randomness.random_777.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBaby()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_778_1(Random rand) {
		return KillTheRNG.randomness.random_778.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBaby()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_779_2(Random rand) {
		return KillTheRNG.randomness.random_779.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBaby()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_780_3(Random rand) {
		return KillTheRNG.randomness.random_780.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBaby()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_781_4(Random rand) {
		return KillTheRNG.randomness.random_781.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBaby()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_782_5(Random rand) {
		return KillTheRNG.randomness.random_782.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBaby()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_random_783_6(Random rand, int i) {
		return KillTheRNG.randomness.random_783.nextInt(i);
	}

}
