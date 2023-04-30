package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
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
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBallFirework.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBallFirework.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBallFirework.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position, Rotation for the 'Ball' Firework Effect
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_posRotBallFirework_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBallFirework.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBallFirework.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBallFirework.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position, Rotation for the 'Ball' Firework Effect
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_posRotBallFirework_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBallFirework.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBallFirework.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBallFirework.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position, Rotation for the 'Ball' Firework Effect
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_posRotBallFirework_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBallFirework.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBallFirework.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBallFirework.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position, Rotation for the 'Ball' Firework Effect
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_posRotBallFirework_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBallFirework.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBallFirework.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBallFirework.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position, Rotation for the 'Ball' Firework Effect
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_posRotBallFirework_6(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBallFirework.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBallFirework.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBallFirework.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position, Rotation for the 'Ball' Firework Effect
	*/
	@Redirect(method = "createBall(DI[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_posRotBallFirework1_7(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBallFirework1.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBallFirework1.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBallFirework1.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position, Rotation for the 'Burst' Firework Effect
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_posRotBurstFirework_8(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBurstFirework.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBurstFirework.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBurstFirework.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position, Rotation for the 'Burst' Firework Effect
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_posRotBurstFirework_9(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBurstFirework.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBurstFirework.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBurstFirework.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position, Rotation for the 'Burst' Firework Effect
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_posRotBurstFirework_10(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBurstFirework.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBurstFirework.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBurstFirework.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position, Rotation for the 'Burst' Firework Effect
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 3))
	public double redirect_posRotBurstFirework_11(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBurstFirework.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBurstFirework.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBurstFirework.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position, Rotation for the 'Burst' Firework Effect
	*/
	@Redirect(method = "createBurst([I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_posRotBurstFirework1_12(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBurstFirework1.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBurstFirework1.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.posRotBurstFirework1.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Random Color for Particle
	*/
	@Redirect(method = "createParticle(DDDDDD[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_fireworkColor_13(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireworkColor.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireworkColor.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireworkColor.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Random Fade Color for Particle
	*/
	@Redirect(method = "createParticle(DDDDDD[I[IZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_fireworkFadeColor_14(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireworkFadeColor.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireworkFadeColor.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireworkFadeColor.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Rotation ooffset after 3 iterations of the creeper face
	*/
	@Redirect(method = "createShaped(D[[D[I[IZZZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_rotationCreeperFirework_15(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.rotationCreeperFirework.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.rotationCreeperFirework.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.rotationCreeperFirework.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* X/Z Position to turn into when flying a rocket
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_xzRollFirework_16(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.xzRollFirework.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.xzRollFirework.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.xzRollFirework.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* X/Z Position to turn into when flying a rocket
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_xzRollFirework_17(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.xzRollFirework.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.xzRollFirework.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.xzRollFirework.nextFloat();
			return rand.nextFloat();
		}
	}


}