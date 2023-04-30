package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleSnowShovel.class)
public class MixinParticleSnowShovel{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDDF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_78_1() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_78.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_78.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_78.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDDF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_79_2() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_79.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_79.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_79.nextDouble();
			return Math.random();
		}
	}


}