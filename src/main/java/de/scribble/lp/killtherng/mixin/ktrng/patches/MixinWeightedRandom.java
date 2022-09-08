package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.util.WeightedRandom.class)
public class MixinWeightedRandom{

	/**
	* null
	*/
	@Redirect(method = "getRandomItem(Ljava/util/Random;Ljava/util/List;I)Lnet/minecraft/util/WeightedRandom$Item;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1374_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1374.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1374.nextInt(i);
//		return rand.nextInt(i);
	}


}