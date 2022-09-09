package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.ai.EntityAIWatchClosest.class)
public class MixinEntityAIWatchClosest{

	/**
	* If the entity should look at another entity
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_aiWatchClosestStart_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiWatchClosestStart.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiWatchClosestStart.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiWatchClosestStart.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* How long the entity should look at another entity
	*/
	@Redirect(method = "startExecuting()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiWatchClosestDuration_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiWatchClosestDuration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiWatchClosestDuration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiWatchClosestDuration.nextInt(i);
			return rand.nextInt(i);
		}
	}


}