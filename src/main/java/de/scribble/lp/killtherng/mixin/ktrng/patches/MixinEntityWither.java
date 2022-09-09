package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.boss.EntityWither.class)
public class MixinEntityWither{

	/**
	* null
	*/
	@Redirect(method = "launchWitherSkullToEntity(ILnet/minecraft/entity/EntityLivingBase;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_528_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_528.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_528.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_528.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of smoke and mob spell particles
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_spawnWitherParticles_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position of smoke and mob spell particles
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_spawnWitherParticles_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position of smoke and mob spell particles
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_spawnWitherParticles_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position of smoke and mob spell particles
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_spawnWitherParticles_5(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of smoke and mob spell particles
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 3))
	public double redirect_spawnWitherParticles_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position of smoke and mob spell particles
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 4))
	public double redirect_spawnWitherParticles_7(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position of smoke and mob spell particles
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 5))
	public double redirect_spawnWitherParticles_8(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position of smoke and mob spell particles
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 6))
	public double redirect_spawnWitherParticles_9(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position of smoke and mob spell particles
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_spawnWitherParticles_10(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of smoke and mob spell particles
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 7))
	public double redirect_spawnWitherParticles_11(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.spawnWitherParticles.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* How long it takes to make the head shoot (?)
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_witherHeadUpdates_12(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.witherHeadUpdates.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.witherHeadUpdates.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.witherHeadUpdates.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* How long it takes to make the head shoot (?)
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_witherHeadUpdates_13(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.witherHeadUpdates.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.witherHeadUpdates.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.witherHeadUpdates.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* How long it takes to make the head shoot (?)
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_witherHeadUpdates_14(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.witherHeadUpdates.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.witherHeadUpdates.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.witherHeadUpdates.nextInt(i);
			return rand.nextInt(i);
		}
	}


}