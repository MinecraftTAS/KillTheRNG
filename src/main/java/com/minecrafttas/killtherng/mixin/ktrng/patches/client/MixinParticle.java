package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.Particle.class)
public class MixinParticle{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1417_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1417.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1417.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1417.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1418_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1418.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1418.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1418.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1419_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1419.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1419.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1419.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1420_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1420.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1420.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1420.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_34_5() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_34.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_34.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_34.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_35_6() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_35.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_35.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_35.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 2))
	public double redirect_math_random_36_7() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_36.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_36.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_36.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 3))
	public double redirect_math_random_37_8() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_37.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_37.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_37.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 4))
	public double redirect_math_random_38_9() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_38.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_38.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_38.nextDouble();
			return Math.random();
		}
	}


}