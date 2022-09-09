package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleFirework.Starter.class)
public class MixinParticleFirework$Starter{

	/**
	* Position, Rotation for the 'Ball' Firework Effect
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_posRotBallFirework_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBallFirework.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBallFirework.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBallFirework.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position, Rotation for the 'Ball' Firework Effect
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_posRotBallFirework_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBallFirework.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBallFirework.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBallFirework.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position, Rotation for the 'Ball' Firework Effect
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_posRotBallFirework_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBallFirework.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBallFirework.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBallFirework.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position, Rotation for the 'Ball' Firework Effect
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_posRotBallFirework_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBallFirework.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBallFirework.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBallFirework.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position, Rotation for the 'Ball' Firework Effect
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_posRotBallFirework_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBallFirework.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBallFirework.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBallFirework.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position, Rotation for the 'Ball' Firework Effect
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_posRotBallFirework_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBallFirework.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBallFirework.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBallFirework.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position, Rotation for the 'Ball' Firework Effect
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_posRotBallFirework1_7(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBallFirework1.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBallFirework1.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBallFirework1.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position, Rotation for the 'Burst' Firework Effect
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_posRotBurstFirework_8(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBurstFirework.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBurstFirework.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBurstFirework.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position, Rotation for the 'Burst' Firework Effect
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_posRotBurstFirework_9(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBurstFirework.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBurstFirework.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBurstFirework.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position, Rotation for the 'Burst' Firework Effect
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_posRotBurstFirework_10(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBurstFirework.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBurstFirework.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBurstFirework.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position, Rotation for the 'Burst' Firework Effect
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 3))
	public double redirect_posRotBurstFirework_11(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBurstFirework.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBurstFirework.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBurstFirework.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position, Rotation for the 'Burst' Firework Effect
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_posRotBurstFirework1_12(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBurstFirework1.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBurstFirework1.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotBurstFirework1.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Random Color for Particle
	*/
	@Redirect(method = "createParticle(DDDDDD[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_fireworkColor_13(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireworkColor.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireworkColor.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireworkColor.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Random Fade Color for Particle
	*/
	@Redirect(method = "createParticle(DDDDDD[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_fireworkFadeColor_14(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireworkFadeColor.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireworkFadeColor.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireworkFadeColor.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Rotation ooffset after 3 iterations of the creeper face
	*/
	@Redirect(method = "createShaped(D[[D[I[IZZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_rotationCreeperFirework_15(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.rotationCreeperFirework.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.rotationCreeperFirework.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.rotationCreeperFirework.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* X/Z Position to turn into when flying a rocket
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_xzRollFirework_16(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.xzRollFirework.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.xzRollFirework.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.xzRollFirework.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* X/Z Position to turn into when flying a rocket
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_xzRollFirework_17(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.xzRollFirework.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.xzRollFirework.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.xzRollFirework.nextFloat();
			return rand.nextFloat();
		}
	}


}