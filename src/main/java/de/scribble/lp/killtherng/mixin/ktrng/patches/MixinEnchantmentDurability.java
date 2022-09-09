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
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.itemNegateDamage.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.itemNegateDamage.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.itemNegateDamage.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* If the item should be damaged when unbreaking is active
	*/
	@Redirect(method = "negateDamage(Lnet/minecraft/item/ItemStack;ILjava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_itemNegateDamage_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.itemNegateDamage.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.itemNegateDamage.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.itemNegateDamage.nextInt(i);
			return rand.nextInt(i);
		}
	}


}