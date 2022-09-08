package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleExplosion.class)
public class MixinParticleExplosion{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1421_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_1421.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1421.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_1421.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1422_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_1422.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1422.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_1422.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1423_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_1423.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1423.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_1423.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1424_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_1424.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1424.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_1424.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_39_5() {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_39.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_39.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_39.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_40_6() {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_40.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_40.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_40.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 2))
	public double redirect_math_random_41_7() {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_41.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_41.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_41.nextDouble();
			return Math.random();
		}
	}


}