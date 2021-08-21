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
	* Selects the armor piece that should be damaged from thorns
	*/
	@Redirect(method = "getEnchantedItem(Lnet/minecraft/enchantment/Enchantment;Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/item/ItemStack;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_enchantmentHelperDamageItem_1(Random rand, int i) {
		return KillTheRNG.randomness.enchantmentHelperDamageItem.nextInt(i);
//		KillTheRNG.randomness.enchantmentHelperDamageItem.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "calcItemStackEnchantability(Ljava/util/Random;IILnet/minecraft/item/ItemStack;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1896_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1896.nextInt(i);
//		KillTheRNG.randomness.random_1896.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "calcItemStackEnchantability(Ljava/util/Random;IILnet/minecraft/item/ItemStack;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_random_1897_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1897.nextInt(i);
//		KillTheRNG.randomness.random_1897.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1898_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1898.nextInt(i);
//		KillTheRNG.randomness.random_1898.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_random_1899_5(Random rand, int i) {
		return KillTheRNG.randomness.random_1899.nextInt(i);
//		KillTheRNG.randomness.random_1899.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_random_1900_6(Random rand) {
		return KillTheRNG.randomness.random_1900.nextFloat();
//		KillTheRNG.randomness.random_1900.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	private static float redirect_random_1901_7(Random rand) {
		return KillTheRNG.randomness.random_1901.nextFloat();
//		KillTheRNG.randomness.random_1901.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	private static int redirect_random_1902_8(Random rand, int i) {
		return KillTheRNG.randomness.random_1902.nextInt(i);
//		KillTheRNG.randomness.random_1902.nextInt(i);
//		return rand.nextInt(i);
	}

}
