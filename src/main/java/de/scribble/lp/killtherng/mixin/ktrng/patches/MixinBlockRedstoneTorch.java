package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockRedstoneTorch.class)
public class MixinBlockRedstoneTorch{

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_415_1(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_415.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_415.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_416_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_416.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_416.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_417_3(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_417.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_417.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_410_4(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_410.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_410.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_411_5(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_411.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_411.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_412_6(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_412.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_412.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_413_7(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_413.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_413.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_414_8(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_414.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_414.nextDouble();
//		return rand.nextDouble();
	}


}