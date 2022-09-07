package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.tileentity.TileEntityEnchantmentTable;

@Mixin(TileEntityEnchantmentTable.class)
public class MixinTileEntityEnchantmentTable {

	/**
	* Whether the book on the enchanter should open
	*/
	@Redirect(method = "update()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_enchantmentTableTileBookSpread_1(Random rand, int i) {
		return KillTheRNG.randomness.enchantmentTableTileBookSpread.nextInt(i);
//		KillTheRNG.randomness.enchantmentTableTileBookSpread.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* If the pages of the book should flip
	*/
	@Redirect(method = "update()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_enchantmentTableTileFlipT_2(Random rand, int i) {
//		return KillTheRNG.randomness.enchantmentTableTileFlipT.nextInt(i);
		KillTheRNG.randomness.enchantmentTableTileFlipT.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* If the pages of the book should flip
	*/
	@Redirect(method = "update()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_enchantmentTableTileFlipT_3(Random rand, int i) {
//		return KillTheRNG.randomness.enchantmentTableTileFlipT.nextInt(i);
		KillTheRNG.randomness.enchantmentTableTileFlipT.nextInt(i);
		return rand.nextInt(i);
	}

}
