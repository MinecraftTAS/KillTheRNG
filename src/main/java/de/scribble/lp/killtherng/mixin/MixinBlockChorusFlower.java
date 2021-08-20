package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockChorusFlower;

@Mixin(BlockChorusFlower.class)
public class MixinBlockChorusFlower {

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_543_0(Random rand, int i) {
		return KillTheRNG.randomness.random_543.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_544_1(Random rand, int i) {
		return KillTheRNG.randomness.random_544.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_545_2(Random rand, int i) {
		return KillTheRNG.randomness.random_545.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "growTreeRecursive(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_546_0(Random rand, int i) {
		return KillTheRNG.randomness.random_546.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "growTreeRecursive(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_random_547_1(Random rand, int i) {
		return KillTheRNG.randomness.random_547.nextInt(i);
	}

}
