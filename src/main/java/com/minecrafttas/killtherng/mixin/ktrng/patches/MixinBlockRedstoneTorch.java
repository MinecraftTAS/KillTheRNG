package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockRedstoneTorch.class)
public class MixinBlockRedstoneTorch{

	/**
	* Sound of redstone torch burning out
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_redstoneTorchBurnoutSound_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.redstoneTorchBurnoutSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.redstoneTorchBurnoutSound.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.redstoneTorchBurnoutSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Sound of redstone torch burning out
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_redstoneTorchBurnoutSound_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.redstoneTorchBurnoutSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.redstoneTorchBurnoutSound.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.redstoneTorchBurnoutSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Particles of redstone torch burning out
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_redstoneTorchBurnoutParticles_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.redstoneTorchBurnoutParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.redstoneTorchBurnoutParticles.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.redstoneTorchBurnoutParticles.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Particles of redstone torch burning out
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_redstoneTorchBurnoutParticles_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.redstoneTorchBurnoutParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.redstoneTorchBurnoutParticles.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.redstoneTorchBurnoutParticles.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Particles of redstone torch burning out
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_redstoneTorchBurnoutParticles_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.redstoneTorchBurnoutParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.redstoneTorchBurnoutParticles.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.redstoneTorchBurnoutParticles.nextDouble();
			return rand.nextDouble();
		}
	}


}