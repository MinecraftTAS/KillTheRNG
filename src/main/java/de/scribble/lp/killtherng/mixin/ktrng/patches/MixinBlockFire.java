package de.scribble.lp.killtherng.mixin.ktrng.patches;

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
	public float redirect_random_362_1(Random rand) {
		return KillTheRNG.randomness.random_362.nextFloat();
//		KillTheRNG.randomness.random_362.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_363_2(Random rand, int i) {
		return KillTheRNG.randomness.random_363.nextInt(i);
//		KillTheRNG.randomness.random_363.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_364_3(Random rand, int i) {
		return KillTheRNG.randomness.random_364.nextInt(i);
//		KillTheRNG.randomness.random_364.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_365_4(Random rand, int i) {
		return KillTheRNG.randomness.random_365.nextInt(i);
//		KillTheRNG.randomness.random_365.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_366_5(Random rand, int i) {
		return KillTheRNG.randomness.random_366.nextInt(i);
//		KillTheRNG.randomness.random_366.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_367_6(Random rand, int i) {
		return KillTheRNG.randomness.random_367.nextInt(i);
//		KillTheRNG.randomness.random_367.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "tryCatchFire(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;ILjava/util/Random;ILnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap=false)
	public int redirect_random_368_7(Random rand, int i) {
		return KillTheRNG.randomness.random_368.nextInt(i);
//		KillTheRNG.randomness.random_368.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "tryCatchFire(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;ILjava/util/Random;ILnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1), remap=false)
	public int redirect_random_369_8(Random rand, int i) {
		return KillTheRNG.randomness.random_369.nextInt(i);
//		KillTheRNG.randomness.random_369.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "tryCatchFire(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;ILjava/util/Random;ILnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2), remap=false)
	public int redirect_random_370_9(Random rand, int i) {
		return KillTheRNG.randomness.random_370.nextInt(i);
//		KillTheRNG.randomness.random_370.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Chance whether fire can spread
	*/
	@Redirect(method = "onBlockAdded(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_fireSpreading_10(Random rand, int i) {
		return KillTheRNG.randomness.fireSpreading.nextInt(i);
//		KillTheRNG.randomness.fireSpreading.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_372_11(Random rand, int i) {
		return KillTheRNG.randomness.random_372.nextInt(i);
//		KillTheRNG.randomness.random_372.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_373_12(Random rand) {
		return KillTheRNG.randomness.random_373.nextFloat();
//		KillTheRNG.randomness.random_373.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_374_13(Random rand) {
		return KillTheRNG.randomness.random_374.nextFloat();
//		KillTheRNG.randomness.random_374.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_375_14(Random rand) {
		return KillTheRNG.randomness.random_375.nextDouble();
//		KillTheRNG.randomness.random_375.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_376_15(Random rand) {
		return KillTheRNG.randomness.random_376.nextDouble();
//		KillTheRNG.randomness.random_376.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_377_16(Random rand) {
		return KillTheRNG.randomness.random_377.nextDouble();
//		KillTheRNG.randomness.random_377.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_378_17(Random rand) {
		return KillTheRNG.randomness.random_378.nextDouble();
//		KillTheRNG.randomness.random_378.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_379_18(Random rand) {
		return KillTheRNG.randomness.random_379.nextDouble();
//		KillTheRNG.randomness.random_379.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_380_19(Random rand) {
		return KillTheRNG.randomness.random_380.nextDouble();
//		KillTheRNG.randomness.random_380.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 6))
	public double redirect_random_381_20(Random rand) {
		return KillTheRNG.randomness.random_381.nextDouble();
//		KillTheRNG.randomness.random_381.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 7))
	public double redirect_random_382_21(Random rand) {
		return KillTheRNG.randomness.random_382.nextDouble();
//		KillTheRNG.randomness.random_382.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 8))
	public double redirect_random_383_22(Random rand) {
		return KillTheRNG.randomness.random_383.nextDouble();
//		KillTheRNG.randomness.random_383.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 9))
	public double redirect_random_384_23(Random rand) {
		return KillTheRNG.randomness.random_384.nextDouble();
//		KillTheRNG.randomness.random_384.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 10))
	public double redirect_random_385_24(Random rand) {
		return KillTheRNG.randomness.random_385.nextDouble();
//		KillTheRNG.randomness.random_385.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 11))
	public double redirect_random_386_25(Random rand) {
		return KillTheRNG.randomness.random_386.nextDouble();
//		KillTheRNG.randomness.random_386.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 12))
	public double redirect_random_387_26(Random rand) {
		return KillTheRNG.randomness.random_387.nextDouble();
//		KillTheRNG.randomness.random_387.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 13))
	public double redirect_random_388_27(Random rand) {
		return KillTheRNG.randomness.random_388.nextDouble();
//		KillTheRNG.randomness.random_388.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 14))
	public double redirect_random_389_28(Random rand) {
		return KillTheRNG.randomness.random_389.nextDouble();
//		KillTheRNG.randomness.random_389.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 15))
	public double redirect_random_390_29(Random rand) {
		return KillTheRNG.randomness.random_390.nextDouble();
//		KillTheRNG.randomness.random_390.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 16))
	public double redirect_random_391_30(Random rand) {
		return KillTheRNG.randomness.random_391.nextDouble();
//		KillTheRNG.randomness.random_391.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 17))
	public double redirect_random_392_31(Random rand) {
		return KillTheRNG.randomness.random_392.nextDouble();
//		KillTheRNG.randomness.random_392.nextDouble();
//		return rand.nextDouble();
	}

}
