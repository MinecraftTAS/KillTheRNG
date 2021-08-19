package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.enchantment.EnchantmentDurability;

@Mixin(EnchantmentDurability.class)
public class MixinEnchantmentDurability {
	@Redirect(method = "negateDamage(Lnet/minecraft/item/ItemStack;ILjava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_random_567(Random rand) {
		return KillTheRNG.randomness.random_567.nextFloat();
	}

	@Redirect(method = "negateDamage(Lnet/minecraft/item/ItemStack;ILjava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_random_568(Random rand, int i) {
		return KillTheRNG.randomness.random_568.nextInt(i);
	}

}
