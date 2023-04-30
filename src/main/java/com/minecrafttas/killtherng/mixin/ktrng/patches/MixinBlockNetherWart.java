package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockNetherWart.class)
public class MixinBlockNetherWart{

	/**
	* Quantity of nether warts dropped
	*/
	@Redirect(method = "getDrops(Lnet/minecraft/util/NonNullList;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	public int redirect_netherWartDrop_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherWartDrop.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherWartDrop.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherWartDrop.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Quantity of fortune bonus
	*/
	@Redirect(method = "getDrops(Lnet/minecraft/util/NonNullList;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1), remap = false)
	public int redirect_netherWartDropFortuneBonus_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherWartDropFortuneBonus.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherWartDropFortuneBonus.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherWartDropFortuneBonus.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Chance of nether wart growing
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_netherWartGrowChance_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherWartGrowChance.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherWartGrowChance.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherWartGrowChance.nextInt(i);
			return rand.nextInt(i);
		}
	}


}