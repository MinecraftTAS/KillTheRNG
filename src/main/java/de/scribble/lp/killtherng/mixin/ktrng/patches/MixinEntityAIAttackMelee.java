package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.ai.EntityAIAttackMelee.class)
public class MixinEntityAIAttackMelee{

	/**
	* null
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_709_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_709.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_709.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_709.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Between a lot of conditions, the chance for the entity to update the target
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_aiAttackCheckForTargets_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiAttackCheckForTargets.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiAttackCheckForTargets.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiAttackCheckForTargets.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Between a lot of conditions, the chance for the entity to update the target
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiAttackCheckForTargets_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiAttackCheckForTargets.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiAttackCheckForTargets.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiAttackCheckForTargets.nextInt(i);
			return rand.nextInt(i);
		}
	}


}