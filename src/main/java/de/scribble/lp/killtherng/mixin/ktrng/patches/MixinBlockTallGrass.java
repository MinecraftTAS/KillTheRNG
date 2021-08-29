package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockTallGrass;

@Mixin(BlockTallGrass.class)
public class MixinBlockTallGrass {

	/**
	* null
	*/
	@Redirect(method = "getDrops(Lnet/minecraft/util/NonNullList;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap=false)
	public int redirect_random_346_1(Random rand, int i) {
		return KillTheRNG.randomness.random_346.nextInt(i);
//		KillTheRNG.randomness.random_346.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "quantityDroppedWithBonus(ILjava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_345_2(Random rand, int i) {
		return KillTheRNG.randomness.random_345.nextInt(i);
//		KillTheRNG.randomness.random_345.nextInt(i);
//		return rand.nextInt(i);
	}

}
