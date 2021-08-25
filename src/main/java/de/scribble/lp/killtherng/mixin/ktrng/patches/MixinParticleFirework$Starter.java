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
	* X/Z Position to turn into when flying a rocket
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_xzRollFirework_1(Random rand) {
		return KillTheRNG.randomness.xzRollFirework.nextFloat();
//		KillTheRNG.randomness.xzRollFirework.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* X/Z Position to turn into when flying a rocket
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_xzRollFirework_2(Random rand) {
		return KillTheRNG.randomness.xzRollFirework.nextFloat();
//		KillTheRNG.randomness.xzRollFirework.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Random Color for Particle
	*/
	@Redirect(method = "createParticle(DDDDDD[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_fireworkColor_3(Random rand, int i) {
		return KillTheRNG.randomness.fireworkColor.nextInt(i);
//		KillTheRNG.randomness.fireworkColor.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Random Fade Color for Particle
	*/
	@Redirect(method = "createParticle(DDDDDD[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_fireworkFadeColor_4(Random rand, int i) {
		return KillTheRNG.randomness.fireworkFadeColor.nextInt(i);
//		KillTheRNG.randomness.fireworkFadeColor.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Position, Rotation for the 'Ball' Firework Effect
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_posRotBallFirework_5(Random rand) {
		return KillTheRNG.randomness.posRotBallFirework.nextDouble();
//		KillTheRNG.randomness.posRotBallFirework.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Position, Rotation for the 'Ball' Firework Effect
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_posRotBallFirework_6(Random rand) {
		return KillTheRNG.randomness.posRotBallFirework.nextDouble();
//		KillTheRNG.randomness.posRotBallFirework.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Position, Rotation for the 'Ball' Firework Effect
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_posRotBallFirework_7(Random rand) {
		return KillTheRNG.randomness.posRotBallFirework.nextDouble();
//		KillTheRNG.randomness.posRotBallFirework.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Position, Rotation for the 'Ball' Firework Effect
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_posRotBallFirework_8(Random rand) {
		return KillTheRNG.randomness.posRotBallFirework.nextDouble();
//		KillTheRNG.randomness.posRotBallFirework.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Position, Rotation for the 'Ball' Firework Effect
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_posRotBallFirework_9(Random rand) {
		return KillTheRNG.randomness.posRotBallFirework.nextDouble();
//		KillTheRNG.randomness.posRotBallFirework.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Position, Rotation for the 'Ball' Firework Effect
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_posRotBallFirework_10(Random rand) {
		return KillTheRNG.randomness.posRotBallFirework.nextDouble();
//		KillTheRNG.randomness.posRotBallFirework.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Position, Rotation for the 'Ball' Firework Effect
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_posRotBallFirework1_11(Random rand) {
		return KillTheRNG.randomness.posRotBallFirework1.nextGaussian();
//		KillTheRNG.randomness.posRotBallFirework1.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Rotation ooffset after 3 iterations of the creeper face
	*/
	@Redirect(method = "createShaped(D[[D[I[IZZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_rotationCreeperFirework_12(Random rand) {
		return KillTheRNG.randomness.rotationCreeperFirework.nextFloat();
//		KillTheRNG.randomness.rotationCreeperFirework.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position, Rotation for the 'Burst' Firework Effect
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_posRotBurstFirework_13(Random rand) {
		return KillTheRNG.randomness.posRotBurstFirework.nextGaussian();
//		KillTheRNG.randomness.posRotBurstFirework.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position, Rotation for the 'Burst' Firework Effect
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_posRotBurstFirework_14(Random rand) {
		return KillTheRNG.randomness.posRotBurstFirework.nextGaussian();
//		KillTheRNG.randomness.posRotBurstFirework.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position, Rotation for the 'Burst' Firework Effect
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_posRotBurstFirework_15(Random rand) {
		return KillTheRNG.randomness.posRotBurstFirework.nextGaussian();
//		KillTheRNG.randomness.posRotBurstFirework.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position, Rotation for the 'Burst' Firework Effect
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 3))
	public double redirect_posRotBurstFirework_16(Random rand) {
		return KillTheRNG.randomness.posRotBurstFirework.nextGaussian();
//		KillTheRNG.randomness.posRotBurstFirework.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position, Rotation for the 'Burst' Firework Effect
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_posRotBurstFirework1_17(Random rand) {
		return KillTheRNG.randomness.posRotBurstFirework1.nextDouble();
//		KillTheRNG.randomness.posRotBurstFirework1.nextDouble();
//		return rand.nextDouble();
	}

}
