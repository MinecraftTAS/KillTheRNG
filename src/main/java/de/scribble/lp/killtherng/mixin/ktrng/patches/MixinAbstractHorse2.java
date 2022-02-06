package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.AbstractHorse;

@Mixin(AbstractHorse.class)
public class MixinAbstractHorse2 {

	/**
	* Particles when trying to tame a horse
	*/
	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_horseTamingParticles_1(Random rand) {
		return KillTheRNG.randomness.horseTamingParticles.nextGaussian();
//		KillTheRNG.randomness.horseTamingParticles.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Particles when trying to tame a horse
	*/
	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_horseTamingParticles_2(Random rand) {
		return KillTheRNG.randomness.horseTamingParticles.nextGaussian();
//		KillTheRNG.randomness.horseTamingParticles.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Particles when trying to tame a horse
	*/
	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_horseTamingParticles_3(Random rand) {
		return KillTheRNG.randomness.horseTamingParticles.nextGaussian();
//		KillTheRNG.randomness.horseTamingParticles.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Particles when trying to tame a horse
	*/
	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_horseTamingParticles_4(Random rand) {
		return KillTheRNG.randomness.horseTamingParticles.nextFloat();
//		KillTheRNG.randomness.horseTamingParticles.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Particles when trying to tame a horse
	*/
	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_horseTamingParticles_5(Random rand) {
		return KillTheRNG.randomness.horseTamingParticles.nextFloat();
//		KillTheRNG.randomness.horseTamingParticles.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Particles when trying to tame a horse
	*/
	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_horseTamingParticles_6(Random rand) {
		return KillTheRNG.randomness.horseTamingParticles.nextFloat();
//		KillTheRNG.randomness.horseTamingParticles.nextFloat();
//		return rand.nextFloat();
	}

}
