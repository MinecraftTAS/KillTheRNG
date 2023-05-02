package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.boss.dragon.phase.PhaseDying.class)
public class MixinPhaseDying{

	/**
	* Position of huge explosions during phase dying
	*/
	@Redirect(method = "doClientRenderEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_phaseDyingParticle_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.phaseDyingParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.phaseDyingParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.phaseDyingParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of huge explosions during phase dying
	*/
	@Redirect(method = "doClientRenderEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_phaseDyingParticle_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.phaseDyingParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.phaseDyingParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.phaseDyingParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of huge explosions during phase dying
	*/
	@Redirect(method = "doClientRenderEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_phaseDyingParticle_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.phaseDyingParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.phaseDyingParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.phaseDyingParticle.nextFloat();
			return rand.nextFloat();
		}
	}


}