package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.boss.dragon.phase.PhaseSittingFlaming.class)
public class MixinPhaseSittingFlaming{

	/**
	* Position of dragon breath particles
	*/
	@Redirect(method = "doClientRenderEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_phaseSittingFlamingParticle_1(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.phaseSittingFlamingParticle.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.phaseSittingFlamingParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position of dragon breath particles
	*/
	@Redirect(method = "doClientRenderEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_phaseSittingFlamingParticle_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.phaseSittingFlamingParticle.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.phaseSittingFlamingParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position of dragon breath particles
	*/
	@Redirect(method = "doClientRenderEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_phaseSittingFlamingParticle_3(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.phaseSittingFlamingParticle.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.phaseSittingFlamingParticle.nextGaussian();
//		return rand.nextGaussian();
	}


}