package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.ai.EntityAIFollowGolem.class)
public class MixinEntityAIFollowGolem{

	/**
	* How long it takes until entity takes a rose from the golem
	*/
	@Redirect(method = "startExecuting()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiFollowGolemTakeRose_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiFollowGolemTakeRose.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiFollowGolemTakeRose.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiFollowGolemTakeRose.nextInt(i);
			return rand.nextInt(i);
		}
	}


}