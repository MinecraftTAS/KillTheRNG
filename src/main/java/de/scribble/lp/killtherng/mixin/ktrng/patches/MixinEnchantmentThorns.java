package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.enchantment.EnchantmentThorns.class)
public class MixinEnchantmentThorns{

	/**
	* null
	*/
	@Redirect(method = "getDamage(ILjava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_565_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_565.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_565.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "shouldHit(ILjava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_random_564_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_564.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_564.nextFloat();
//		return rand.nextFloat();
	}


}