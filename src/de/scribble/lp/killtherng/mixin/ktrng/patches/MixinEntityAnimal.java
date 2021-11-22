package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityAnimal;

@Mixin(EntityAnimal.class)
public class MixinEntityAnimal {

	/**
	* Xp amount from animals after breeding
	*/
	@Redirect(method = "getExperiencePoints(Lnet/minecraft/entity/player/EntityPlayer;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_animalXpDropAmount_1(Random rand, int i) {
		return KillTheRNG.randomness.animalXpDropAmount.nextInt(i);
//		KillTheRNG.randomness.animalXpDropAmount.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Same as animalHeartParticle but with some status handler stuff... idk
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_animalHeartParticleStatusUpdate_2(Random rand) {
		return KillTheRNG.randomness.animalHeartParticleStatusUpdate.nextGaussian();
//		KillTheRNG.randomness.animalHeartParticleStatusUpdate.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Same as animalHeartParticle but with some status handler stuff... idk
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_animalHeartParticleStatusUpdate_3(Random rand) {
		return KillTheRNG.randomness.animalHeartParticleStatusUpdate.nextGaussian();
//		KillTheRNG.randomness.animalHeartParticleStatusUpdate.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Same as animalHeartParticle but with some status handler stuff... idk
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_animalHeartParticleStatusUpdate_4(Random rand) {
		return KillTheRNG.randomness.animalHeartParticleStatusUpdate.nextGaussian();
//		KillTheRNG.randomness.animalHeartParticleStatusUpdate.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Same as animalHeartParticle but with some status handler stuff... idk
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_animalHeartParticleStatusUpdate_5(Random rand) {
		return KillTheRNG.randomness.animalHeartParticleStatusUpdate.nextFloat();
//		KillTheRNG.randomness.animalHeartParticleStatusUpdate.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Same as animalHeartParticle but with some status handler stuff... idk
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_animalHeartParticleStatusUpdate_6(Random rand) {
		return KillTheRNG.randomness.animalHeartParticleStatusUpdate.nextFloat();
//		KillTheRNG.randomness.animalHeartParticleStatusUpdate.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Same as animalHeartParticle but with some status handler stuff... idk
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_animalHeartParticleStatusUpdate_7(Random rand) {
		return KillTheRNG.randomness.animalHeartParticleStatusUpdate.nextFloat();
//		KillTheRNG.randomness.animalHeartParticleStatusUpdate.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Particle location and speed of hearts when breeding
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_animalHeartParticle_8(Random rand) {
		return KillTheRNG.randomness.animalHeartParticle.nextGaussian();
//		KillTheRNG.randomness.animalHeartParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Particle location and speed of hearts when breeding
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_animalHeartParticle_9(Random rand) {
		return KillTheRNG.randomness.animalHeartParticle.nextGaussian();
//		KillTheRNG.randomness.animalHeartParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Particle location and speed of hearts when breeding
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_animalHeartParticle_10(Random rand) {
		return KillTheRNG.randomness.animalHeartParticle.nextGaussian();
//		KillTheRNG.randomness.animalHeartParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Particle location and speed of hearts when breeding
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_animalHeartParticle_11(Random rand) {
		return KillTheRNG.randomness.animalHeartParticle.nextFloat();
//		KillTheRNG.randomness.animalHeartParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Particle location and speed of hearts when breeding
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_animalHeartParticle_12(Random rand) {
		return KillTheRNG.randomness.animalHeartParticle.nextFloat();
//		KillTheRNG.randomness.animalHeartParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Particle location and speed of hearts when breeding
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_animalHeartParticle_13(Random rand) {
		return KillTheRNG.randomness.animalHeartParticle.nextFloat();
//		KillTheRNG.randomness.animalHeartParticle.nextFloat();
//		return rand.nextFloat();
	}

}
