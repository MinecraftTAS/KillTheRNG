package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.boss.dragon.phase.PhaseSittingAttacking.class)
public class MixinPhaseSittingAttacking{

	/**
	* Pitch of the dragon growl
	*/
	@Redirect(method = "doClientRenderEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_phaseSittingAttackingGrowlSound_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.phaseSittingAttackingGrowlSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.phaseSittingAttackingGrowlSound.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.phaseSittingAttackingGrowlSound.nextFloat();
			return rand.nextFloat();
		}
	}


}