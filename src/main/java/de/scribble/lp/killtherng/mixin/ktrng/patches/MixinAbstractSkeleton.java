package de.scribble.lp.killtherng.mixin.ktrng.patches;
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
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.skeletonShootSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.skeletonShootSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.skeletonShootSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Sets if the skeleton can pick up loot when spawning
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_skeletonCanPickupLoot_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.skeletonCanPickupLoot.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.skeletonCanPickupLoot.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.skeletonCanPickupLoot.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Sets if the skeleton can pick up loot when spawning
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_skeletonCanPickupLoot_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.skeletonCanPickupLoot.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.skeletonCanPickupLoot.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.skeletonCanPickupLoot.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Sets if the skeleton can pick up loot when spawning
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_skeletonCanPickupLoot_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.skeletonCanPickupLoot.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.skeletonCanPickupLoot.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.skeletonCanPickupLoot.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Chance of setting the skeleton on fire
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_skeletonFireChance_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.skeletonFireChance.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.skeletonFireChance.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.skeletonFireChance.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Chance of setting the skeleton on fire
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_skeletonFireChance_6(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.skeletonFireChance.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.skeletonFireChance.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.skeletonFireChance.nextInt(i);
			return rand.nextInt(i);
		}
	}


}