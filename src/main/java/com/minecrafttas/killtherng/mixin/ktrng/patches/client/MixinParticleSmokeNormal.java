package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleSmokeNormal.class)
public class MixinParticleSmokeNormal{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDDF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_65_1() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_65.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_65.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_65.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDDF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_66_2() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_66.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_66.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_66.nextDouble();
			return Math.random();
		}
	}


}