package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleExplosionHuge.class)
public class MixinParticleExplosionHuge{

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_1446_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1446.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1446.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1446.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_1447_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1447.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1447.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1447.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_1448_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1448.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1448.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1448.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_1449_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1449.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1449.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1449.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_1450_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1450.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1450.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1450.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_1451_6(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1451.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1451.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1451.nextDouble();
			return rand.nextDouble();
		}
	}


}