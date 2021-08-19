package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.inventory.InventoryHelper;

@Mixin(InventoryHelper.class)
public class MixinInventoryHelper {
	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_random_1980(Random rand) {
		return KillTheRNG.randomness.random_1980.nextFloat();
	}

	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	private static float redirect_random_1981(Random rand) {
		return KillTheRNG.randomness.random_1981.nextFloat();
	}

	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	private static float redirect_random_1982(Random rand) {
		return KillTheRNG.randomness.random_1982.nextFloat();
	}

	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	private static int redirect_random_1983(Random rand, int i) {
		return KillTheRNG.randomness.random_1983.nextInt(i);
	}

	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 4))
	private static double redirect_random_1984(Random rand) {
		return KillTheRNG.randomness.random_1984.nextGaussian();
	}

	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 5))
	private static double redirect_random_1985(Random rand) {
		return KillTheRNG.randomness.random_1985.nextGaussian();
	}

	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 6))
	private static double redirect_random_1986(Random rand) {
		return KillTheRNG.randomness.random_1986.nextGaussian();
	}

}
