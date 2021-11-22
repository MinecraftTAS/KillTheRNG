package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.projectile.EntityFishHook;

@Mixin(EntityFishHook.class)
public class MixinEntityFishHook {

	/**
	* The time it takes to count down the fishing delay when raining
	*/
	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_fishHookTicksCatchableRain_1(Random rand) {
		return KillTheRNG.randomness.fishHookTicksCatchableRain.nextFloat();
//		KillTheRNG.randomness.fishHookTicksCatchableRain.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* The time it takes to count down the fishing delay when raining
	*/
	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_fishHookTicksCatchableRain_2(Random rand) {
		return KillTheRNG.randomness.fishHookTicksCatchableRain.nextFloat();
//		KillTheRNG.randomness.fishHookTicksCatchableRain.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* The time it takes to count down the fishing delay when raining
	*/
	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_fishHookTicksCatchableRain_3(Random rand) {
		return KillTheRNG.randomness.fishHookTicksCatchableRain.nextFloat();
//		KillTheRNG.randomness.fishHookTicksCatchableRain.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* The time it takes to count down the fishing delay when raining
	*/
	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_fishHookTicksCatchableRain_4(Random rand) {
		return KillTheRNG.randomness.fishHookTicksCatchableRain.nextFloat();
//		KillTheRNG.randomness.fishHookTicksCatchableRain.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* The time it takes to count down the fishing delay when raining
	*/
	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_fishHookTicksCatchableRain_5(Random rand) {
		return KillTheRNG.randomness.fishHookTicksCatchableRain.nextGaussian();
//		KillTheRNG.randomness.fishHookTicksCatchableRain.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* The time it takes to count down the fishing delay when raining
	*/
	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_fishHookTicksCatchableRain_6(Random rand) {
		return KillTheRNG.randomness.fishHookTicksCatchableRain.nextFloat();
//		KillTheRNG.randomness.fishHookTicksCatchableRain.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* The time it takes to count down the fishing delay when raining
	*/
	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_fishHookTicksCatchableRain_7(Random rand) {
		return KillTheRNG.randomness.fishHookTicksCatchableRain.nextFloat();
//		KillTheRNG.randomness.fishHookTicksCatchableRain.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* The time it takes to count down the fishing delay when raining
	*/
	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_fishHookTicksCatchableRain_8(Random rand) {
		return KillTheRNG.randomness.fishHookTicksCatchableRain.nextFloat();
//		KillTheRNG.randomness.fishHookTicksCatchableRain.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* The time it takes to count down the fishing delay when raining
	*/
	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_fishHookTicksCatchableRain_9(Random rand) {
		return KillTheRNG.randomness.fishHookTicksCatchableRain.nextFloat();
//		KillTheRNG.randomness.fishHookTicksCatchableRain.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* The time it takes to count down the fishing delay when raining
	*/
	@Redirect(method = "catchingFish(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_fishHookTicksCatchableRain_10(Random rand, int i) {
		return KillTheRNG.randomness.fishHookTicksCatchableRain.nextInt(i);
//		KillTheRNG.randomness.fishHookTicksCatchableRain.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* What the next fished item is
	*/
	@Redirect(method = "handleHookRetraction()I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_fishHookLoot_11(Random rand, int i) {
		return KillTheRNG.randomness.fishHookLoot.nextInt(i);
//		KillTheRNG.randomness.fishHookLoot.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* How much the fish hook is bobbing
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_fishHookBobbingMotion_12(Random rand) {
		return KillTheRNG.randomness.fishHookBobbingMotion.nextFloat();
//		KillTheRNG.randomness.fishHookBobbingMotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Motion of the fishhook when casting
	*/
	@Redirect(method = "shoot()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_fishHookMotion_13(Random rand) {
		return KillTheRNG.randomness.fishHookMotion.nextGaussian();
//		KillTheRNG.randomness.fishHookMotion.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Motion of the fishhook when casting
	*/
	@Redirect(method = "shoot()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_fishHookMotion_14(Random rand) {
		return KillTheRNG.randomness.fishHookMotion.nextGaussian();
//		KillTheRNG.randomness.fishHookMotion.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Motion of the fishhook when casting
	*/
	@Redirect(method = "shoot()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_fishHookMotion_15(Random rand) {
		return KillTheRNG.randomness.fishHookMotion.nextGaussian();
//		KillTheRNG.randomness.fishHookMotion.nextGaussian();
//		return rand.nextGaussian();
	}

}
