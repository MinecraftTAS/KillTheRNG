package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockChorusFlower.class)
public class MixinBlockChorusFlower{

	/**
	* Random direction a chorus flower grows
	*/
	@Redirect(method = "growTreeRecursive(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_chorusGrow_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.chorusGrow.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.chorusGrow.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.chorusGrow.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Random direction a chorus flower grows
	*/
	@Redirect(method = "growTreeRecursive(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_chorusGrowDirection_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.chorusGrowDirection.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.chorusGrowDirection.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.chorusGrowDirection.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* WHY IS THIS HEEEEERRRREEEEE ITS SO FUCKING USELESS AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_pointlessness_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.pointlessness.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.pointlessness.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.pointlessness.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Chance for chorus fruit to grow in height
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_chorusGrowHeight_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.chorusGrowHeight.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.chorusGrowHeight.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.chorusGrowHeight.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Something about chorus growing
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_chorusGrowSomething_5(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.chorusGrowSomething.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.chorusGrowSomething.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.chorusGrowSomething.nextInt(i);
			return rand.nextInt(i);
		}
	}


}