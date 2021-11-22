package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAITarget;

@Mixin(EntityAITarget.class)
public class MixinEntityAITarget {

	/**
	* How long the delay is before entity starts pathfinding
	*/
	@Redirect(method = "canEasilyReach(Lnet/minecraft/entity/EntityLivingBase;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiTargetDelay_1(Random rand, int i) {
		return KillTheRNG.randomness.aiTargetDelay.nextInt(i);
//		KillTheRNG.randomness.aiTargetDelay.nextInt(i);
//		return rand.nextInt(i);
	}

}
