package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
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
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_415.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_415.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_415.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_416_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_416.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_416.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_416.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_417_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_417.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_417.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_417.nextDouble();
			return rand.nextDouble();
		}
	}


}