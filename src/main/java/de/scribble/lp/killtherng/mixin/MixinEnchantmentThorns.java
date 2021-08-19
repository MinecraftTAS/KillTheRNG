package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.enchantment.EnchantmentThorns;

@Mixin(EnchantmentThorns.class)
public class MixinEnchantmentThorns {
	@Redirect(method = "shouldHit(ILjava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_random_564(Random rand) {
		return KillTheRNG.randomness.random_564.nextFloat();
	}

	@Redirect(method = "getDamage(ILjava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_565(Random rand, int i) {
		return KillTheRNG.randomness.random_565.nextInt(i);
	}

}
