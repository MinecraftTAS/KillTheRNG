package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.enchantment.EnchantmentHelper.class)
public class MixinEnchantmentHelper{

	/**
	* Random Enchantment Level
	*/
	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_enchantLevel_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantLevel.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantLevel.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantLevel.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Random Enchantment Level
	*/
	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_enchantLevel_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantLevel.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantLevel.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantLevel.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Random Enchantment for Level
	*/
	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_enchantMent_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantMent.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantMent.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantMent.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Random Enchantment for Level
	*/
	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	private static float redirect_enchantMent_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantMent.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantMent.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantMent.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Random Enchantment for Level
	*/
	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	private static int redirect_enchantMent_5(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantMent.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantMent.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantMent.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Calculates whether an Item is enchantable with set enchantment
	*/
	@Redirect(method = "calcItemStackEnchantability(Ljava/util/Random;IILnet/minecraft/item/ItemStack;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_enchantibiliyRandom_6(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantibiliyRandom.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantibiliyRandom.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantibiliyRandom.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Calculates whether an Item is enchantable with set enchantment
	*/
	@Redirect(method = "calcItemStackEnchantability(Ljava/util/Random;IILnet/minecraft/item/ItemStack;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_enchantibiliyRandom_7(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantibiliyRandom.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantibiliyRandom.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantibiliyRandom.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Selects the armor piece that should be damaged from thorns
	*/
	@Redirect(method = "getEnchantedItem(Lnet/minecraft/enchantment/Enchantment;Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/item/ItemStack;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_enchantmentHelperDamageItem_8(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantmentHelperDamageItem.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantmentHelperDamageItem.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.enchantmentHelperDamageItem.nextInt(i);
			return rand.nextInt(i);
		}
	}


}