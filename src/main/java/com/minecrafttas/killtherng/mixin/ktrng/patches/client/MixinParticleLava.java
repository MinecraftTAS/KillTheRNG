package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleLava.class)
public class MixinParticleLava{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1443_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1443.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1443.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1443.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1444_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1444.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1444.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1444.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_57_3() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_57.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_57.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_57.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1445_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1445.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1445.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1445.nextFloat();
			return rand.nextFloat();
		}
	}


}