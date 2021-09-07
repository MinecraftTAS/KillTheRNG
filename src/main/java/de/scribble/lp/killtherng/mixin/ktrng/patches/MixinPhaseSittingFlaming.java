package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.boss.dragon.phase.PhaseSittingFlaming;

@Mixin(PhaseSittingFlaming.class)
public class MixinPhaseSittingFlaming {

	/**
	* Position of dragon breath particles
	*/
	@Redirect(method = "doClientRenderEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_phaseSittingFlamingParticle_1(Random rand) {
		return KillTheRNG.randomness.phaseSittingFlamingParticle.nextGaussian();
//		KillTheRNG.randomness.phaseSittingFlamingParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position of dragon breath particles
	*/
	@Redirect(method = "doClientRenderEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_phaseSittingFlamingParticle_2(Random rand) {
		return KillTheRNG.randomness.phaseSittingFlamingParticle.nextGaussian();
//		KillTheRNG.randomness.phaseSittingFlamingParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position of dragon breath particles
	*/
	@Redirect(method = "doClientRenderEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_phaseSittingFlamingParticle_3(Random rand) {
		return KillTheRNG.randomness.phaseSittingFlamingParticle.nextGaussian();
//		KillTheRNG.randomness.phaseSittingFlamingParticle.nextGaussian();
//		return rand.nextGaussian();
	}

}
