package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleRain.class)
public class MixinParticleRain{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1426_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1426.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1426.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1426.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_46_2() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_46.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_46.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_46.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_47_3() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_47.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_47.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_47.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_48_4() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_48.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_48.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_48.nextDouble();
			return Math.random();
		}
	}


}