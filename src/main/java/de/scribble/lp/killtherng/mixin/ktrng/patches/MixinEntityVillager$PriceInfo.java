package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.passive.EntityVillager.PriceInfo.class)
public class MixinEntityVillager$PriceInfo{

	/**
	* null
	*/
	@Redirect(method = "getPrice(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1030_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_1030.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1030.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_1030.nextInt(i);
			return rand.nextInt(i);
		}
	}


}