package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.tileentity.TileEntityEnchantmentTable.class)
public class MixinTileEntityEnchantmentTable{

	/**
	* Whether the book on the enchanter should open
	*/
	@Redirect(method = "update()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_enchantmentTableTileBookSpread_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantmentTableTileBookSpread.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantmentTableTileBookSpread.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantmentTableTileBookSpread.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* If the pages of the book should flip
	*/
	@Redirect(method = "update()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_enchantmentTableTileFlipT_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantmentTableTileFlipT.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantmentTableTileFlipT.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantmentTableTileFlipT.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* If the pages of the book should flip
	*/
	@Redirect(method = "update()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_enchantmentTableTileFlipT_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantmentTableTileFlipT.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantmentTableTileFlipT.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantmentTableTileFlipT.nextInt(i);
			return rand.nextInt(i);
		}
	}


}