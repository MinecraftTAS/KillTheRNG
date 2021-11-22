package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.enchantment.EnchantmentDurability;

@Mixin(EnchantmentDurability.class)
public class MixinEnchantmentDurability {

	/**
	* If the item should be damaged when unbreaking is active
	*/
	@Redirect(method = "negateDamage(Lnet/minecraft/item/ItemStack;ILjava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_itemNegateDamage_1(Random rand) {
		return KillTheRNG.randomness.itemNegateDamage.nextFloat();
//		KillTheRNG.randomness.itemNegateDamage.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* If the item should be damaged when unbreaking is active
	*/
	@Redirect(method = "negateDamage(Lnet/minecraft/item/ItemStack;ILjava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_itemNegateDamage_2(Random rand, int i) {
		return KillTheRNG.randomness.itemNegateDamage.nextInt(i);
//		KillTheRNG.randomness.itemNegateDamage.nextInt(i);
//		return rand.nextInt(i);
	}

}
