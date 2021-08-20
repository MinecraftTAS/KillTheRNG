package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.particle.ParticleFirework;

@Mixin(ParticleFirework.Starter.class)
public class MixinParticleFirework$Starter {

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1929_0(Random rand) {
		return KillTheRNG.randomness.random_1929.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1930_1(Random rand) {
		return KillTheRNG.randomness.random_1930.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "createParticle(DDDDDD[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1931_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1931.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createParticle(DDDDDD[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1932_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1932.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_1933_0(Random rand) {
		return KillTheRNG.randomness.random_1933.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_1934_1(Random rand) {
		return KillTheRNG.randomness.random_1934.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_1935_2(Random rand) {
		return KillTheRNG.randomness.random_1935.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_1936_3(Random rand) {
		return KillTheRNG.randomness.random_1936.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_1937_4(Random rand) {
		return KillTheRNG.randomness.random_1937.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_1938_5(Random rand) {
		return KillTheRNG.randomness.random_1938.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 6))
	public double redirect_random_1939_6(Random rand) {
		return KillTheRNG.randomness.random_1939.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "createShaped(D[[D[I[IZZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1940_0(Random rand) {
		return KillTheRNG.randomness.random_1940.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_1941_0(Random rand) {
		return KillTheRNG.randomness.random_1941.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_1942_1(Random rand) {
		return KillTheRNG.randomness.random_1942.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_1943_2(Random rand) {
		return KillTheRNG.randomness.random_1943.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 3))
	public double redirect_random_1944_3(Random rand) {
		return KillTheRNG.randomness.random_1944.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_1945_4(Random rand) {
		return KillTheRNG.randomness.random_1945.nextDouble();
	}

}
