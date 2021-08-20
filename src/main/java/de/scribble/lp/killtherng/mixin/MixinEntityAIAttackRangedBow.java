package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAIAttackRangedBow;

@Mixin(EntityAIAttackRangedBow.class)
public class MixinEntityAIAttackRangedBow {

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_712_0(Random rand) {
		return KillTheRNG.randomness.random_712.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_713_1(Random rand) {
		return KillTheRNG.randomness.random_713.nextFloat();
	}

}