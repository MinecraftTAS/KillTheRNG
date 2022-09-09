package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
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
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_328.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_328.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_328.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_329_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_329.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_329.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_329.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_330_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_330.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_330.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_330.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_331_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_331.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_331.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_331.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_332_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_332.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_332.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_332.nextDouble();
			return rand.nextDouble();
		}
	}


}