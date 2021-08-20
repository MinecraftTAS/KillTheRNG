package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockPortal;

@Mixin(BlockPortal.class)
public class MixinBlockPortal {

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_438_0(Random rand, int i) {
		return KillTheRNG.randomness.random_438.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_439_0(Random rand, int i) {
		return KillTheRNG.randomness.random_439.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_440_1(Random rand) {
		return KillTheRNG.randomness.random_440.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_441_2(Random rand) {
		return KillTheRNG.randomness.random_441.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_442_3(Random rand) {
		return KillTheRNG.randomness.random_442.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_443_4(Random rand) {
		return KillTheRNG.randomness.random_443.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_444_5(Random rand) {
		return KillTheRNG.randomness.random_444.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_445_6(Random rand) {
		return KillTheRNG.randomness.random_445.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_random_446_7(Random rand) {
		return KillTheRNG.randomness.random_446.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_random_447_8(Random rand, int i) {
		return KillTheRNG.randomness.random_447.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 9))
	public float redirect_random_448_9(Random rand) {
		return KillTheRNG.randomness.random_448.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 10))
	public float redirect_random_449_10(Random rand) {
		return KillTheRNG.randomness.random_449.nextFloat();
	}

}
