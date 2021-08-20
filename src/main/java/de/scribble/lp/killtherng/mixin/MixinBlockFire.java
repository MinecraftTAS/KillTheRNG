package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockFire;

@Mixin(BlockFire.class)
public class MixinBlockFire {

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_362_0(Random rand) {
		return KillTheRNG.randomness.random_362.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_363_1(Random rand, int i) {
		return KillTheRNG.randomness.random_363.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_364_2(Random rand, int i) {
		return KillTheRNG.randomness.random_364.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_365_3(Random rand, int i) {
		return KillTheRNG.randomness.random_365.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_366_4(Random rand, int i) {
		return KillTheRNG.randomness.random_366.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_367_5(Random rand, int i) {
		return KillTheRNG.randomness.random_367.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "tryCatchFire(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;ILjava/util/Random;ILnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_368_0(Random rand, int i) {
		return KillTheRNG.randomness.random_368.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "tryCatchFire(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;ILjava/util/Random;ILnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_369_1(Random rand, int i) {
		return KillTheRNG.randomness.random_369.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "tryCatchFire(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;ILjava/util/Random;ILnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_370_2(Random rand, int i) {
		return KillTheRNG.randomness.random_370.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "onBlockAdded(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_371_0(Random rand, int i) {
		return KillTheRNG.randomness.random_371.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_372_0(Random rand, int i) {
		return KillTheRNG.randomness.random_372.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_373_1(Random rand) {
		return KillTheRNG.randomness.random_373.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_374_2(Random rand) {
		return KillTheRNG.randomness.random_374.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_375_3(Random rand) {
		return KillTheRNG.randomness.random_375.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_376_4(Random rand) {
		return KillTheRNG.randomness.random_376.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_377_5(Random rand) {
		return KillTheRNG.randomness.random_377.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 6))
	public double redirect_random_378_6(Random rand) {
		return KillTheRNG.randomness.random_378.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 7))
	public double redirect_random_379_7(Random rand) {
		return KillTheRNG.randomness.random_379.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 8))
	public double redirect_random_380_8(Random rand) {
		return KillTheRNG.randomness.random_380.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 9))
	public double redirect_random_381_9(Random rand) {
		return KillTheRNG.randomness.random_381.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 10))
	public double redirect_random_382_10(Random rand) {
		return KillTheRNG.randomness.random_382.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 11))
	public double redirect_random_383_11(Random rand) {
		return KillTheRNG.randomness.random_383.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 12))
	public double redirect_random_384_12(Random rand) {
		return KillTheRNG.randomness.random_384.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 13))
	public double redirect_random_385_13(Random rand) {
		return KillTheRNG.randomness.random_385.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 14))
	public double redirect_random_386_14(Random rand) {
		return KillTheRNG.randomness.random_386.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 15))
	public double redirect_random_387_15(Random rand) {
		return KillTheRNG.randomness.random_387.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 16))
	public double redirect_random_388_16(Random rand) {
		return KillTheRNG.randomness.random_388.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 17))
	public double redirect_random_389_17(Random rand) {
		return KillTheRNG.randomness.random_389.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 18))
	public double redirect_random_390_18(Random rand) {
		return KillTheRNG.randomness.random_390.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 19))
	public double redirect_random_391_19(Random rand) {
		return KillTheRNG.randomness.random_391.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 20))
	public double redirect_random_392_20(Random rand) {
		return KillTheRNG.randomness.random_392.nextDouble();
	}

}
