package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraft.entity.monster.EntityGhast$AIRandomFly")
public class MixinEntityGhast$AIRandomFly{

	/**
	* null
	*/
	@Redirect(method = "startExecuting()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_860_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_860.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_860.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_860.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "startExecuting()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_861_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_861.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_861.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_861.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "startExecuting()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_862_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_862.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_862.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_862.nextFloat();
			return rand.nextFloat();
		}
	}


}