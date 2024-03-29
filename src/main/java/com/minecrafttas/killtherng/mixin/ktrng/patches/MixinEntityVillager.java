package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.passive.EntityVillager.class)
public class MixinEntityVillager{

	/**
	* Time it takes until the villager checks if a village is nearby
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_villagerLookingForVillage_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.villagerLookingForVillage.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.villagerLookingForVillage.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.villagerLookingForVillage.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Time it takes until the villager checks if a village is nearby
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_villagerLookingForVillage_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.villagerLookingForVillage.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.villagerLookingForVillage.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.villagerLookingForVillage.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Time it takes until the villager checks if a village is nearby
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_villagerLookingForVillage_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.villagerLookingForVillage.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.villagerLookingForVillage.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.villagerLookingForVillage.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* How much xp will be spawned after trading
	*/
	@Redirect(method = "useRecipe(Lnet/minecraft/village/MerchantRecipe;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_villagerTradingXp_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.villagerTradingXp.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.villagerTradingXp.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.villagerTradingXp.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* How much xp will be spawned after trading
	*/
	@Redirect(method = "useRecipe(Lnet/minecraft/village/MerchantRecipe;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_villagerTradingXp_5(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.villagerTradingXp.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.villagerTradingXp.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.villagerTradingXp.nextInt(i);
			return rand.nextInt(i);
		}
	}


}