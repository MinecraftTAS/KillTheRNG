package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.ai.EntityAISwimming.class)
public class MixinEntityAISwimming{

	/**
	* Set's the entity to jumping to simulate swimming
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_aiSwimmingSetJumping_1(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.aiSwimmingSetJumping.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.aiSwimmingSetJumping.nextFloat();
//		return rand.nextFloat();
	}


}