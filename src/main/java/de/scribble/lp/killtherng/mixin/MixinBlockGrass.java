package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockGrass;

@Mixin(BlockGrass.class)
public class MixinBlockGrass {

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_227_0(Random rand, int i) {
		return KillTheRNG.randomness.random_227.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_228_1(Random rand, int i) {
		return KillTheRNG.randomness.random_228.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_229_2(Random rand, int i) {
		return KillTheRNG.randomness.random_229.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "grow(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_230_0(Random rand, int i) {
		return KillTheRNG.randomness.random_230.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "grow(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_231_1(Random rand, int i) {
		return KillTheRNG.randomness.random_231.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "grow(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_232_2(Random rand, int i) {
		return KillTheRNG.randomness.random_232.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "grow(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_233_3(Random rand, int i) {
		return KillTheRNG.randomness.random_233.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "grow(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_234_4(Random rand, int i) {
		return KillTheRNG.randomness.random_234.nextInt(i);
	}

}
