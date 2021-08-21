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
	* null
	*/
	@Redirect(method = "apply(Lnet/minecraft/item/ItemStack;Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)Lnet/minecraft/item/ItemStack;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1644_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1644.nextInt(i);
//		KillTheRNG.randomness.random_1644.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "apply(Lnet/minecraft/item/ItemStack;Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)Lnet/minecraft/item/ItemStack;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1645_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1645.nextInt(i);
//		KillTheRNG.randomness.random_1645.nextInt(i);
//		return rand.nextInt(i);
	}

}
