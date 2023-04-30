package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticlePortal.class)
public class MixinParticlePortal{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1433_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1433.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1433.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1433.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1434_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1434.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1434.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1434.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_52_3() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_52.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_52.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_52.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_53_4() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_53.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_53.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_53.nextDouble();
			return Math.random();
		}
	}


}