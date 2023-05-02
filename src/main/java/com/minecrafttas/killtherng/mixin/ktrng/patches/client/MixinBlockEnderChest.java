package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockEnderChest.class)
public class MixinBlockEnderChest{

	/**
	* Where the ender chest particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_enderChestParticle_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.enderChestParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.enderChestParticle.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.enderChestParticle.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Where the ender chest particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_enderChestParticle_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.enderChestParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.enderChestParticle.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.enderChestParticle.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Where the ender chest particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_enderChestParticle_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.enderChestParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.enderChestParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.enderChestParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the ender chest particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_enderChestParticle_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.enderChestParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.enderChestParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.enderChestParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the ender chest particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_enderChestParticle_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.enderChestParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.enderChestParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.enderChestParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the ender chest particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_enderChestParticle_6(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.enderChestParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.enderChestParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.enderChestParticle.nextFloat();
			return rand.nextFloat();
		}
	}


}