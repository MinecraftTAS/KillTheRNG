package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.Entity;

@Mixin(Entity.class)
public class MixinEntity {

	/**
	* Minimum Fall Distance until farmland gets trampled
	*/
	@Redirect(method = "canTrample(Lnet/minecraft/world/World;Lnet/minecraft/block/Block;Lnet/minecraft/util/math/BlockPos;F)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0), remap=false)
	public float redirect_trampleHeight_1(Random rand) {
		return KillTheRNG.randomness.trampleHeight.nextFloat();
//		KillTheRNG.randomness.trampleHeight.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of block crack particles when running
	*/
	@Redirect(method = "createRunningParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_runningParticle_2(Random rand) {
		return KillTheRNG.randomness.runningParticle.nextFloat();
//		KillTheRNG.randomness.runningParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of block crack particles when running
	*/
	@Redirect(method = "createRunningParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_runningParticle_3(Random rand) {
		return KillTheRNG.randomness.runningParticle.nextFloat();
//		KillTheRNG.randomness.runningParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of splash sound
	*/
	@Redirect(method = "doWaterSplashEffect()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_splashSound_4(Random rand) {
		return KillTheRNG.randomness.splashSound.nextFloat();
//		KillTheRNG.randomness.splashSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of swim sound
	*/
	@Redirect(method = "doWaterSplashEffect()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_splashSound_5(Random rand) {
		return KillTheRNG.randomness.splashSound.nextFloat();
//		KillTheRNG.randomness.splashSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of bubble particle
	*/
	@Redirect(method = "doWaterSplashEffect()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_waterBubbleParticle_6(Random rand) {
		return KillTheRNG.randomness.waterBubbleParticle.nextFloat();
//		KillTheRNG.randomness.waterBubbleParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of bubble particle
	*/
	@Redirect(method = "doWaterSplashEffect()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_waterBubbleParticle_7(Random rand) {
		return KillTheRNG.randomness.waterBubbleParticle.nextFloat();
//		KillTheRNG.randomness.waterBubbleParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of bubble particle
	*/
	@Redirect(method = "doWaterSplashEffect()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_waterBubbleParticle_8(Random rand) {
		return KillTheRNG.randomness.waterBubbleParticle.nextFloat();
//		KillTheRNG.randomness.waterBubbleParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of water splash particle
	*/
	@Redirect(method = "doWaterSplashEffect()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_waterSplashParticle_9(Random rand) {
		return KillTheRNG.randomness.waterSplashParticle.nextFloat();
//		KillTheRNG.randomness.waterSplashParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of water splash particle
	*/
	@Redirect(method = "doWaterSplashEffect()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_waterSplashParticle_10(Random rand) {
		return KillTheRNG.randomness.waterSplashParticle.nextFloat();
//		KillTheRNG.randomness.waterSplashParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of swimming entities sound
	*/
	@Redirect(method = "move(Lnet/minecraft/entity/MoverType;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_swimSoundPitch_11(Random rand) {
		return KillTheRNG.randomness.swimSoundPitch.nextFloat();
//		KillTheRNG.randomness.swimSoundPitch.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of swimming entities sound
	*/
	@Redirect(method = "move(Lnet/minecraft/entity/MoverType;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_swimSoundPitch_12(Random rand) {
		return KillTheRNG.randomness.swimSoundPitch.nextFloat();
//		KillTheRNG.randomness.swimSoundPitch.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of burning entities extinguishing
	*/
	@Redirect(method = "move(Lnet/minecraft/entity/MoverType;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_fireExtinguishSoundPitch_13(Random rand) {
		return KillTheRNG.randomness.fireExtinguishSoundPitch.nextFloat();
//		KillTheRNG.randomness.fireExtinguishSoundPitch.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of burning entities extinguishing
	*/
	@Redirect(method = "move(Lnet/minecraft/entity/MoverType;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_fireExtinguishSoundPitch_14(Random rand) {
		return KillTheRNG.randomness.fireExtinguishSoundPitch.nextFloat();
//		KillTheRNG.randomness.fireExtinguishSoundPitch.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Motion to push entities out of a block
	*/
	@Redirect(method = "pushOutOfBlocks(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_pushOutOfBlock_15(Random rand) {
		return KillTheRNG.randomness.pushOutOfBlock.nextFloat();
//		KillTheRNG.randomness.pushOutOfBlock.nextFloat();
//		return rand.nextFloat();
	}

}
