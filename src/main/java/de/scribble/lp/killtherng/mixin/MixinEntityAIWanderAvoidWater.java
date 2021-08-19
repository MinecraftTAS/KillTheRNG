package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;

@Mixin(EntityAIWanderAvoidWater.class)
public class MixinEntityAIWanderAvoidWater {
	@Redirect(method = "getPosition()Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_718(Random rand) {
		return KillTheRNG.randomness.random_718.nextFloat();
	}

}
