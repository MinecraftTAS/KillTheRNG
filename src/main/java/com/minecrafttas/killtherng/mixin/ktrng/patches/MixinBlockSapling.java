package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockSapling.class)
public class MixinBlockSapling{

	/**
	* Chance of a sapling growing after being bonemealed
	*/
	@Redirect(method = "canUseBonemeal(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_boneMealSapling_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.boneMealSapling.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.boneMealSapling.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.boneMealSapling.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* If a tree is big or not when a sapling is grown
	*/
	@Redirect(method = "generateTree(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_growBigOakTreeFromSapling_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.growBigOakTreeFromSapling.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.growBigOakTreeFromSapling.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.growBigOakTreeFromSapling.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* How big the leaf crown of a mega spruce tree is
	*/
	@Redirect(method = "generateTree(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_megaSpruceTreeCrownSizeFromSapling_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.megaSpruceTreeCrownSizeFromSapling.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.megaSpruceTreeCrownSizeFromSapling.nextBoolean();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.megaSpruceTreeCrownSizeFromSapling.nextBoolean();
			return rand.nextBoolean();
		}
	}

	/**
	* The minimum height of a jungle tree from a jungle sapling
	*/
	@Redirect(method = "generateTree(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_jungleMinimumTreeHeightFromSapling_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleMinimumTreeHeightFromSapling.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleMinimumTreeHeightFromSapling.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleMinimumTreeHeightFromSapling.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Determines when a sapling grows into a tree
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_growTreeChance_5(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.growTreeChance.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.growTreeChance.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.growTreeChance.nextInt(i);
			return rand.nextInt(i);
		}
	}


}