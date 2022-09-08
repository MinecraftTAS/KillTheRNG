package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.projectile.EntityThrowable.class)
public class MixinEntityThrowable{

	/**
	* General speed when throwing something
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_throwableMotion_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.throwableMotion.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.throwableMotion.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.throwableMotion.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* General speed when throwing something
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_throwableMotion_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.throwableMotion.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.throwableMotion.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.throwableMotion.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* General speed when throwing something
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_throwableMotion_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.throwableMotion.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.throwableMotion.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.throwableMotion.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* General inaccuracy to a thowable entity
	*/
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_throwableInaccuracy_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.throwableInaccuracy.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.throwableInaccuracy.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.throwableInaccuracy.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* General inaccuracy to a thowable entity
	*/
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_throwableInaccuracy_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.throwableInaccuracy.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.throwableInaccuracy.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.throwableInaccuracy.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* General inaccuracy to a thowable entity
	*/
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_throwableInaccuracy_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.throwableInaccuracy.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.throwableInaccuracy.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.throwableInaccuracy.nextGaussian();
			return rand.nextGaussian();
		}
	}


}