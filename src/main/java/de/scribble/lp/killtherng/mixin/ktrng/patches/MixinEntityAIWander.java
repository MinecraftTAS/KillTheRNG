package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.ai.EntityAIWander.class)
public class MixinEntityAIWander{

	/**
	* When entity starts to wander around
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiWander_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.aiWander.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.aiWander.nextInt(i);
//		return rand.nextInt(i);
	}


}