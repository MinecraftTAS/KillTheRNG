package de.scribble.lp.killtherng.mixin.ktrng.patches;

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
	public int redirect_random_543_1(Random rand, int i) {
		return KillTheRNG.randomness.random_543.nextInt(i);
//		KillTheRNG.randomness.random_543.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_544_2(Random rand, int i) {
		return KillTheRNG.randomness.random_544.nextInt(i);
//		KillTheRNG.randomness.random_544.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_545_3(Random rand, int i) {
		return KillTheRNG.randomness.random_545.nextInt(i);
//		KillTheRNG.randomness.random_545.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "growTreeRecursive(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_546_4(Random rand, int i) {
		return KillTheRNG.randomness.random_546.nextInt(i);
//		KillTheRNG.randomness.random_546.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "growTreeRecursive(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_random_547_5(Random rand, int i) {
		return KillTheRNG.randomness.random_547.nextInt(i);
//		KillTheRNG.randomness.random_547.nextInt(i);
//		return rand.nextInt(i);
	}

}
