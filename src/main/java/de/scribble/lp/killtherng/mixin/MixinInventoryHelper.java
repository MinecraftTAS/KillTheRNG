package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.inventory.InventoryHelper;

@Mixin(InventoryHelper.class)
public class MixinInventoryHelper {

	/**
	* null
	*/
	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_random_1980_0(Random rand) {
		return KillTheRNG.randomness.random_1980.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	private static float redirect_random_1981_1(Random rand) {
		return KillTheRNG.randomness.random_1981.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	private static float redirect_random_1982_2(Random rand) {
		return KillTheRNG.randomness.random_1982.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	private static int redirect_random_1983_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1983.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 4))
	private static double redirect_random_1984_4(Random rand) {
		return KillTheRNG.randomness.random_1984.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 5))
	private static double redirect_random_1985_5(Random rand) {
		return KillTheRNG.randomness.random_1985.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 6))
	private static double redirect_random_1986_6(Random rand) {
		return KillTheRNG.randomness.random_1986.nextGaussian();
	}

}
