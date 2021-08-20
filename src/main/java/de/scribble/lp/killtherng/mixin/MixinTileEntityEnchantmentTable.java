package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.tileentity.TileEntityEnchantmentTable;

@Mixin(TileEntityEnchantmentTable.class)
public class MixinTileEntityEnchantmentTable {

	/**
	* null
	*/
	@Redirect(method = "update()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_479_0(Random rand, int i) {
		return KillTheRNG.randomness.random_479.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "update()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_480_1(Random rand, int i) {
		return KillTheRNG.randomness.random_480.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "update()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_481_2(Random rand, int i) {
		return KillTheRNG.randomness.random_481.nextInt(i);
	}

}
