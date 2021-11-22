package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import it.unimi.dsi.fastutil.ints.IntArrays;

@Mixin(IntArrays.class)
public class MixinIntArrays {

	/**
	* null
	*/
	@Redirect(method = "shuffle([IIILjava/util/Random;)[I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap=false)
	private static int redirect_random_1412_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1412.nextInt(i);
//		KillTheRNG.randomness.random_1412.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "shuffle([ILjava/util/Random;)[I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap=false)
	private static int redirect_random_1413_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1413.nextInt(i);
//		KillTheRNG.randomness.random_1413.nextInt(i);
//		return rand.nextInt(i);
	}

}
