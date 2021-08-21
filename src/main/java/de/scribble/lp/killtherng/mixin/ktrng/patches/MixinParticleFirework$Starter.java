package de.scribble.lp.killtherng.mixin.ktrng.patches;

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
	public float redirect_random_1929_1(Random rand) {
		return KillTheRNG.randomness.random_1929.nextFloat();
//		KillTheRNG.randomness.random_1929.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1930_2(Random rand) {
		return KillTheRNG.randomness.random_1930.nextFloat();
//		KillTheRNG.randomness.random_1930.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "createParticle(DDDDDD[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1931_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1931.nextInt(i);
//		KillTheRNG.randomness.random_1931.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createParticle(DDDDDD[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1932_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1932.nextInt(i);
//		KillTheRNG.randomness.random_1932.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_1933_5(Random rand) {
		return KillTheRNG.randomness.random_1933.nextDouble();
//		KillTheRNG.randomness.random_1933.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_1934_6(Random rand) {
		return KillTheRNG.randomness.random_1934.nextDouble();
//		KillTheRNG.randomness.random_1934.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_1935_7(Random rand) {
		return KillTheRNG.randomness.random_1935.nextDouble();
//		KillTheRNG.randomness.random_1935.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_1936_8(Random rand) {
		return KillTheRNG.randomness.random_1936.nextDouble();
//		KillTheRNG.randomness.random_1936.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_1937_9(Random rand) {
		return KillTheRNG.randomness.random_1937.nextDouble();
//		KillTheRNG.randomness.random_1937.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_1938_10(Random rand) {
		return KillTheRNG.randomness.random_1938.nextDouble();
//		KillTheRNG.randomness.random_1938.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_1939_11(Random rand) {
		return KillTheRNG.randomness.random_1939.nextGaussian();
//		KillTheRNG.randomness.random_1939.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "createShaped(D[[D[I[IZZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1940_12(Random rand) {
		return KillTheRNG.randomness.random_1940.nextFloat();
//		KillTheRNG.randomness.random_1940.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_1941_13(Random rand) {
		return KillTheRNG.randomness.random_1941.nextGaussian();
//		KillTheRNG.randomness.random_1941.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_1942_14(Random rand) {
		return KillTheRNG.randomness.random_1942.nextGaussian();
//		KillTheRNG.randomness.random_1942.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_1943_15(Random rand) {
		return KillTheRNG.randomness.random_1943.nextGaussian();
//		KillTheRNG.randomness.random_1943.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 3))
	public double redirect_random_1944_16(Random rand) {
		return KillTheRNG.randomness.random_1944.nextGaussian();
//		KillTheRNG.randomness.random_1944.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_1945_17(Random rand) {
		return KillTheRNG.randomness.random_1945.nextDouble();
//		KillTheRNG.randomness.random_1945.nextDouble();
//		return rand.nextDouble();
	}

}
