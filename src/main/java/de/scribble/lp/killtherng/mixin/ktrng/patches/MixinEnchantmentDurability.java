package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.enchantment.EnchantmentDurability.class)
public class MixinEnchantmentDurability{

	/**
	* If the item should be damaged when unbreaking is active
	*/
	@Redirect(method = "negateDamage(Lnet/minecraft/item/ItemStack;ILjava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_itemNegateDamage_1(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.itemNegateDamage.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.itemNegateDamage.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* If the item should be damaged when unbreaking is active
	*/
	@Redirect(method = "negateDamage(Lnet/minecraft/item/ItemStack;ILjava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_itemNegateDamage_2(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.itemNegateDamage.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.itemNegateDamage.nextInt(i);
//		return rand.nextInt(i);
	}


}