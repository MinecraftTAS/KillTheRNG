package de.scribble.lp.killtherng.mixin.ktrng.patches;

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
	private static float redirect_random_1980_1(Random rand) {
		return KillTheRNG.randomness.random_1980.nextFloat();
//		KillTheRNG.randomness.random_1980.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	private static float redirect_random_1981_2(Random rand) {
		return KillTheRNG.randomness.random_1981.nextFloat();
//		KillTheRNG.randomness.random_1981.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	private static float redirect_random_1982_3(Random rand) {
		return KillTheRNG.randomness.random_1982.nextFloat();
//		KillTheRNG.randomness.random_1982.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1983_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1983.nextInt(i);
//		KillTheRNG.randomness.random_1983.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	private static double redirect_random_1984_5(Random rand) {
		return KillTheRNG.randomness.random_1984.nextGaussian();
//		KillTheRNG.randomness.random_1984.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	private static double redirect_random_1985_6(Random rand) {
		return KillTheRNG.randomness.random_1985.nextGaussian();
//		KillTheRNG.randomness.random_1985.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	private static double redirect_random_1986_7(Random rand) {
		return KillTheRNG.randomness.random_1986.nextGaussian();
//		KillTheRNG.randomness.random_1986.nextGaussian();
//		return rand.nextGaussian();
	}

}
