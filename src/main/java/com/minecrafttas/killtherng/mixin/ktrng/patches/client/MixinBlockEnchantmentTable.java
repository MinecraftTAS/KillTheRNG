package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockEnchantmentTable.class)
public class MixinBlockEnchantmentTable{

	/**
	* If enchantement table particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_enchantementTableParticleChance_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.enchantementTableParticleChance.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.enchantementTableParticleChance.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.enchantementTableParticleChance.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The position of enchantment table particles
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_enchantementTableParticlePos_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.enchantementTableParticlePos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.enchantementTableParticlePos.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.enchantementTableParticlePos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* The position of enchantment table particles
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_enchantementTableParticlePos_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.enchantementTableParticlePos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.enchantementTableParticlePos.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.enchantementTableParticlePos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* The position of enchantment table particles
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_enchantementTableParticlePos_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.enchantementTableParticlePos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.enchantementTableParticlePos.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.enchantementTableParticlePos.nextFloat();
			return rand.nextFloat();
		}
	}


}