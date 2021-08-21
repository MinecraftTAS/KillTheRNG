package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.tileentity.MobSpawnerBaseLogic;

@Mixin(MobSpawnerBaseLogic.class)
public class MixinMobSpawnerBaseLogic {

	/**
	* null
	*/
	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_820_1(Random rand) {
		return KillTheRNG.randomness.random_820.nextFloat();
//		KillTheRNG.randomness.random_820.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_821_2(Random rand) {
		return KillTheRNG.randomness.random_821.nextFloat();
//		KillTheRNG.randomness.random_821.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_822_3(Random rand) {
		return KillTheRNG.randomness.random_822.nextFloat();
//		KillTheRNG.randomness.random_822.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_823_4(Random rand) {
		return KillTheRNG.randomness.random_823.nextDouble();
//		KillTheRNG.randomness.random_823.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_824_5(Random rand) {
		return KillTheRNG.randomness.random_824.nextDouble();
//		KillTheRNG.randomness.random_824.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_825_6(Random rand, int i) {
		return KillTheRNG.randomness.random_825.nextInt(i);
//		KillTheRNG.randomness.random_825.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_826_7(Random rand) {
		return KillTheRNG.randomness.random_826.nextDouble();
//		KillTheRNG.randomness.random_826.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_827_8(Random rand) {
		return KillTheRNG.randomness.random_827.nextDouble();
//		KillTheRNG.randomness.random_827.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_828_9(Random rand) {
		return KillTheRNG.randomness.random_828.nextFloat();
//		KillTheRNG.randomness.random_828.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "resetTimer()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_829_10(Random rand, int i) {
		return KillTheRNG.randomness.random_829.nextInt(i);
//		KillTheRNG.randomness.random_829.nextInt(i);
//		return rand.nextInt(i);
	}

}
