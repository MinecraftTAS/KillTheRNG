package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.enchantment.EnchantmentHelper;

@Mixin(EnchantmentHelper.class)
public class MixinEnchantmentHelper {

	/**
	* null
	*/
	@Redirect(method = "getEnchantedItem(Lnet/minecraft/enchantment/Enchantment;Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/item/ItemStack;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1895_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1895.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "calcItemStackEnchantability(Ljava/util/Random;IILnet/minecraft/item/ItemStack;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1896_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1896.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "calcItemStackEnchantability(Ljava/util/Random;IILnet/minecraft/item/ItemStack;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_random_1897_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1897.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1898_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1898.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_random_1899_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1899.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	private static float redirect_random_1900_2(Random rand) {
		return KillTheRNG.randomness.random_1900.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	private static float redirect_random_1901_3(Random rand) {
		return KillTheRNG.randomness.random_1901.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	private static int redirect_random_1902_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1902.nextInt(i);
	}

}
