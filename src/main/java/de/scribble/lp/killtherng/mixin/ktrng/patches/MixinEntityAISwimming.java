package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAISwimming;

@Mixin(EntityAISwimming.class)
public class MixinEntityAISwimming {

	/**
	* Set's the entity to jumping to simulate swimming
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_aiSwimmingSetJumping_1(Random rand) {
		return KillTheRNG.randomness.aiSwimmingSetJumping.nextFloat();
//		KillTheRNG.randomness.aiSwimmingSetJumping.nextFloat();
//		return rand.nextFloat();
	}

}
