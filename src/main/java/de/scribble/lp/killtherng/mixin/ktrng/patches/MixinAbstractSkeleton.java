package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.AbstractSkeleton;

@Mixin(AbstractSkeleton.class)
public class MixinAbstractSkeleton {

	/**
	* Pitch of Skeleton Shooting
	*/
	@Redirect(method = "attackEntityWithRangedAttack(Lnet/minecraft/entity/EntityLivingBase;F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_skeletonShootSound_1(Random rand) {
		return KillTheRNG.randomness.skeletonShootSound.nextFloat();
//		KillTheRNG.randomness.skeletonShootSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Sets if the skeleton can pick up loot when spawning
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_skeletonCanPickupLoot_2(Random rand) {
		return KillTheRNG.randomness.skeletonCanPickupLoot.nextFloat();
//		KillTheRNG.randomness.skeletonCanPickupLoot.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Sets if the skeleton can pick up loot when spawning
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_skeletonCanPickupLoot_3(Random rand) {
		return KillTheRNG.randomness.skeletonCanPickupLoot.nextFloat();
//		KillTheRNG.randomness.skeletonCanPickupLoot.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Sets if the skeleton can pick up loot when spawning
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_skeletonCanPickupLoot_4(Random rand) {
		return KillTheRNG.randomness.skeletonCanPickupLoot.nextFloat();
//		KillTheRNG.randomness.skeletonCanPickupLoot.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Chance of setting the skeleton on fire
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_skeletonFireChance_5(Random rand) {
		return KillTheRNG.randomness.skeletonFireChance.nextFloat();
//		KillTheRNG.randomness.skeletonFireChance.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Chance of setting the skeleton on fire
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_skeletonFireChance_6(Random rand, int i) {
		return KillTheRNG.randomness.skeletonFireChance.nextInt(i);
//		KillTheRNG.randomness.skeletonFireChance.nextInt(i);
//		return rand.nextInt(i);
	}

}
