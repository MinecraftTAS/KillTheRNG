package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;

@Mixin(targets="net.minecraft.entity.monster.EntitySlime$AISlimeFaceRandom")
public class MixinEntitySlime$AISlimeFaceRandom {

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_856_1(Random rand, int i) {
		return KillTheRNG.randomness.random_856.nextInt(i);
//		KillTheRNG.randomness.random_856.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_857_2(Random rand, int i) {
		return KillTheRNG.randomness.random_857.nextInt(i);
//		KillTheRNG.randomness.random_857.nextInt(i);
//		return rand.nextInt(i);
	}

}
