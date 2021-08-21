package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.EntityAgeable;

@Mixin(EntityAgeable.class)
public class MixinEntityAgeable {

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_198_1(Random rand) {
		return KillTheRNG.randomness.random_198.nextFloat();
//		KillTheRNG.randomness.random_198.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_199_2(Random rand) {
		return KillTheRNG.randomness.random_199.nextFloat();
//		KillTheRNG.randomness.random_199.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_200_3(Random rand) {
		return KillTheRNG.randomness.random_200.nextFloat();
//		KillTheRNG.randomness.random_200.nextFloat();
//		return rand.nextFloat();
	}

}
