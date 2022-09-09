package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.Particle.class)
public class MixinParticle{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1417_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1417.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1417.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1417.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1418_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1418.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1418.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1418.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1419_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1419.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1419.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1419.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1420_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1420.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1420.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1420.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_34_5() {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_34.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_34.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_34.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_35_6() {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_35.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_35.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_35.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 2))
	public double redirect_math_random_36_7() {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_36.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_36.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_36.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 3))
	public double redirect_math_random_37_8() {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_37.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_37.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_37.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 4))
	public double redirect_math_random_38_9() {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_38.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_38.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_38.nextDouble();
			return Math.random();
		}
	}


}