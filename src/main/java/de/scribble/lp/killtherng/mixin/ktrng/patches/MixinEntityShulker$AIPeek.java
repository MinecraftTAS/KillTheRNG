package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraft.entity.monster.EntityShulker$AIPeek")
public class MixinEntityShulker$AIPeek{

	/**
	* null
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_944_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_944.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_944.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_944.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "startExecuting()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_945_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_945.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_945.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_945.nextInt(i);
			return rand.nextInt(i);
		}
	}


}