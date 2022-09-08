package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockMycelium.class)
public class MixinBlockMycelium{

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_469_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_469.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_469.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_470_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_470.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_470.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_471_3(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_471.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_471.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_466_4(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_466.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_466.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_467_5(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_467.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_467.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_468_6(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_468.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_468.nextInt(i);
//		return rand.nextInt(i);
	}


}