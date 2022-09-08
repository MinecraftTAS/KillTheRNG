package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockNetherWart.class)
public class MixinBlockNetherWart{

	/**
	* null
	*/
	@Redirect(method = "getDrops(Lnet/minecraft/util/NonNullList;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	public int redirect_random_473_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_473.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_473.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getDrops(Lnet/minecraft/util/NonNullList;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1), remap = false)
	public int redirect_random_474_2(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_474.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_474.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_472_3(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_472.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_472.nextInt(i);
//		return rand.nextInt(i);
	}


}