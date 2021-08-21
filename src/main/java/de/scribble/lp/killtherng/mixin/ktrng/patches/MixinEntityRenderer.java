package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.renderer.EntityRenderer;

@Mixin(EntityRenderer.class)
public class MixinEntityRenderer {

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1345_1(Random rand, long seed) {
		KillTheRNG.randomness.random_1345.setSeed(seed, true);
//		rand.setSeed(seed);
	}

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1346_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1346.nextInt(i);
//		KillTheRNG.randomness.random_1346.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1347_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1347.nextInt(i);
//		KillTheRNG.randomness.random_1347.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1348_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1348.nextInt(i);
//		KillTheRNG.randomness.random_1348.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1349_5(Random rand, int i) {
		return KillTheRNG.randomness.random_1349.nextInt(i);
//		KillTheRNG.randomness.random_1349.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_1350_6(Random rand) {
		return KillTheRNG.randomness.random_1350.nextDouble();
//		KillTheRNG.randomness.random_1350.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_1351_7(Random rand) {
		return KillTheRNG.randomness.random_1351.nextDouble();
//		KillTheRNG.randomness.random_1351.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1352_8(Random rand, int i) {
		return KillTheRNG.randomness.random_1352.nextInt(i);
//		KillTheRNG.randomness.random_1352.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1353_9(Random rand, int i) {
		return KillTheRNG.randomness.random_1353.nextInt(i);
//		KillTheRNG.randomness.random_1353.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "renderRainSnow(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1354_10(Random rand, long seed) {
		KillTheRNG.randomness.random_1354.setSeed(seed, true);
//		rand.setSeed(seed);
	}

	/**
	* null
	*/
	@Redirect(method = "renderRainSnow(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_1355_11(Random rand) {
		return KillTheRNG.randomness.random_1355.nextDouble();
//		KillTheRNG.randomness.random_1355.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "renderRainSnow(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_1356_12(Random rand) {
		return KillTheRNG.randomness.random_1356.nextDouble();
//		KillTheRNG.randomness.random_1356.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "renderRainSnow(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_1357_13(Random rand) {
		return KillTheRNG.randomness.random_1357.nextGaussian();
//		KillTheRNG.randomness.random_1357.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "renderRainSnow(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_1358_14(Random rand) {
		return KillTheRNG.randomness.random_1358.nextDouble();
//		KillTheRNG.randomness.random_1358.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "renderRainSnow(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_1359_15(Random rand) {
		return KillTheRNG.randomness.random_1359.nextGaussian();
//		KillTheRNG.randomness.random_1359.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "displayItemActivation(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1360_16(Random rand) {
		return KillTheRNG.randomness.random_1360.nextFloat();
//		KillTheRNG.randomness.random_1360.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "displayItemActivation(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1361_17(Random rand) {
		return KillTheRNG.randomness.random_1361.nextFloat();
//		KillTheRNG.randomness.random_1361.nextFloat();
//		return rand.nextFloat();
	}

}
