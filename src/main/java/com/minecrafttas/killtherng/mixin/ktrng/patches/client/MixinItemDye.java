package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.item.ItemDye.class)
public class MixinItemDye{

	/**
	* Position of bonemeal particles
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	private static double redirect_dyeBonemealParticles_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position of bonemeal particles
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	private static double redirect_dyeBonemealParticles_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position of bonemeal particles
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	private static double redirect_dyeBonemealParticles_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position of bonemeal particles
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_dyeBonemealParticles_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of bonemeal particles
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	private static float redirect_dyeBonemealParticles_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of bonemeal particles
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	private static float redirect_dyeBonemealParticles_6(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of bonemeal particles
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 3))
	private static double redirect_dyeBonemealParticles_7(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position of bonemeal particles
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 4))
	private static double redirect_dyeBonemealParticles_8(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position of bonemeal particles
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 5))
	private static double redirect_dyeBonemealParticles_9(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position of bonemeal particles
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	private static float redirect_dyeBonemealParticles_10(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of bonemeal particles
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	private static float redirect_dyeBonemealParticles_11(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of bonemeal particles
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	private static float redirect_dyeBonemealParticles_12(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.dyeBonemealParticles.nextFloat();
			return rand.nextFloat();
		}
	}


}