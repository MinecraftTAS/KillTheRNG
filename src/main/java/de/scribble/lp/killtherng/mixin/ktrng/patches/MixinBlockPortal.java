package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockPortal.class)
public class MixinBlockPortal{

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_439_1(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_439.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.random_439.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_440_2(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_440.nextFloat();
		de.scribble.lp.killtherng.KillTheRNG.randomness.random_440.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_441_3(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_441.nextFloat();
		de.scribble.lp.killtherng.KillTheRNG.randomness.random_441.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_442_4(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_442.nextFloat();
		de.scribble.lp.killtherng.KillTheRNG.randomness.random_442.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_443_5(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_443.nextFloat();
		de.scribble.lp.killtherng.KillTheRNG.randomness.random_443.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_444_6(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_444.nextFloat();
		de.scribble.lp.killtherng.KillTheRNG.randomness.random_444.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_445_7(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_445.nextFloat();
		de.scribble.lp.killtherng.KillTheRNG.randomness.random_445.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_446_8(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_446.nextFloat();
		de.scribble.lp.killtherng.KillTheRNG.randomness.random_446.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_447_9(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_447.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.random_447.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_random_448_10(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_448.nextFloat();
		de.scribble.lp.killtherng.KillTheRNG.randomness.random_448.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 8))
	public float redirect_random_449_11(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_449.nextFloat();
		de.scribble.lp.killtherng.KillTheRNG.randomness.random_449.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_438_12(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_438.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_438.nextInt(i);
//		return rand.nextInt(i);
	}


}