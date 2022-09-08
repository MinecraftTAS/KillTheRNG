package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockSponge.class)
public class MixinBlockSponge{

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_328_1(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_328.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_328.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_329_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_329.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_329.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_330_3(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_330.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_330.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_331_4(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_331.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_331.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_332_5(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_332.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_332.nextDouble();
//		return rand.nextDouble();
	}


}