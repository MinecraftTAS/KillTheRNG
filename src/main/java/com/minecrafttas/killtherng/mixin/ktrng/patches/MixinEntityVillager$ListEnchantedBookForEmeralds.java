package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.passive.EntityVillager.ListEnchantedBookForEmeralds.class)
public class MixinEntityVillager$ListEnchantedBookForEmeralds{

	/**
	* null
	*/
	@Redirect(method = "addMerchantRecipe(Lnet/minecraft/entity/IMerchant;Lnet/minecraft/village/MerchantRecipeList;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1032_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_1032.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_1032.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_1032.nextInt(i);
			return rand.nextInt(i);
		}
	}


}