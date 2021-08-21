package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAIAttackMelee;

@Mixin(EntityAIAttackMelee.class)
public class MixinEntityAIAttackMelee {

	/**
	* null
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_709_1(Random rand, int i) {
		return KillTheRNG.randomness.random_709.nextInt(i);
//		KillTheRNG.randomness.random_709.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Between a lot of conditions, the chance for the entity to update the target
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_aiAttackCheckForTargets_2(Random rand) {
		return KillTheRNG.randomness.aiAttackCheckForTargets.nextFloat();
//		KillTheRNG.randomness.aiAttackCheckForTargets.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Between a lot of conditions, the chance for the entity to update the target
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiAttackCheckForTargets_3(Random rand, int i) {
		return KillTheRNG.randomness.aiAttackCheckForTargets.nextInt(i);
//		KillTheRNG.randomness.aiAttackCheckForTargets.nextInt(i);
//		return rand.nextInt(i);
	}

}
