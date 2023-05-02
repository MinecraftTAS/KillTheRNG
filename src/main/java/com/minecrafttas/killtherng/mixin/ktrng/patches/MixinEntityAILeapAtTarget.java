package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.ai.EntityAILeapAtTarget.class)
public class MixinEntityAILeapAtTarget{

	/**
	* If the entity should leap at the target
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiLeapAtTargetLeapChance_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiLeapAtTargetLeapChance.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiLeapAtTargetLeapChance.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiLeapAtTargetLeapChance.nextInt(i);
			return rand.nextInt(i);
		}
	}


}