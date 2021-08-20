package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityVillager;

@Mixin(EntityVillager.PriceInfo.class)
public class MixinEntityVillager$PriceInfo {

	/**
	* null
	*/
	@Redirect(method = "getPrice(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1030_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1030.nextInt(i);
	}

}
