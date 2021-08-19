package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.enchantment.EnchantmentHelper;

@Mixin(EnchantmentHelper.class)
public class MixinEnchantmentHelper {
	@Redirect(method = "getEnchantedItem(Lnet/minecraft/enchantment/Enchantment;Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/item/ItemStack;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1895(Random rand, int i) {
		return KillTheRNG.randomness.random_1895.nextInt(i);
	}

	@Redirect(method = "calcItemStackEnchantability(Ljava/util/Random;IILnet/minecraft/item/ItemStack;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1896(Random rand, int i) {
		return KillTheRNG.randomness.random_1896.nextInt(i);
	}

	@Redirect(method = "calcItemStackEnchantability(Ljava/util/Random;IILnet/minecraft/item/ItemStack;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_random_1897(Random rand, int i) {
		return KillTheRNG.randomness.random_1897.nextInt(i);
	}

	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1898(Random rand, int i) {
		return KillTheRNG.randomness.random_1898.nextInt(i);
	}

	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_random_1899(Random rand, int i) {
		return KillTheRNG.randomness.random_1899.nextInt(i);
	}

	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	private static float redirect_random_1900(Random rand) {
		return KillTheRNG.randomness.random_1900.nextFloat();
	}

	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	private static float redirect_random_1901(Random rand) {
		return KillTheRNG.randomness.random_1901.nextFloat();
	}

	@Redirect(method = "buildEnchantmentList(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	private static int redirect_random_1902(Random rand, int i) {
		return KillTheRNG.randomness.random_1902.nextInt(i);
	}

}
