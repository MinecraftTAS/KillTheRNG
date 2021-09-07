package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.storage.loot.functions.EnchantRandomly;

@Mixin(EnchantRandomly.class)
public class MixinEnchantRandomly {

	/**
	* Enchant items randomly
	*/
	@Redirect(method = "apply(Lnet/minecraft/item/ItemStack;Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)Lnet/minecraft/item/ItemStack;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_lootEnchantRandomly_1(Random rand, int i) {
		return KillTheRNG.randomness.lootEnchantRandomly.nextInt(i);
//		KillTheRNG.randomness.lootEnchantRandomly.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Enchant items randomly
	*/
	@Redirect(method = "apply(Lnet/minecraft/item/ItemStack;Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)Lnet/minecraft/item/ItemStack;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_lootEnchantRandomly_2(Random rand, int i) {
		return KillTheRNG.randomness.lootEnchantRandomly.nextInt(i);
//		KillTheRNG.randomness.lootEnchantRandomly.nextInt(i);
//		return rand.nextInt(i);
	}

}
