package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleBubble.class)
public class MixinParticleBubble{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1425_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1425.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1425.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1425.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_42_2() {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_42.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_42.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_42.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_43_3() {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_43.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_43.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_43.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 2))
	public double redirect_math_random_44_4() {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_44.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_44.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_44.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 3))
	public double redirect_math_random_45_5() {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_45.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_45.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_45.nextDouble();
			return Math.random();
		}
	}


}