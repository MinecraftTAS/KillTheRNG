package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleCrit.class)
public class MixinParticleCrit{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDDF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_63_1() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_63.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_63.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_63.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDDF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_64_2() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_64.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_64.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_64.nextDouble();
			return Math.random();
		}
	}


}