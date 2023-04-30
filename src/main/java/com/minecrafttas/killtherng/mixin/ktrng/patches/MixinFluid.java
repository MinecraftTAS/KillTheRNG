package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraftforge.fluids.Fluid.class)
public class MixinFluid{

	/**
	* Pitch of the fluid vaporization sound
	*/
	@Redirect(method = "vaporize(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraftforge/fluids/FluidStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0), remap = false)
	public float redirect_vaporizationParticlePitch_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.vaporizationParticlePitch.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.vaporizationParticlePitch.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.vaporizationParticlePitch.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of the fluid vaporization sound
	*/
	@Redirect(method = "vaporize(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraftforge/fluids/FluidStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1), remap = false)
	public float redirect_vaporizationParticlePitch_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.vaporizationParticlePitch.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.vaporizationParticlePitch.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.vaporizationParticlePitch.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of the fluid vaporization particle
	*/
	@Redirect(method = "vaporize(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraftforge/fluids/FluidStack;)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0), remap = false)
	public double redirect_vaporizationParticlePosition_3() {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.vaporizationParticlePosition.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.vaporizationParticlePosition.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.vaporizationParticlePosition.nextDouble();
			return Math.random();
		}
	}

	/**
	* Position of the fluid vaporization particle
	*/
	@Redirect(method = "vaporize(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraftforge/fluids/FluidStack;)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1), remap = false)
	public double redirect_vaporizationParticlePosition_4() {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.vaporizationParticlePosition.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.vaporizationParticlePosition.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.vaporizationParticlePosition.nextDouble();
			return Math.random();
		}
	}

	/**
	* Position of the fluid vaporization particle
	*/
	@Redirect(method = "vaporize(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraftforge/fluids/FluidStack;)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 2), remap = false)
	public double redirect_vaporizationParticlePosition_5() {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.vaporizationParticlePosition.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.vaporizationParticlePosition.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.vaporizationParticlePosition.nextDouble();
			return Math.random();
		}
	}


}