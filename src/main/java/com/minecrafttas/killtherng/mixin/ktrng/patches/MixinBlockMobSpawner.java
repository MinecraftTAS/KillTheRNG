package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockMobSpawner.class)
public class MixinBlockMobSpawner{

	/**
	* Amount of xp dropped by a mob spawner
	*/
	@Redirect(method = "getExpDrop(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;I)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	public int redirect_mobspawnerXpAmount_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mobspawnerXpAmount.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mobspawnerXpAmount.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mobspawnerXpAmount.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Amount of xp dropped by a mob spawner
	*/
	@Redirect(method = "getExpDrop(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;I)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1), remap = false)
	public int redirect_mobspawnerXpAmount_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mobspawnerXpAmount.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mobspawnerXpAmount.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mobspawnerXpAmount.nextInt(i);
			return rand.nextInt(i);
		}
	}


}