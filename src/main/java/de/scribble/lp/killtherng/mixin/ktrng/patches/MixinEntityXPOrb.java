package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.item.EntityXPOrb.class)
public class MixinEntityXPOrb{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDI)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_11_1() {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_11.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_11.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_11.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDI)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_12_2() {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_12.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_12.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_12.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDI)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 2))
	public double redirect_math_random_13_3() {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_13.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_13.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_13.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDI)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 3))
	public double redirect_math_random_14_4() {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_14.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_14.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_14.nextDouble();
			return Math.random();
		}
	}

	/**
	* X and y motion when xpOrbs in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_xpOrbMotionInLava_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.xpOrbMotionInLava.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.xpOrbMotionInLava.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.xpOrbMotionInLava.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* X and y motion when xpOrbs in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_xpOrbMotionInLava_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.xpOrbMotionInLava.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.xpOrbMotionInLava.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.xpOrbMotionInLava.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* X and y motion when xpOrbs in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_xpOrbMotionInLava_7(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.xpOrbMotionInLava.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.xpOrbMotionInLava.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.xpOrbMotionInLava.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* X and y motion when xpOrbs in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_xpOrbMotionInLava_8(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.xpOrbMotionInLava.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.xpOrbMotionInLava.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.xpOrbMotionInLava.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* X and y motion when xpOrbs in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_xpOrbMotionInLava_9(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.xpOrbMotionInLava.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.xpOrbMotionInLava.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.xpOrbMotionInLava.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "roundAverage(F)I", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0), remap = false)
	private static double redirect_math_random_15_10() {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_15.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_15.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_15.nextDouble();
			return Math.random();
		}
	}


}