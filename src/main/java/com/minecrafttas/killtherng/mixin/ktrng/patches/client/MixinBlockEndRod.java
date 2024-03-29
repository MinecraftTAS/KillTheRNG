package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockEndRod.class)
public class MixinBlockEndRod{

	/**
	* The position of end rod particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_endRodParticle_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* The position of end rod particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_endRodParticle_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* The position of end rod particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_endRodParticle_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* The position of end rod particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_endRodParticle_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* The position of end rod particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_endRodParticle_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Chance for the end rod particle to spawn
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_endRodParticleChance_6(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticleChance.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticleChance.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticleChance.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The position of end rod particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_endRodParticle_7(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticle.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticle.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* The position of end rod particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_endRodParticle_8(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticle.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticle.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* The position of end rod particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_endRodParticle_9(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticle.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.endRodParticle.nextGaussian();
			return rand.nextGaussian();
		}
	}


}