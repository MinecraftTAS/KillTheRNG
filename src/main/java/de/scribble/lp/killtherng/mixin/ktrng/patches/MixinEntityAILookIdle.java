package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.ai.EntityAILookIdle.class)
public class MixinEntityAILookIdle{

	/**
	* If the entity should start looking around
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_aiLookIdleStart_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiLookIdleStart.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiLookIdleStart.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiLookIdleStart.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* In which direction the entity should look
	*/
	@Redirect(method = "startExecuting()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_aiLookIdleLookingDirection_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiLookIdleLookingDirection.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiLookIdleLookingDirection.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiLookIdleLookingDirection.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* In which direction the entity should look
	*/
	@Redirect(method = "startExecuting()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiLookIdleLookingDirection_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiLookIdleLookingDirection.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiLookIdleLookingDirection.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiLookIdleLookingDirection.nextInt(i);
			return rand.nextInt(i);
		}
	}


}