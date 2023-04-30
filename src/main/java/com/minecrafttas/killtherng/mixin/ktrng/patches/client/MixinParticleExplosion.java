package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleExplosion.class)
public class MixinParticleExplosion{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1421_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1421.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1421.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1421.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1422_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1422.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1422.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1422.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1423_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1423.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1423.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1423.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1424_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1424.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1424.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1424.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_39_5() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_39.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_39.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_39.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_40_6() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_40.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_40.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_40.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 2))
	public double redirect_math_random_41_7() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_41.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_41.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_41.nextDouble();
			return Math.random();
		}
	}


}