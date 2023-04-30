package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleSpell.class)
public class MixinParticleSpell{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	private static double redirect_random_1430_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1430.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1430.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1430.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	private static double redirect_random_1431_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1431.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1431.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1431.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_51_3() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_51.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_51.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_51.nextDouble();
			return Math.random();
		}
	}


}