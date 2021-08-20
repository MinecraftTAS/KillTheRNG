package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockDragonEgg;

@Mixin(BlockDragonEgg.class)
public class MixinBlockDragonEgg {

	/**
	* null
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_488_0(Random rand, int i) {
		return KillTheRNG.randomness.random_488.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_489_1(Random rand, int i) {
		return KillTheRNG.randomness.random_489.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_490_2(Random rand, int i) {
		return KillTheRNG.randomness.random_490.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_491_3(Random rand, int i) {
		return KillTheRNG.randomness.random_491.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_492_4(Random rand, int i) {
		return KillTheRNG.randomness.random_492.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_493_5(Random rand, int i) {
		return KillTheRNG.randomness.random_493.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 6))
	public double redirect_random_494_6(Random rand) {
		return KillTheRNG.randomness.random_494.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_random_495_7(Random rand) {
		return KillTheRNG.randomness.random_495.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 8))
	public float redirect_random_496_8(Random rand) {
		return KillTheRNG.randomness.random_496.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 9))
	public float redirect_random_497_9(Random rand) {
		return KillTheRNG.randomness.random_497.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 10))
	public double redirect_random_498_10(Random rand) {
		return KillTheRNG.randomness.random_498.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 11))
	public double redirect_random_499_11(Random rand) {
		return KillTheRNG.randomness.random_499.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 12))
	public double redirect_random_500_12(Random rand) {
		return KillTheRNG.randomness.random_500.nextDouble();
	}

}
