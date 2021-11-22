package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.particle.Particle;

@Mixin(Particle.class)
public class MixinParticle {

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1417_1(Random rand) {
		return KillTheRNG.randomness.random_1417.nextFloat();
//		KillTheRNG.randomness.random_1417.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1418_2(Random rand) {
		return KillTheRNG.randomness.random_1418.nextFloat();
//		KillTheRNG.randomness.random_1418.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1419_3(Random rand) {
		return KillTheRNG.randomness.random_1419.nextFloat();
//		KillTheRNG.randomness.random_1419.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1420_4(Random rand) {
		return KillTheRNG.randomness.random_1420.nextFloat();
//		KillTheRNG.randomness.random_1420.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_34_5() {
		return KillTheRNG.randomness.math_random_34.nextDouble();
//		KillTheRNG.randomness.math_random_34.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_35_6() {
		return KillTheRNG.randomness.math_random_35.nextDouble();
//		KillTheRNG.randomness.math_random_35.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 2))
	public double redirect_math_random_36_7() {
		return KillTheRNG.randomness.math_random_36.nextDouble();
//		KillTheRNG.randomness.math_random_36.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 3))
	public double redirect_math_random_37_8() {
		return KillTheRNG.randomness.math_random_37.nextDouble();
//		KillTheRNG.randomness.math_random_37.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 4))
	public double redirect_math_random_38_9() {
		return KillTheRNG.randomness.math_random_38.nextDouble();
//		KillTheRNG.randomness.math_random_38.nextDouble();
//		return Math.random();
	}

}
