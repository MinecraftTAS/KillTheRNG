package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.inventory.InventoryHelper.class)
public class MixinInventoryHelper{

	/**
	* Offset of Dropped Items
	*/
	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_dropItemPositionOffset_1(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.dropItemPositionOffset.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.dropItemPositionOffset.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Offset of Dropped Items
	*/
	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	private static float redirect_dropItemPositionOffset_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.dropItemPositionOffset.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.dropItemPositionOffset.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Offset of Dropped Items
	*/
	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	private static float redirect_dropItemPositionOffset_3(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.dropItemPositionOffset.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.dropItemPositionOffset.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Stack Count of Items dropped or split into another item stack
	*/
	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_dropItemCount_4(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.dropItemCount.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.dropItemCount.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Velocity of Dropped Items
	*/
	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	private static double redirect_dropItemVelocity_5(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.dropItemVelocity.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.dropItemVelocity.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Velocity of Dropped Items
	*/
	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	private static double redirect_dropItemVelocity_6(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.dropItemVelocity.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.dropItemVelocity.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Velocity of Dropped Items
	*/
	@Redirect(method = "spawnItemStack(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	private static double redirect_dropItemVelocity_7(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.dropItemVelocity.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.dropItemVelocity.nextGaussian();
//		return rand.nextGaussian();
	}


}