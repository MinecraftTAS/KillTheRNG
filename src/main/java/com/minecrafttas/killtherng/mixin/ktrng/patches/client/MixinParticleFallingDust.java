package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleFallingDust.class)
public class MixinParticleFallingDust{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDFFF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_75_1() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_75.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_75.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_75.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDFFF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_76_2() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_76.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_76.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_76.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDFFF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 2))
	public double redirect_math_random_77_3() {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_77.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_77.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_77.nextDouble();
			return Math.random();
		}
	}


}