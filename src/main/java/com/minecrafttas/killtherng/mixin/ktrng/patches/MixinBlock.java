package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.Block.class)
public class MixinBlock{

	/**
	* If a drop should be dropped
	*/
	@Redirect(method = "dropBlockAsItemWithChance(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;FI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_blockDropItemChance_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.blockDropItemChance.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.blockDropItemChance.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.blockDropItemChance.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the spawned item should spawn
	*/
	@Redirect(method = "spawnAsEntity(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_blockDropPos_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.blockDropPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.blockDropPos.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.blockDropPos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the spawned item should spawn
	*/
	@Redirect(method = "spawnAsEntity(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	private static float redirect_blockDropPos_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.blockDropPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.blockDropPos.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.blockDropPos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the spawned item should spawn
	*/
	@Redirect(method = "spawnAsEntity(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	private static float redirect_blockDropPos_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.blockDropPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.blockDropPos.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.blockDropPos.nextFloat();
			return rand.nextFloat();
		}
	}


}