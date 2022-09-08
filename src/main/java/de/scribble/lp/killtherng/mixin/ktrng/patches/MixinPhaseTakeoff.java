package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.boss.dragon.phase.PhaseTakeoff.class)
public class MixinPhaseTakeoff{

	/**
	* Random increment in movement while navigating to the next path
	*/
	@Redirect(method = "navigateToNextPathNode()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_phaseTakeoffMoveToLocation_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.phaseTakeoffMoveToLocation.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.phaseTakeoffMoveToLocation.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.phaseTakeoffMoveToLocation.nextFloat();
			return rand.nextFloat();
		}
	}


}