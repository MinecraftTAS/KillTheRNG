package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.particle.ParticleFirework;

@Mixin(ParticleFirework.Starter.class)
public class MixinParticleFirework$Starter {
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1929(Random rand) {
		return KillTheRNG.randomness.random_1929.nextFloat();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1930(Random rand) {
		return KillTheRNG.randomness.random_1930.nextFloat();
	}

	@Redirect(method = "createParticle(DDDDDD[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1931(Random rand, int i) {
		return KillTheRNG.randomness.random_1931.nextInt(i);
	}

	@Redirect(method = "createParticle(DDDDDD[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1932(Random rand, int i) {
		return KillTheRNG.randomness.random_1932.nextInt(i);
	}

	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_1933(Random rand) {
		return KillTheRNG.randomness.random_1933.nextDouble();
	}

	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_1934(Random rand) {
		return KillTheRNG.randomness.random_1934.nextDouble();
	}

	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_1935(Random rand) {
		return KillTheRNG.randomness.random_1935.nextDouble();
	}

	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_1936(Random rand) {
		return KillTheRNG.randomness.random_1936.nextDouble();
	}

	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_1937(Random rand) {
		return KillTheRNG.randomness.random_1937.nextDouble();
	}

	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_1938(Random rand) {
		return KillTheRNG.randomness.random_1938.nextDouble();
	}

	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 6))
	public double redirect_random_1939(Random rand) {
		return KillTheRNG.randomness.random_1939.nextGaussian();
	}

	@Redirect(method = "createShaped(D[[D[I[IZZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1940(Random rand) {
		return KillTheRNG.randomness.random_1940.nextFloat();
	}

	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_1941(Random rand) {
		return KillTheRNG.randomness.random_1941.nextGaussian();
	}

	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_1942(Random rand) {
		return KillTheRNG.randomness.random_1942.nextGaussian();
	}

	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_1943(Random rand) {
		return KillTheRNG.randomness.random_1943.nextGaussian();
	}

	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 3))
	public double redirect_random_1944(Random rand) {
		return KillTheRNG.randomness.random_1944.nextGaussian();
	}

	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_1945(Random rand) {
		return KillTheRNG.randomness.random_1945.nextDouble();
	}

}
