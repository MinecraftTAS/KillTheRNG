package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.ai.EntityAITarget.class)
public class MixinEntityAITarget{

	/**
	* How long the delay is before entity starts pathfinding
	*/
	@Redirect(method = "canEasilyReach(Lnet/minecraft/entity/EntityLivingBase;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiTargetDelay_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiTargetDelay.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiTargetDelay.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiTargetDelay.nextInt(i);
			return rand.nextInt(i);
		}
	}


}