package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleSuspendedTown.class)
public class MixinParticleSuspendedTown{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1428_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1428.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1428.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1428.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1429_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1429.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1429.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1429.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_50_3() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_50.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_50.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_50.nextDouble();
			return Math.random();
		}
	}


}