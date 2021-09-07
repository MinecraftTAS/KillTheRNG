package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.boss.dragon.phase.PhaseTakeoff;

@Mixin(PhaseTakeoff.class)
public class MixinPhaseTakeoff {

	/**
	* Random increment in movement while navigating to the next path
	*/
	@Redirect(method = "navigateToNextPathNode()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_phaseTakeoffMoveToLocation_1(Random rand) {
		return KillTheRNG.randomness.phaseTakeoffMoveToLocation.nextFloat();
//		KillTheRNG.randomness.phaseTakeoffMoveToLocation.nextFloat();
//		return rand.nextFloat();
	}

}
