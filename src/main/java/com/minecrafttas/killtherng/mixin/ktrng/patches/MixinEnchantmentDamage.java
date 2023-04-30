package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.enchantment.EnchantmentDamage.class)
public class MixinEnchantmentDamage{

	/**
	* Duration of slowness effect when hitting arthropod enemies
	*/
	@Redirect(method = "onEntityDamaged(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/entity/Entity;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_enchantmentDamageArthropodSlownessDuration_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantmentDamageArthropodSlownessDuration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantmentDamageArthropodSlownessDuration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantmentDamageArthropodSlownessDuration.nextInt(i);
			return rand.nextInt(i);
		}
	}


}