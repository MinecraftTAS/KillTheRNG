package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAIRunAroundLikeCrazy;

@Mixin(EntityAIRunAroundLikeCrazy.class)
public class MixinEntityAIRunAroundLikeCrazy {

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_775_0(Random rand, int i) {
		return KillTheRNG.randomness.random_775.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_776_1(Random rand, int i) {
		return KillTheRNG.randomness.random_776.nextInt(i);
	}

}
