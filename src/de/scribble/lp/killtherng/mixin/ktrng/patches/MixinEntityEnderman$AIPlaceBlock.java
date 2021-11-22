package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;

@Mixin(targets="net.minecraft.entity.monster.EntityEnderman$AIPlaceBlock")
public class MixinEntityEnderman$AIPlaceBlock {

	/**
	* null
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_881_1(Random rand, int i) {
		return KillTheRNG.randomness.random_881.nextInt(i);
//		KillTheRNG.randomness.random_881.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_882_2(Random rand) {
		return KillTheRNG.randomness.random_882.nextDouble();
//		KillTheRNG.randomness.random_882.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_883_3(Random rand) {
		return KillTheRNG.randomness.random_883.nextDouble();
//		KillTheRNG.randomness.random_883.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_884_4(Random rand) {
		return KillTheRNG.randomness.random_884.nextDouble();
//		KillTheRNG.randomness.random_884.nextDouble();
//		return rand.nextDouble();
	}

}
