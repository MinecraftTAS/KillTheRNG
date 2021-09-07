package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntityBlaze;

@Mixin(EntityBlaze.class)
public class MixinEntityBlaze {

	/**
	* Chance for blazes to play their sound
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_blazePlaySound_1(Random rand, int i) {
		return KillTheRNG.randomness.blazePlaySound.nextInt(i);
//		KillTheRNG.randomness.blazePlaySound.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Chance for blazes to play their sound
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_blazePlaySound_2(Random rand) {
		return KillTheRNG.randomness.blazePlaySound.nextFloat();
//		KillTheRNG.randomness.blazePlaySound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Chance for blazes to play their sound
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_blazePlaySound_3(Random rand) {
		return KillTheRNG.randomness.blazePlaySound.nextFloat();
//		KillTheRNG.randomness.blazePlaySound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Chance for blazes to play their sound
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_blazePlaySound_4(Random rand) {
		return KillTheRNG.randomness.blazePlaySound.nextDouble();
//		KillTheRNG.randomness.blazePlaySound.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Chance for blazes to play their sound
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_blazePlaySound_5(Random rand) {
		return KillTheRNG.randomness.blazePlaySound.nextDouble();
//		KillTheRNG.randomness.blazePlaySound.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Chance for blazes to play their sound
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_blazePlaySound_6(Random rand) {
		return KillTheRNG.randomness.blazePlaySound.nextDouble();
//		KillTheRNG.randomness.blazePlaySound.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* How high the blaze will fly after a certain time (?)
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_blazeHeightOffset_7(Random rand) {
		return KillTheRNG.randomness.blazeHeightOffset.nextGaussian();
//		KillTheRNG.randomness.blazeHeightOffset.nextGaussian();
//		return rand.nextGaussian();
	}

}
