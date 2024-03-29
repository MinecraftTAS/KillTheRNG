package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.passive.EntityTameable.class)
public class MixinEntityTameable{

	/**
	* Position and velocity of taming particles
	*/
	@Redirect(method = "playTameEffect(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_tameableParticle_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.tameableParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.tameableParticle.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.tameableParticle.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position and velocity of taming particles
	*/
	@Redirect(method = "playTameEffect(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_tameableParticle_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.tameableParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.tameableParticle.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.tameableParticle.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position and velocity of taming particles
	*/
	@Redirect(method = "playTameEffect(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_tameableParticle_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.tameableParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.tameableParticle.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.tameableParticle.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position and velocity of taming particles
	*/
	@Redirect(method = "playTameEffect(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_tameableParticle_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.tameableParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.tameableParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.tameableParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position and velocity of taming particles
	*/
	@Redirect(method = "playTameEffect(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_tameableParticle_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.tameableParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.tameableParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.tameableParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position and velocity of taming particles
	*/
	@Redirect(method = "playTameEffect(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_tameableParticle_6(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.tameableParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.tameableParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.tameableParticle.nextFloat();
			return rand.nextFloat();
		}
	}


}