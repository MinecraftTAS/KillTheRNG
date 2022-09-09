package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(it.unimi.dsi.fastutil.ints.IntArrays.class)
public class MixinIntArrays{

	/**
	* Shuffles arrays
	*/
	@Redirect(method = "shuffle([IIILjava/util/Random;)[I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	private static int redirect_fastutilArrayShuffle_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.fastutilArrayShuffle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.fastutilArrayShuffle.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.fastutilArrayShuffle.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Shuffles arrays
	*/
	@Redirect(method = "shuffle([ILjava/util/Random;)[I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	private static int redirect_fastutilArrayShuffle_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.fastutilArrayShuffle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.fastutilArrayShuffle.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.fastutilArrayShuffle.nextInt(i);
			return rand.nextInt(i);
		}
	}


}