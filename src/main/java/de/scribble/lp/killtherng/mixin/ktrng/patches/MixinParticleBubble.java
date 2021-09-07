package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.particle.ParticleBubble;

@Mixin(ParticleBubble.class)
public class MixinParticleBubble {

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1425_1(Random rand) {
		return KillTheRNG.randomness.random_1425.nextFloat();
//		KillTheRNG.randomness.random_1425.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_42_2() {
		return KillTheRNG.randomness.math_random_42.nextDouble();
//		KillTheRNG.randomness.math_random_42.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_43_3() {
		return KillTheRNG.randomness.math_random_43.nextDouble();
//		KillTheRNG.randomness.math_random_43.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 2))
	public double redirect_math_random_44_4() {
		return KillTheRNG.randomness.math_random_44.nextDouble();
//		KillTheRNG.randomness.math_random_44.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 3))
	public double redirect_math_random_45_5() {
		return KillTheRNG.randomness.math_random_45.nextDouble();
//		KillTheRNG.randomness.math_random_45.nextDouble();
//		return Math.random();
	}

}
