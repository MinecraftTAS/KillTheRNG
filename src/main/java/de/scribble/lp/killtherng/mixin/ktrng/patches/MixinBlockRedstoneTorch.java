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
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_410_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_410.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_410.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_410.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_411_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_411.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_411.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_411.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_412_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_412.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_412.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_412.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_413_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_413.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_413.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_413.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_414_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_414.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_414.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_414.nextDouble();
			return rand.nextDouble();
		}
	}


}