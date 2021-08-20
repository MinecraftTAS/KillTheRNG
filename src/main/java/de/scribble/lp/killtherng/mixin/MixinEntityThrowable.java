package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.projectile.EntityThrowable;

@Mixin(EntityThrowable.class)
public class MixinEntityThrowable {

	/**
	* null
	*/
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_594_0(Random rand) {
		return KillTheRNG.randomness.random_594.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_595_1(Random rand) {
		return KillTheRNG.randomness.random_595.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_596_2(Random rand) {
		return KillTheRNG.randomness.random_596.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_597_0(Random rand) {
		return KillTheRNG.randomness.random_597.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_598_1(Random rand) {
		return KillTheRNG.randomness.random_598.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_599_2(Random rand) {
		return KillTheRNG.randomness.random_599.nextFloat();
	}

}
