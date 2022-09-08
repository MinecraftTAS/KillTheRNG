package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.monster.EntityBlaze.class)
public class MixinEntityBlaze{

	/**
	* Chance for blazes to play their sound
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_blazePlaySound_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.blazePlaySound.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.blazePlaySound.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Chance for blazes to play their sound
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_blazePlaySound_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.blazePlaySound.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.blazePlaySound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Chance for blazes to play their sound
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_blazePlaySound_3(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.blazePlaySound.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.blazePlaySound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Chance for blazes to play their sound
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_blazePlaySound_4(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.blazePlaySound.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.blazePlaySound.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Chance for blazes to play their sound
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_blazePlaySound_5(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.blazePlaySound.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.blazePlaySound.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Chance for blazes to play their sound
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_blazePlaySound_6(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.blazePlaySound.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.blazePlaySound.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* How high the blaze will fly after a certain time (?)
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_blazeHeightOffset_7(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.blazeHeightOffset.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.blazeHeightOffset.nextGaussian();
//		return rand.nextGaussian();
	}


}