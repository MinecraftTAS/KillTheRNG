package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.boss.dragon.phase.PhaseStrafePlayer.class)
public class MixinPhaseStrafePlayer{

	/**
	* If the dragon should go clockwise or counterclockwise when finding a new target
	*/
	@Redirect(method = "findNewTarget()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_phaseStrafePlayerRotation_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.phaseStrafePlayerRotation.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.phaseStrafePlayerRotation.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Random increment in movement while navigating to the next path
	*/
	@Redirect(method = "navigateToNextPathNode()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_phaseStrafePlayerMoveToLocation_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.phaseStrafePlayerMoveToLocation.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.phaseStrafePlayerMoveToLocation.nextFloat();
//		return rand.nextFloat();
	}


}