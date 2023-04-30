package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.item.ItemChorusFruit.class)
public class MixinItemChorusFruit{

	/**
	* Coords of the player after eating a chorus fruit
	*/
	@Redirect(method = "onItemUseFinish(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/item/ItemStack;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_chorusFruitTeleportCoords_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.chorusFruitTeleportCoords.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.chorusFruitTeleportCoords.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.chorusFruitTeleportCoords.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Coords of the player after eating a chorus fruit
	*/
	@Redirect(method = "onItemUseFinish(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/item/ItemStack;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_chorusFruitTeleportCoords_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.chorusFruitTeleportCoords.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.chorusFruitTeleportCoords.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.chorusFruitTeleportCoords.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Coords of the player after eating a chorus fruit
	*/
	@Redirect(method = "onItemUseFinish(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/item/ItemStack;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_chorusFruitTeleportCoords_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.chorusFruitTeleportCoords.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.chorusFruitTeleportCoords.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.chorusFruitTeleportCoords.nextDouble();
			return rand.nextDouble();
		}
	}


}