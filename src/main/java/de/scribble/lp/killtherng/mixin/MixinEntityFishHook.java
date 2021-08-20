package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.projectile.EntityFishHook;

@Mixin(EntityFishHook.class)
public class MixinEntityFishHook {

	/**
	* null
	*/
	@Redirect(method = "shoot()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_609_0(Random rand) {
		return KillTheRNG.randomness.random_609.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "shoot()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_610_1(Random rand) {
		return KillTheRNG.randomness.random_610.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "shoot()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_611_2(Random rand) {
		return KillTheRNG.randomness.random_611.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_612_0(Random rand) {
		return KillTheRNG.randomness.random_612.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_613_0(Random rand) {
		return KillTheRNG.randomness.random_613.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_614_1(Random rand) {
		return KillTheRNG.randomness.random_614.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_615_2(Random rand) {
		return KillTheRNG.randomness.random_615.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_616_3(Random rand) {
		return KillTheRNG.randomness.random_616.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 4))
	public double redirect_random_617_4(Random rand) {
		return KillTheRNG.randomness.random_617.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_618_5(Random rand) {
		return KillTheRNG.randomness.random_618.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_619_6(Random rand) {
		return KillTheRNG.randomness.random_619.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_random_620_7(Random rand) {
		return KillTheRNG.randomness.random_620.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 8))
	public float redirect_random_621_8(Random rand) {
		return KillTheRNG.randomness.random_621.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_random_622_9(Random rand, int i) {
		return KillTheRNG.randomness.random_622.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "handleHookRetraction()I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_623_0(Random rand, int i) {
		return KillTheRNG.randomness.random_623.nextInt(i);
	}

}
