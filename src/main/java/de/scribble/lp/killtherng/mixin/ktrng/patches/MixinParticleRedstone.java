package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleRedstone.class)
public class MixinParticleRedstone{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDFFFF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_70_1() {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_70.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_70.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_70.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDFFFF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_71_2() {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_71.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_71.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_71.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDFFFF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 2))
	public double redirect_math_random_72_3() {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_72.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_72.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_72.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDFFFF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 3))
	public double redirect_math_random_73_4() {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_73.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_73.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_73.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDFFFF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 4))
	public double redirect_math_random_74_5() {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_74.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_74.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_74.nextDouble();
			return Math.random();
		}
	}


}