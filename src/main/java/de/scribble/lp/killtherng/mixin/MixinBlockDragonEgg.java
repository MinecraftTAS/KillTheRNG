package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockDragonEgg;

@Mixin(BlockDragonEgg.class)
public class MixinBlockDragonEgg {
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_488(Random rand, int i) {
		return KillTheRNG.randomness.random_488.nextInt(i);
	}

	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_489(Random rand, int i) {
		return KillTheRNG.randomness.random_489.nextInt(i);
	}

	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_490(Random rand, int i) {
		return KillTheRNG.randomness.random_490.nextInt(i);
	}

	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_491(Random rand, int i) {
		return KillTheRNG.randomness.random_491.nextInt(i);
	}

	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_492(Random rand, int i) {
		return KillTheRNG.randomness.random_492.nextInt(i);
	}

	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_493(Random rand, int i) {
		return KillTheRNG.randomness.random_493.nextInt(i);
	}

	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 6))
	public double redirect_random_494(Random rand) {
		return KillTheRNG.randomness.random_494.nextDouble();
	}

	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_random_495(Random rand) {
		return KillTheRNG.randomness.random_495.nextFloat();
	}

	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 8))
	public float redirect_random_496(Random rand) {
		return KillTheRNG.randomness.random_496.nextFloat();
	}

	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 9))
	public float redirect_random_497(Random rand) {
		return KillTheRNG.randomness.random_497.nextFloat();
	}

	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 10))
	public double redirect_random_498(Random rand) {
		return KillTheRNG.randomness.random_498.nextDouble();
	}

	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 11))
	public double redirect_random_499(Random rand) {
		return KillTheRNG.randomness.random_499.nextDouble();
	}

	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 12))
	public double redirect_random_500(Random rand) {
		return KillTheRNG.randomness.random_500.nextDouble();
	}

}
