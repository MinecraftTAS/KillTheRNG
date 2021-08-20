package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAIWatchClosest;

@Mixin(EntityAIWatchClosest.class)
public class MixinEntityAIWatchClosest {

	/**
	* null
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_696_0(Random rand) {
		return KillTheRNG.randomness.random_696.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "startExecuting()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_697_0(Random rand, int i) {
		return KillTheRNG.randomness.random_697.nextInt(i);
	}

}
