package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAIAttackRangedBow;

@Mixin(EntityAIAttackRangedBow.class)
public class MixinEntityAIAttackRangedBow {

	/**
	* If entity should change directions after 20 ticks, to the left or to the right
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_aiAttackRangedBowStrafeClockwise_1(Random rand) {
		return KillTheRNG.randomness.aiAttackRangedBowStrafeClockwise.nextFloat();
//		KillTheRNG.randomness.aiAttackRangedBowStrafeClockwise.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* If entity should change directions after 20 ticks, to the left or to the right
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_aiAttackRangedBowStrafeClockwise_2(Random rand) {
		return KillTheRNG.randomness.aiAttackRangedBowStrafeClockwise.nextFloat();
//		KillTheRNG.randomness.aiAttackRangedBowStrafeClockwise.nextFloat();
//		return rand.nextFloat();
	}

}
