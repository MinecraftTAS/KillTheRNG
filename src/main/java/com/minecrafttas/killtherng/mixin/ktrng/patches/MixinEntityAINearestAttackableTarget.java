package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.ai.EntityAINearestAttackableTarget.class)
public class MixinEntityAINearestAttackableTarget{

	/**
	* If the entity should look for a new target
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiNearestAttackableTarget_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiNearestAttackableTarget.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiNearestAttackableTarget.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiNearestAttackableTarget.nextInt(i);
			return rand.nextInt(i);
		}
	}


}