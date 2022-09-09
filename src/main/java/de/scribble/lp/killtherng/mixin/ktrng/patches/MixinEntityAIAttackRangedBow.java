package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.ai.EntityAIAttackRangedBow.class)
public class MixinEntityAIAttackRangedBow{

	/**
	* If entity should change directions after 20 ticks, to the left or to the right
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_aiAttackRangedBowStrafeClockwise_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiAttackRangedBowStrafeClockwise.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiAttackRangedBowStrafeClockwise.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiAttackRangedBowStrafeClockwise.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* If entity should change directions after 20 ticks, to the left or to the right
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_aiAttackRangedBowStrafeClockwise_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiAttackRangedBowStrafeClockwise.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiAttackRangedBowStrafeClockwise.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiAttackRangedBowStrafeClockwise.nextFloat();
			return rand.nextFloat();
		}
	}


}