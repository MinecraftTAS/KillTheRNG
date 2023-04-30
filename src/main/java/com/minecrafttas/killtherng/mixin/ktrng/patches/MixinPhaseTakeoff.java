package com.minecrafttas.killtherng.mixin.ktrng.patches;
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
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.phaseTakeoffMoveToLocation.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.phaseTakeoffMoveToLocation.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.phaseTakeoffMoveToLocation.nextFloat();
			return rand.nextFloat();
		}
	}


}