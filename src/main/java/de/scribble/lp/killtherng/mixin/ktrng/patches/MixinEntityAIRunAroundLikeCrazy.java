package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.ai.EntityAIRunAroundLikeCrazy.class)
public class MixinEntityAIRunAroundLikeCrazy{

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_775_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_775.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_775.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_775.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_776_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_776.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_776.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_776.nextInt(i);
			return rand.nextInt(i);
		}
	}


}