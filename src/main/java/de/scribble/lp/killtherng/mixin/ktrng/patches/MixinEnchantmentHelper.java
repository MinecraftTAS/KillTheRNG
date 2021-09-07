package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.enchantment.EnchantmentHelper;

@Mixin(EnchantmentHelper.class)
public class MixinEnchantmentHelper {

	/**
	* Random Enchantment Level
	*/
	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_enchantLevel_1(Random rand, int i) {
		return KillTheRNG.randomness.enchantLevel.nextInt(i);
//		KillTheRNG.randomness.enchantLevel.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Random Enchantment Level
	*/
	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_enchantLevel_2(Random rand, int i) {
		return KillTheRNG.randomness.enchantLevel.nextInt(i);
//		KillTheRNG.randomness.enchantLevel.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Random Enchantment for Level
	*/
	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_enchantMent_3(Random rand) {
		return KillTheRNG.randomness.enchantMent.nextFloat();
//		KillTheRNG.randomness.enchantMent.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Random Enchantment for Level
	*/
	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	private static float redirect_enchantMent_4(Random rand) {
		return KillTheRNG.randomness.enchantMent.nextFloat();
//		KillTheRNG.randomness.enchantMent.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Random Enchantment for Level
	*/
	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	private static int redirect_enchantMent_5(Random rand, int i) {
		return KillTheRNG.randomness.enchantMent.nextInt(i);
//		KillTheRNG.randomness.enchantMent.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Calculates whether an Item is enchantable with set enchantment
	*/
	@Redirect(method = "calcItemStackEnchantability(Ljava/util/Random;IILnet/minecraft/item/ItemStack;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_enchantibiliyRandom_6(Random rand, int i) {
		return KillTheRNG.randomness.enchantibiliyRandom.nextInt(i);
//		KillTheRNG.randomness.enchantibiliyRandom.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Calculates whether an Item is enchantable with set enchantment
	*/
	@Redirect(method = "calcItemStackEnchantability(Ljava/util/Random;IILnet/minecraft/item/ItemStack;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_enchantibiliyRandom_7(Random rand, int i) {
		return KillTheRNG.randomness.enchantibiliyRandom.nextInt(i);
//		KillTheRNG.randomness.enchantibiliyRandom.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Selects the armor piece that should be damaged from thorns
	*/
	@Redirect(method = "getEnchantedItem(Lnet/minecraft/enchantment/Enchantment;Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/item/ItemStack;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_enchantmentHelperDamageItem_8(Random rand, int i) {
		return KillTheRNG.randomness.enchantmentHelperDamageItem.nextInt(i);
//		KillTheRNG.randomness.enchantmentHelperDamageItem.nextInt(i);
//		return rand.nextInt(i);
	}

}
