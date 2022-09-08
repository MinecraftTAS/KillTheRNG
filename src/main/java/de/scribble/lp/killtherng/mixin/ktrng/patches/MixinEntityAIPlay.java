package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.ai.EntityAIPlay.class)
public class MixinEntityAIPlay{

	/**
	* If entities should play with each other
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiPlay_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.aiPlay.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.aiPlay.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.aiPlay.nextInt(i);
			return rand.nextInt(i);
		}
	}


}