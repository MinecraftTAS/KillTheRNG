package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.passive.AbstractHorse.class)
public class MixinAbstractHorse{

	/**
	* Particles when trying to tame a horse
	*/
	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_horseTamingParticles_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.horseTamingParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.horseTamingParticles.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.horseTamingParticles.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Particles when trying to tame a horse
	*/
	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_horseTamingParticles_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.horseTamingParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.horseTamingParticles.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.horseTamingParticles.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Particles when trying to tame a horse
	*/
	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_horseTamingParticles_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.horseTamingParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.horseTamingParticles.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.horseTamingParticles.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Particles when trying to tame a horse
	*/
	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_horseTamingParticles_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.horseTamingParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.horseTamingParticles.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.horseTamingParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Particles when trying to tame a horse
	*/
	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_horseTamingParticles_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.horseTamingParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.horseTamingParticles.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.horseTamingParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Particles when trying to tame a horse
	*/
	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_horseTamingParticles_6(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.horseTamingParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.horseTamingParticles.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.horseTamingParticles.nextFloat();
			return rand.nextFloat();
		}
	}


}