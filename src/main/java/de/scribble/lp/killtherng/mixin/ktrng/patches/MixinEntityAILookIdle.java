package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAILookIdle;

@Mixin(EntityAILookIdle.class)
public class MixinEntityAILookIdle {

	/**
	* If the entity should start looking around
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_aiLookIdleStart_1(Random rand) {
		return KillTheRNG.randomness.aiLookIdleStart.nextFloat();
//		KillTheRNG.randomness.aiLookIdleStart.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* In which direction the entity should look
	*/
	@Redirect(method = "startExecuting()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_aiLookIdleLookingDirection_2(Random rand) {
		return KillTheRNG.randomness.aiLookIdleLookingDirection.nextDouble();
//		KillTheRNG.randomness.aiLookIdleLookingDirection.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* In which direction the entity should look
	*/
	@Redirect(method = "startExecuting()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiLookIdleLookingDirection_3(Random rand, int i) {
		return KillTheRNG.randomness.aiLookIdleLookingDirection.nextInt(i);
//		KillTheRNG.randomness.aiLookIdleLookingDirection.nextInt(i);
//		return rand.nextInt(i);
	}

}
