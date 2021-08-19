package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import it.unimi.dsi.fastutil.ints.IntArrays;

@Mixin(IntArrays.class)
public class MixinIntArrays {
	@Redirect(method = "shuffle([IIILjava/util/Random;)[I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1412(Random rand, int i) {
		return KillTheRNG.randomness.random_1412.nextInt(i);
	}

	@Redirect(method = "shuffle([ILjava/util/Random;)[I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_random_1413(Random rand, int i) {
		return KillTheRNG.randomness.random_1413.nextInt(i);
	}

}
