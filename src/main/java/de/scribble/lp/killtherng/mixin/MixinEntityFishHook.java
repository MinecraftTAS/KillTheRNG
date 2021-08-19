package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.projectile.EntityFishHook;

@Mixin(EntityFishHook.class)
public class MixinEntityFishHook {
	@Redirect(method = "shoot()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_609(Random rand) {
		return KillTheRNG.randomness.random_609.nextGaussian();
	}

	@Redirect(method = "shoot()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_610(Random rand) {
		return KillTheRNG.randomness.random_610.nextGaussian();
	}

	@Redirect(method = "shoot()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_611(Random rand) {
		return KillTheRNG.randomness.random_611.nextGaussian();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_612(Random rand) {
		return KillTheRNG.randomness.random_612.nextFloat();
	}

	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_613(Random rand) {
		return KillTheRNG.randomness.random_613.nextFloat();
	}

	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_614(Random rand) {
		return KillTheRNG.randomness.random_614.nextFloat();
	}

	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_615(Random rand) {
		return KillTheRNG.randomness.random_615.nextFloat();
	}

	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_616(Random rand) {
		return KillTheRNG.randomness.random_616.nextFloat();
	}

	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 4))
	public double redirect_random_617(Random rand) {
		return KillTheRNG.randomness.random_617.nextGaussian();
	}

	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_618(Random rand) {
		return KillTheRNG.randomness.random_618.nextFloat();
	}

	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_619(Random rand) {
		return KillTheRNG.randomness.random_619.nextFloat();
	}

	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_random_620(Random rand) {
		return KillTheRNG.randomness.random_620.nextFloat();
	}

	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 8))
	public float redirect_random_621(Random rand) {
		return KillTheRNG.randomness.random_621.nextFloat();
	}

	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_random_622(Random rand, int i) {
		return KillTheRNG.randomness.random_622.nextInt(i);
	}

	@Redirect(method = "handleHookRetraction()I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_623(Random rand, int i) {
		return KillTheRNG.randomness.random_623.nextInt(i);
	}

}
