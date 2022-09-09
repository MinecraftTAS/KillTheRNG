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
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.blazePlaySound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.blazePlaySound.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.blazePlaySound.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Chance for blazes to play their sound
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_blazePlaySound_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.blazePlaySound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.blazePlaySound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.blazePlaySound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Chance for blazes to play their sound
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_blazePlaySound_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.blazePlaySound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.blazePlaySound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.blazePlaySound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Chance for blazes to play their sound
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_blazePlaySound_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.blazePlaySound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.blazePlaySound.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.blazePlaySound.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Chance for blazes to play their sound
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_blazePlaySound_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.blazePlaySound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.blazePlaySound.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.blazePlaySound.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Chance for blazes to play their sound
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_blazePlaySound_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.blazePlaySound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.blazePlaySound.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.blazePlaySound.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* How high the blaze will fly after a certain time (?)
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_blazeHeightOffset_7(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.blazeHeightOffset.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.blazeHeightOffset.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.blazeHeightOffset.nextGaussian();
			return rand.nextGaussian();
		}
	}


}