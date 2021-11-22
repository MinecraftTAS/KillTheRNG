package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.enchantment.EnchantmentDamage;

@Mixin(EnchantmentDamage.class)
public class MixinEnchantmentDamage {

	/**
	* Duration of slowness effect when hitting arthropod enemies
	*/
	@Redirect(method = "onEntityDamaged(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/entity/Entity;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_enchantmentDamageArthropodSlownessDuration_1(Random rand, int i) {
		return KillTheRNG.randomness.enchantmentDamageArthropodSlownessDuration.nextInt(i);
//		KillTheRNG.randomness.enchantmentDamageArthropodSlownessDuration.nextInt(i);
//		return rand.nextInt(i);
	}

}
