package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityTameable;

@Mixin(EntityTameable.class)
public class MixinEntityTameable {

	/**
	* null
	*/
	@Redirect(method = "playTameEffect(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_966_0(Random rand) {
		return KillTheRNG.randomness.random_966.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "playTameEffect(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_967_1(Random rand) {
		return KillTheRNG.randomness.random_967.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "playTameEffect(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_968_2(Random rand) {
		return KillTheRNG.randomness.random_968.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "playTameEffect(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_969_3(Random rand) {
		return KillTheRNG.randomness.random_969.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playTameEffect(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_970_4(Random rand) {
		return KillTheRNG.randomness.random_970.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playTameEffect(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_971_5(Random rand) {
		return KillTheRNG.randomness.random_971.nextFloat();
	}

}
