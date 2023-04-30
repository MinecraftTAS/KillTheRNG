package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.advancements.AdvancementRewards.class)
public class MixinAdvancementRewards{

	/**
	* Map makers can decide on random rewards for advancements
	*/
	@Redirect(method = "apply(Lnet/minecraft/entity/player/EntityPlayerMP;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_advancementRewardsLoot_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.advancementRewardsLoot.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.advancementRewardsLoot.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.advancementRewardsLoot.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Map makers can decide on random rewards for advancements
	*/
	@Redirect(method = "apply(Lnet/minecraft/entity/player/EntityPlayerMP;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_advancementRewardsLoot_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.advancementRewardsLoot.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.advancementRewardsLoot.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.advancementRewardsLoot.nextFloat();
			return rand.nextFloat();
		}
	}


}