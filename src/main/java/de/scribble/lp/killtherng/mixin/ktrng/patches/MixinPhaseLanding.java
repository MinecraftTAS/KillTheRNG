package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.boss.dragon.phase.PhaseLanding.class)
public class MixinPhaseLanding{

	/**
	* Particles for dragon breath...
	*/
	@Redirect(method = "doClientRenderEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_phaseLandingParticle_1(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.phaseLandingParticle.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.phaseLandingParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Particles for dragon breath...
	*/
	@Redirect(method = "doClientRenderEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_phaseLandingParticle_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.phaseLandingParticle.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.phaseLandingParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Particles for dragon breath...
	*/
	@Redirect(method = "doClientRenderEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_phaseLandingParticle_3(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.phaseLandingParticle.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.phaseLandingParticle.nextGaussian();
//		return rand.nextGaussian();
	}


}