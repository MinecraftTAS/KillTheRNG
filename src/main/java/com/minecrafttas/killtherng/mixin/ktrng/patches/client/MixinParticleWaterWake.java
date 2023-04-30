package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleWaterWake.class)
public class MixinParticleWaterWake{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_61_1() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_61.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_61.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_61.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_62_2() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_62.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_62.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_62.nextDouble();
			return Math.random();
		}
	}


}