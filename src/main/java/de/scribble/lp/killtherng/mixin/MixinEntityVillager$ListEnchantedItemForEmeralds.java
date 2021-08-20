package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityVillager;

@Mixin(EntityVillager.ListEnchantedItemForEmeralds.class)
public class MixinEntityVillager$ListEnchantedItemForEmeralds {

	/**
	* null
	*/
	@Redirect(method = "addMerchantRecipe(Lnet/minecraft/entity/IMerchant;Lnet/minecraft/village/MerchantRecipeList;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1031_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1031.nextInt(i);
	}

}
