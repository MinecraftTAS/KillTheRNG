package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleFlame.class)
public class MixinParticleFlame{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1437_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1437.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1437.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1437.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1438_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1438.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1438.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1438.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1439_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1439.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1439.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1439.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1440_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1440.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1440.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1440.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_1441_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1441.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1441.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1441.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_1442_6(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1442.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1442.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1442.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_56_7() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_56.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_56.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_56.nextDouble();
			return Math.random();
		}
	}


}