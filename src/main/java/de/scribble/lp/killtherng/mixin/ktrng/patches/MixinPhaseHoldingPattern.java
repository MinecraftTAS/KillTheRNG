package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.boss.dragon.phase.PhaseHoldingPattern.class)
public class MixinPhaseHoldingPattern{

	/**
	* If the dragon should start perching
	*/
	@Redirect(method = "findNewTarget()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_phaseHoldingPatternPerch_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.phaseHoldingPatternPerch.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.phaseHoldingPatternPerch.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.phaseHoldingPatternPerch.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* If the dragon should start perching
	*/
	@Redirect(method = "findNewTarget()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_phaseHoldingPatternPerch_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.phaseHoldingPatternPerch.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.phaseHoldingPatternPerch.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.phaseHoldingPatternPerch.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* If the dragon should start perching
	*/
	@Redirect(method = "findNewTarget()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_phaseHoldingPatternPerch_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.phaseHoldingPatternPerch.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.phaseHoldingPatternPerch.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.phaseHoldingPatternPerch.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* If the dragon should start perching
	*/
	@Redirect(method = "findNewTarget()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_phaseHoldingPatternPerch_4(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.phaseHoldingPatternPerch.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.phaseHoldingPatternPerch.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.phaseHoldingPatternPerch.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Random increment in movement while navigating to the next path
	*/
	@Redirect(method = "navigateToNextPathNode()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_phaseHoldingPatternMoveToLocation_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.phaseHoldingPatternMoveToLocation.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.phaseHoldingPatternMoveToLocation.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.phaseHoldingPatternMoveToLocation.nextFloat();
			return rand.nextFloat();
		}
	}


}