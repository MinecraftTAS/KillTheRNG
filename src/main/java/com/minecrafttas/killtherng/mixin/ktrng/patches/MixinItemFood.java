package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.item.ItemFood.class)
public class MixinItemFood{

	/**
	* null
	*/
	@Redirect(method = "onFoodEaten(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_571_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_571.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_571.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_571.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "onItemUseFinish(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/item/ItemStack;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_570_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_570.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_570.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_570.nextFloat();
			return rand.nextFloat();
		}
	}


}