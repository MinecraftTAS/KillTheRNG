package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.EntityLiving;

@Mixin(EntityLiving.class)
public class MixinEntityLiving {

	/**
	* Depawns entity
	*/
	@Redirect(method = "despawnEntity()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_despawningEntity_1(Random rand, int i) {
		return KillTheRNG.randomness.despawningEntity.nextInt(i);
//		KillTheRNG.randomness.despawningEntity.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* If the entity should drop the equipment
	*/
	@Redirect(method = "dropEquipment(ZI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_equipmentDropChance_2(Random rand) {
		return KillTheRNG.randomness.equipmentDropChance.nextFloat();
//		KillTheRNG.randomness.equipmentDropChance.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* If the entity should drop the equipment
	*/
	@Redirect(method = "dropEquipment(ZI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_equipmentDropChance_3(Random rand, int i) {
		return KillTheRNG.randomness.equipmentDropChance.nextInt(i);
//		KillTheRNG.randomness.equipmentDropChance.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* If the entity should drop the equipment
	*/
	@Redirect(method = "dropEquipment(ZI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_equipmentDropChance_4(Random rand, int i) {
		return KillTheRNG.randomness.equipmentDropChance.nextInt(i);
//		KillTheRNG.randomness.equipmentDropChance.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Get's the random drops amount
	*/
	@Redirect(method = "dropFewItems(ZI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_dropAmount_5(Random rand, int i) {
		return KillTheRNG.randomness.dropAmount.nextInt(i);
//		KillTheRNG.randomness.dropAmount.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Get's the random drops amount
	*/
	@Redirect(method = "dropFewItems(ZI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_dropAmount_6(Random rand, int i) {
		return KillTheRNG.randomness.dropAmount.nextInt(i);
//		KillTheRNG.randomness.dropAmount.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Get a random amount of experience
	*/
	@Redirect(method = "getExperiencePoints(Lnet/minecraft/entity/player/EntityPlayer;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_experienceAmount_7(Random rand, int i) {
		return KillTheRNG.randomness.experienceAmount.nextInt(i);
//		KillTheRNG.randomness.experienceAmount.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Get a random amount of experience
	*/
	@Redirect(method = "getExperiencePoints(Lnet/minecraft/entity/player/EntityPlayer;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_experienceAmount_8(Random rand, int i) {
		return KillTheRNG.randomness.experienceAmount.nextInt(i);
//		KillTheRNG.randomness.experienceAmount.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Applies Entity AI
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_applyingEntityAi_9(Random rand, int i) {
		return KillTheRNG.randomness.applyingEntityAi.nextInt(i);
//		KillTheRNG.randomness.applyingEntityAi.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Adds a follow range boost
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_followRangeBoost_10(Random rand) {
		return KillTheRNG.randomness.followRangeBoost.nextGaussian();
//		KillTheRNG.randomness.followRangeBoost.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Adds a follow range boost
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_followRangeBoost_11(Random rand) {
		return KillTheRNG.randomness.followRangeBoost.nextFloat();
//		KillTheRNG.randomness.followRangeBoost.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Sets enchantment dependant on difficulty
	*/
	@Redirect(method = "setEnchantmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_setEnchantmentBasedOnDifficulty_12(Random rand) {
		return KillTheRNG.randomness.setEnchantmentBasedOnDifficulty.nextFloat();
//		KillTheRNG.randomness.setEnchantmentBasedOnDifficulty.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Sets enchantment dependant on difficulty
	*/
	@Redirect(method = "setEnchantmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_setEnchantmentBasedOnDifficulty_13(Random rand, int i) {
		return KillTheRNG.randomness.setEnchantmentBasedOnDifficulty.nextInt(i);
//		KillTheRNG.randomness.setEnchantmentBasedOnDifficulty.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Sets enchantment dependant on difficulty
	*/
	@Redirect(method = "setEnchantmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_setEnchantmentBasedOnDifficulty_14(Random rand) {
		return KillTheRNG.randomness.setEnchantmentBasedOnDifficulty.nextFloat();
//		KillTheRNG.randomness.setEnchantmentBasedOnDifficulty.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Sets enchantment dependant on difficulty
	*/
	@Redirect(method = "setEnchantmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_setEnchantmentBasedOnDifficulty_15(Random rand, int i) {
		return KillTheRNG.randomness.setEnchantmentBasedOnDifficulty.nextInt(i);
//		KillTheRNG.randomness.setEnchantmentBasedOnDifficulty.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Sets armor depending on difficulty
	*/
	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_setArmorDependingOnDifficulty_16(Random rand) {
		return KillTheRNG.randomness.setArmorDependingOnDifficulty.nextFloat();
//		KillTheRNG.randomness.setArmorDependingOnDifficulty.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Sets armor depending on difficulty
	*/
	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_setArmorDependingOnDifficulty_17(Random rand, int i) {
		return KillTheRNG.randomness.setArmorDependingOnDifficulty.nextInt(i);
//		KillTheRNG.randomness.setArmorDependingOnDifficulty.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Sets armor depending on difficulty
	*/
	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_setArmorDependingOnDifficulty_18(Random rand) {
		return KillTheRNG.randomness.setArmorDependingOnDifficulty.nextFloat();
//		KillTheRNG.randomness.setArmorDependingOnDifficulty.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Sets armor depending on difficulty
	*/
	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_setArmorDependingOnDifficulty_19(Random rand) {
		return KillTheRNG.randomness.setArmorDependingOnDifficulty.nextFloat();
//		KillTheRNG.randomness.setArmorDependingOnDifficulty.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Sets armor depending on difficulty
	*/
	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_setArmorDependingOnDifficulty_20(Random rand) {
		return KillTheRNG.randomness.setArmorDependingOnDifficulty.nextFloat();
//		KillTheRNG.randomness.setArmorDependingOnDifficulty.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Sets armor depending on difficulty
	*/
	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_setArmorDependingOnDifficulty_21(Random rand) {
		return KillTheRNG.randomness.setArmorDependingOnDifficulty.nextFloat();
//		KillTheRNG.randomness.setArmorDependingOnDifficulty.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Spawn explosion particles
	*/
	@Redirect(method = "spawnExplosionParticle()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_explosionParticle_22(Random rand) {
		return KillTheRNG.randomness.explosionParticle.nextGaussian();
//		KillTheRNG.randomness.explosionParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Spawn explosion particles
	*/
	@Redirect(method = "spawnExplosionParticle()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_explosionParticle_23(Random rand) {
		return KillTheRNG.randomness.explosionParticle.nextGaussian();
//		KillTheRNG.randomness.explosionParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Spawn explosion particles
	*/
	@Redirect(method = "spawnExplosionParticle()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_explosionParticle_24(Random rand) {
		return KillTheRNG.randomness.explosionParticle.nextGaussian();
//		KillTheRNG.randomness.explosionParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Spawn explosion particles
	*/
	@Redirect(method = "spawnExplosionParticle()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_explosionParticle_25(Random rand) {
		return KillTheRNG.randomness.explosionParticle.nextFloat();
//		KillTheRNG.randomness.explosionParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Spawn explosion particles
	*/
	@Redirect(method = "spawnExplosionParticle()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_explosionParticle_26(Random rand) {
		return KillTheRNG.randomness.explosionParticle.nextFloat();
//		KillTheRNG.randomness.explosionParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Spawn explosion particles
	*/
	@Redirect(method = "spawnExplosionParticle()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_explosionParticle_27(Random rand) {
		return KillTheRNG.randomness.explosionParticle.nextFloat();
//		KillTheRNG.randomness.explosionParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* If the item is dropped when a better equipment is available
	*/
	@Redirect(method = "updateEquipmentIfNeeded(Lnet/minecraft/entity/item/EntityItem;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_dropEquipmentIfBetter_28(Random rand) {
		return KillTheRNG.randomness.dropEquipmentIfBetter.nextFloat();
//		KillTheRNG.randomness.dropEquipmentIfBetter.nextFloat();
//		return rand.nextFloat();
	}

}
