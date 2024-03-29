package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockCrops.class)
public class MixinBlockCrops{

	/**
	* Chance for a crop to drop + quantity
	*/
	@Redirect(method = "getDrops(Lnet/minecraft/util/NonNullList;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	public int redirect_cropDrop_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.cropDrop.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.cropDrop.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.cropDrop.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Chance for a crop to grow
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_cropGrow_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.cropGrow.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.cropGrow.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.cropGrow.nextInt(i);
			return rand.nextInt(i);
		}
	}


}