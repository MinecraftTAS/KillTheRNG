package de.scribble.lp.killtherng.mixin;

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
	public void redirect_random_1345_0(Random rand, long unused) {
	}

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1346_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1346.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1347_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1347.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1348_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1348.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1349_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1349.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_1350_5(Random rand) {
		return KillTheRNG.randomness.random_1350.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 6))
	public double redirect_random_1351_6(Random rand) {
		return KillTheRNG.randomness.random_1351.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_1352_7(Random rand, int i) {
		return KillTheRNG.randomness.random_1352.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_random_1353_8(Random rand, int i) {
		return KillTheRNG.randomness.random_1353.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "renderRainSnow(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1354_0(Random rand, long unused) {
	}

	/**
	* null
	*/
	@Redirect(method = "renderRainSnow(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_1355_1(Random rand) {
		return KillTheRNG.randomness.random_1355.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "renderRainSnow(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_1356_2(Random rand) {
		return KillTheRNG.randomness.random_1356.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "renderRainSnow(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 3))
	public double redirect_random_1357_3(Random rand) {
		return KillTheRNG.randomness.random_1357.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "renderRainSnow(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_1358_4(Random rand) {
		return KillTheRNG.randomness.random_1358.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "renderRainSnow(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 5))
	public double redirect_random_1359_5(Random rand) {
		return KillTheRNG.randomness.random_1359.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "displayItemActivation(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1360_0(Random rand) {
		return KillTheRNG.randomness.random_1360.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "displayItemActivation(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1361_1(Random rand) {
		return KillTheRNG.randomness.random_1361.nextFloat();
	}

}
