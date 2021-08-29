package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.item.EntityXPOrb;

@Mixin(EntityXPOrb.class)
public class MixinEntityXPOrb {

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDI)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_11_1() {
		return KillTheRNG.randomness.math_random_11.nextDouble();
//		KillTheRNG.randomness.math_random_11.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDI)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_12_2() {
		return KillTheRNG.randomness.math_random_12.nextDouble();
//		KillTheRNG.randomness.math_random_12.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDI)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 2))
	public double redirect_math_random_13_3() {
		return KillTheRNG.randomness.math_random_13.nextDouble();
//		KillTheRNG.randomness.math_random_13.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDI)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 3))
	public double redirect_math_random_14_4() {
		return KillTheRNG.randomness.math_random_14.nextDouble();
//		KillTheRNG.randomness.math_random_14.nextDouble();
//		return Math.random();
	}

	/**
	* X and y motion when xpOrbs in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_xpOrbMotionInLava_5(Random rand) {
		return KillTheRNG.randomness.xpOrbMotionInLava.nextFloat();
//		KillTheRNG.randomness.xpOrbMotionInLava.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* X and y motion when xpOrbs in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_xpOrbMotionInLava_6(Random rand) {
		return KillTheRNG.randomness.xpOrbMotionInLava.nextFloat();
//		KillTheRNG.randomness.xpOrbMotionInLava.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* X and y motion when xpOrbs in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_xpOrbMotionInLava_7(Random rand) {
		return KillTheRNG.randomness.xpOrbMotionInLava.nextFloat();
//		KillTheRNG.randomness.xpOrbMotionInLava.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* X and y motion when xpOrbs in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_xpOrbMotionInLava_8(Random rand) {
		return KillTheRNG.randomness.xpOrbMotionInLava.nextFloat();
//		KillTheRNG.randomness.xpOrbMotionInLava.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* X and y motion when xpOrbs in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_xpOrbMotionInLava_9(Random rand) {
		return KillTheRNG.randomness.xpOrbMotionInLava.nextFloat();
//		KillTheRNG.randomness.xpOrbMotionInLava.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "roundAverage(F)I", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	private static double redirect_math_random_15_10() {
		return KillTheRNG.randomness.math_random_15.nextDouble();
//		KillTheRNG.randomness.math_random_15.nextDouble();
//		return Math.random();
	}

}
