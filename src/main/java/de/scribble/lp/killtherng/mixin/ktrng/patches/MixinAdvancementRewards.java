package de.scribble.lp.killtherng.mixin.ktrng.patches;
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
		return de.scribble.lp.killtherng.KillTheRNG.randomness.advancementRewardsLoot.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.advancementRewardsLoot.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Map makers can decide on random rewards for advancements
	*/
	@Redirect(method = "apply(Lnet/minecraft/entity/player/EntityPlayerMP;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_advancementRewardsLoot_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.advancementRewardsLoot.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.advancementRewardsLoot.nextFloat();
//		return rand.nextFloat();
	}


}