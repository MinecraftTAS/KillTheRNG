package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.Entity;

@Mixin(Entity.class)
public class MixinEntity {

	/**
	* null
	*/
	@Redirect(method = "move(Lnet/minecraft/entity/MoverType;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_26_0(Random rand) {
		return KillTheRNG.randomness.random_26.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "move(Lnet/minecraft/entity/MoverType;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_27_1(Random rand) {
		return KillTheRNG.randomness.random_27.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "move(Lnet/minecraft/entity/MoverType;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_28_2(Random rand) {
		return KillTheRNG.randomness.random_28.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "move(Lnet/minecraft/entity/MoverType;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_29_3(Random rand) {
		return KillTheRNG.randomness.random_29.nextFloat();
	}

	/**
	* Pitch of splash sound
	*/
	@Redirect(method = "doWaterSplashEffect()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_splashSound_0(Random rand) {
		return KillTheRNG.randomness.splashSound.nextFloat();
	}

	/**
	* Pitch of swim sound
	*/
	@Redirect(method = "doWaterSplashEffect()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_splashSound_1(Random rand) {
		return KillTheRNG.randomness.splashSound.nextFloat();
	}

	/**
	* Position of bubble particle
	*/
	@Redirect(method = "doWaterSplashEffect()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_waterBubbleParticle_2(Random rand) {
		return KillTheRNG.randomness.waterBubbleParticle.nextFloat();
	}

	/**
	* Position of bubble particle
	*/
	@Redirect(method = "doWaterSplashEffect()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_waterBubbleParticle_3(Random rand) {
		return KillTheRNG.randomness.waterBubbleParticle.nextFloat();
	}

	/**
	* Position of bubble particle
	*/
	@Redirect(method = "doWaterSplashEffect()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_waterBubbleParticle_4(Random rand) {
		return KillTheRNG.randomness.waterBubbleParticle.nextFloat();
	}

	/**
	* Position of water splash particle
	*/
	@Redirect(method = "doWaterSplashEffect()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_waterSplashParticle_5(Random rand) {
		return KillTheRNG.randomness.waterSplashParticle.nextFloat();
	}

	/**
	* Position of water splash particle
	*/
	@Redirect(method = "doWaterSplashEffect()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_waterSplashParticle_6(Random rand) {
		return KillTheRNG.randomness.waterSplashParticle.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "createRunningParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_37_0(Random rand) {
		return KillTheRNG.randomness.random_37.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "createRunningParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_38_1(Random rand) {
		return KillTheRNG.randomness.random_38.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "pushOutOfBlocks(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_39_0(Random rand) {
		return KillTheRNG.randomness.random_39.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "canTrample(Lnet/minecraft/world/World;Lnet/minecraft/block/Block;Lnet/minecraft/util/math/BlockPos;F)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0), remap=false)
	public float redirect_random_40_0(Random rand) {
		return KillTheRNG.randomness.random_40.nextFloat();
	}

}
