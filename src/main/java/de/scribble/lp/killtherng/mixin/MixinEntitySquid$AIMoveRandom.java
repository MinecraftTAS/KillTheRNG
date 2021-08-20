package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;

@Mixin(targets="net.minecraft.entity.passive.EntitySquid$AIMoveRandom")
public class MixinEntitySquid$AIMoveRandom {

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_957_0(Random rand, int i) {
		return KillTheRNG.randomness.random_957.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_958_1(Random rand) {
		return KillTheRNG.randomness.random_958.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_959_2(Random rand) {
		return KillTheRNG.randomness.random_959.nextFloat();
	}

}
