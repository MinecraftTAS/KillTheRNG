package de.scribble.lp.killtherng.mixin.ktrng.patches;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.particle.ParticleRedstone;

@Mixin(ParticleRedstone.class)
public class MixinParticleRedstone {

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDFFFF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_70_1() {
		return KillTheRNG.randomness.math_random_70.nextDouble();
//		KillTheRNG.randomness.math_random_70.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDFFFF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_71_2() {
		return KillTheRNG.randomness.math_random_71.nextDouble();
//		KillTheRNG.randomness.math_random_71.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDFFFF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 2))
	public double redirect_math_random_72_3() {
		return KillTheRNG.randomness.math_random_72.nextDouble();
//		KillTheRNG.randomness.math_random_72.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDFFFF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 3))
	public double redirect_math_random_73_4() {
		return KillTheRNG.randomness.math_random_73.nextDouble();
//		KillTheRNG.randomness.math_random_73.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDFFFF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 4))
	public double redirect_math_random_74_5() {
		return KillTheRNG.randomness.math_random_74.nextDouble();
//		KillTheRNG.randomness.math_random_74.nextDouble();
//		return Math.random();
	}

}
