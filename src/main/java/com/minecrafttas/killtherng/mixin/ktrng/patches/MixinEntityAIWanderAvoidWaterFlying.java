package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.ai.EntityAIWanderAvoidWaterFlying.class)
public class MixinEntityAIWanderAvoidWaterFlying{

	/**
	* If entity looks for a nearby tree
	*/
	@Redirect(method = "getPosition()Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_aiWanderAvoidWaterFlying_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiWanderAvoidWaterFlying.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiWanderAvoidWaterFlying.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiWanderAvoidWaterFlying.nextFloat();
			return rand.nextFloat();
		}
	}


}