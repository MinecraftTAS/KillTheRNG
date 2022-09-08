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
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1417.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1417.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1418_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1418.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1418.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1419_3(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1419.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1419.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1420_4(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1420.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1420.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_34_5() {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_34.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_34.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_35_6() {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_35.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_35.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 2))
	public double redirect_math_random_36_7() {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_36.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_36.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 3))
	public double redirect_math_random_37_8() {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_37.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_37.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 4))
	public double redirect_math_random_38_9() {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_38.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_38.nextDouble();
//		return Math.random();
	}


}