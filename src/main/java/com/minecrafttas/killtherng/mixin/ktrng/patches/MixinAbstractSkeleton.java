package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.monster.AbstractSkeleton.class)
public class MixinAbstractSkeleton{

	/**
	* Pitch of Skeleton Shooting
	*/
	@Redirect(method = "attackEntityWithRangedAttack(Lnet/minecraft/entity/EntityLivingBase;F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_skeletonShootSound_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.skeletonShootSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.skeletonShootSound.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.skeletonShootSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Sets if the skeleton can pick up loot when spawning
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_skeletonCanPickupLoot_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.skeletonCanPickupLoot.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.skeletonCanPickupLoot.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.skeletonCanPickupLoot.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Sets if the skeleton can pick up loot when spawning
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_skeletonCanPickupLoot_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.skeletonCanPickupLoot.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.skeletonCanPickupLoot.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.skeletonCanPickupLoot.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Sets if the skeleton can pick up loot when spawning
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_skeletonCanPickupLoot_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.skeletonCanPickupLoot.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.skeletonCanPickupLoot.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.skeletonCanPickupLoot.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Chance of setting the skeleton on fire
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_skeletonFireChance_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.skeletonFireChance.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.skeletonFireChance.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.skeletonFireChance.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Chance of setting the skeleton on fire
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_skeletonFireChance_6(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.skeletonFireChance.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.skeletonFireChance.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.skeletonFireChance.nextInt(i);
			return rand.nextInt(i);
		}
	}


}