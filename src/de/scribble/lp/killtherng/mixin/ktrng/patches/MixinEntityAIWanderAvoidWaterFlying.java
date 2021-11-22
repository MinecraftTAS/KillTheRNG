package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAIWanderAvoidWaterFlying;

@Mixin(EntityAIWanderAvoidWaterFlying.class)
public class MixinEntityAIWanderAvoidWaterFlying {

	/**
	* If entity looks for a nearby tree
	*/
	@Redirect(method = "getPosition()Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_aiWanderAvoidWaterFlying_1(Random rand) {
		return KillTheRNG.randomness.aiWanderAvoidWaterFlying.nextFloat();
//		KillTheRNG.randomness.aiWanderAvoidWaterFlying.nextFloat();
//		return rand.nextFloat();
	}

}
