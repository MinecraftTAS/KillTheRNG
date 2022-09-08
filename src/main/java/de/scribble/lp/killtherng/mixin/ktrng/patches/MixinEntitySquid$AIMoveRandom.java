package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraft.entity.passive.EntitySquid$AIMoveRandom")
public class MixinEntitySquid$AIMoveRandom{

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_957_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_957.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_957.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_957.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_958_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_958.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_958.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_958.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_959_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_959.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_959.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_959.nextFloat();
			return rand.nextFloat();
		}
	}


}