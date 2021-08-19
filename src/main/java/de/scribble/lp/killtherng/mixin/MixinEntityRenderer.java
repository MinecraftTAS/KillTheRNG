package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.renderer.EntityRenderer;

@Mixin(EntityRenderer.class)
public class MixinEntityRenderer {
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1345(Random rand, long unused) {
	}

	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1346(Random rand, int i) {
		return KillTheRNG.randomness.random_1346.nextInt(i);
	}

	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1347(Random rand, int i) {
		return KillTheRNG.randomness.random_1347.nextInt(i);
	}

	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1348(Random rand, int i) {
		return KillTheRNG.randomness.random_1348.nextInt(i);
	}

	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1349(Random rand, int i) {
		return KillTheRNG.randomness.random_1349.nextInt(i);
	}

	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_1350(Random rand) {
		return KillTheRNG.randomness.random_1350.nextDouble();
	}

	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 6))
	public double redirect_random_1351(Random rand) {
		return KillTheRNG.randomness.random_1351.nextDouble();
	}

	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_1352(Random rand, int i) {
		return KillTheRNG.randomness.random_1352.nextInt(i);
	}

	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_random_1353(Random rand, int i) {
		return KillTheRNG.randomness.random_1353.nextInt(i);
	}

	@Redirect(method = "renderRainSnow(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1354(Random rand, long unused) {
	}

	@Redirect(method = "renderRainSnow(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_1355(Random rand) {
		return KillTheRNG.randomness.random_1355.nextDouble();
	}

	@Redirect(method = "renderRainSnow(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_1356(Random rand) {
		return KillTheRNG.randomness.random_1356.nextDouble();
	}

	@Redirect(method = "renderRainSnow(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 3))
	public double redirect_random_1357(Random rand) {
		return KillTheRNG.randomness.random_1357.nextGaussian();
	}

	@Redirect(method = "renderRainSnow(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_1358(Random rand) {
		return KillTheRNG.randomness.random_1358.nextDouble();
	}

	@Redirect(method = "renderRainSnow(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 5))
	public double redirect_random_1359(Random rand) {
		return KillTheRNG.randomness.random_1359.nextGaussian();
	}

	@Redirect(method = "displayItemActivation(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1360(Random rand) {
		return KillTheRNG.randomness.random_1360.nextFloat();
	}

	@Redirect(method = "displayItemActivation(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1361(Random rand) {
		return KillTheRNG.randomness.random_1361.nextFloat();
	}

}
