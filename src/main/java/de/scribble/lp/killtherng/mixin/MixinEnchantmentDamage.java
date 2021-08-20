package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.enchantment.EnchantmentDamage;

@Mixin(EnchantmentDamage.class)
public class MixinEnchantmentDamage {

	/**
	* null
	*/
	@Redirect(method = "onEntityDamaged(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/entity/Entity;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_566_0(Random rand, int i) {
		return KillTheRNG.randomness.random_566.nextInt(i);
	}

}
