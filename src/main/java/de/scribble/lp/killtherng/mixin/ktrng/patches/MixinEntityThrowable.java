package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.projectile.EntityThrowable;

@Mixin(EntityThrowable.class)
public class MixinEntityThrowable {

	/**
	* General speed when throwing something
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_throwableMotion_1(Random rand) {
		return KillTheRNG.randomness.throwableMotion.nextFloat();
//		KillTheRNG.randomness.throwableMotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* General speed when throwing something
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_throwableMotion_2(Random rand) {
		return KillTheRNG.randomness.throwableMotion.nextFloat();
//		KillTheRNG.randomness.throwableMotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* General speed when throwing something
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_throwableMotion_3(Random rand) {
		return KillTheRNG.randomness.throwableMotion.nextFloat();
//		KillTheRNG.randomness.throwableMotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* General inaccuracy to a thowable entity
	*/
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_throwableInaccuracy_4(Random rand) {
		return KillTheRNG.randomness.throwableInaccuracy.nextGaussian();
//		KillTheRNG.randomness.throwableInaccuracy.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* General inaccuracy to a thowable entity
	*/
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_throwableInaccuracy_5(Random rand) {
		return KillTheRNG.randomness.throwableInaccuracy.nextGaussian();
//		KillTheRNG.randomness.throwableInaccuracy.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* General inaccuracy to a thowable entity
	*/
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_throwableInaccuracy_6(Random rand) {
		return KillTheRNG.randomness.throwableInaccuracy.nextGaussian();
//		KillTheRNG.randomness.throwableInaccuracy.nextGaussian();
//		return rand.nextGaussian();
	}

}
