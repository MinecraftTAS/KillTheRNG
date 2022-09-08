package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.passive.EntityAnimal.class)
public class MixinEntityAnimal{

	/**
	* Same as animalHeartParticle but with some status handler stuff... idk
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_animalHeartParticleStatusUpdate_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticleStatusUpdate.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticleStatusUpdate.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticleStatusUpdate.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Same as animalHeartParticle but with some status handler stuff... idk
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_animalHeartParticleStatusUpdate_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticleStatusUpdate.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticleStatusUpdate.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticleStatusUpdate.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Same as animalHeartParticle but with some status handler stuff... idk
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_animalHeartParticleStatusUpdate_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticleStatusUpdate.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticleStatusUpdate.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticleStatusUpdate.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Same as animalHeartParticle but with some status handler stuff... idk
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_animalHeartParticleStatusUpdate_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticleStatusUpdate.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticleStatusUpdate.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticleStatusUpdate.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Same as animalHeartParticle but with some status handler stuff... idk
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_animalHeartParticleStatusUpdate_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticleStatusUpdate.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticleStatusUpdate.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticleStatusUpdate.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Same as animalHeartParticle but with some status handler stuff... idk
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_animalHeartParticleStatusUpdate_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticleStatusUpdate.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticleStatusUpdate.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.animalHeartParticleStatusUpdate.nextFloat();
			return rand.nextFloat();
		}
	}


}