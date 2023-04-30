package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.EntityLiving.class)
public class MixinEntityLiving{

	/**
	* Depawns entity
	*/
	@Redirect(method = "despawnEntity()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_despawningEntity_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.despawningEntity.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.despawningEntity.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.despawningEntity.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* If the entity should drop the equipment
	*/
	@Redirect(method = "dropEquipment(ZI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_equipmentDropChance_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.equipmentDropChance.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.equipmentDropChance.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.equipmentDropChance.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* If the entity should drop the equipment
	*/
	@Redirect(method = "dropEquipment(ZI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_equipmentDropChance_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.equipmentDropChance.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.equipmentDropChance.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.equipmentDropChance.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* If the entity should drop the equipment
	*/
	@Redirect(method = "dropEquipment(ZI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_equipmentDropChance_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.equipmentDropChance.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.equipmentDropChance.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.equipmentDropChance.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Get's the random drops amount
	*/
	@Redirect(method = "dropFewItems(ZI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_dropAmount_5(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.dropAmount.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.dropAmount.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.dropAmount.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Get's the random drops amount
	*/
	@Redirect(method = "dropFewItems(ZI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_dropAmount_6(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.dropAmount.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.dropAmount.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.dropAmount.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Get a random amount of experience
	*/
	@Redirect(method = "getExperiencePoints(Lnet/minecraft/entity/player/EntityPlayer;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_experienceAmount_7(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.experienceAmount.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.experienceAmount.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.experienceAmount.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Get a random amount of experience
	*/
	@Redirect(method = "getExperiencePoints(Lnet/minecraft/entity/player/EntityPlayer;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_experienceAmount_8(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.experienceAmount.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.experienceAmount.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.experienceAmount.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Applies Entity AI
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_applyingEntityAi_9(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.applyingEntityAi.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.applyingEntityAi.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.applyingEntityAi.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Adds a follow range boost
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_followRangeBoost_10(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.followRangeBoost.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.followRangeBoost.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.followRangeBoost.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Adds a follow range boost
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_followRangeBoost_11(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.followRangeBoost.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.followRangeBoost.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.followRangeBoost.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Sets enchantment dependant on difficulty
	*/
	@Redirect(method = "setEnchantmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_setEnchantmentBasedOnDifficulty_12(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.setEnchantmentBasedOnDifficulty.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.setEnchantmentBasedOnDifficulty.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.setEnchantmentBasedOnDifficulty.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Sets enchantment dependant on difficulty
	*/
	@Redirect(method = "setEnchantmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_setEnchantmentBasedOnDifficulty_13(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.setEnchantmentBasedOnDifficulty.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.setEnchantmentBasedOnDifficulty.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.setEnchantmentBasedOnDifficulty.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Sets enchantment dependant on difficulty
	*/
	@Redirect(method = "setEnchantmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_setEnchantmentBasedOnDifficulty_14(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.setEnchantmentBasedOnDifficulty.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.setEnchantmentBasedOnDifficulty.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.setEnchantmentBasedOnDifficulty.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Sets enchantment dependant on difficulty
	*/
	@Redirect(method = "setEnchantmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_setEnchantmentBasedOnDifficulty_15(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.setEnchantmentBasedOnDifficulty.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.setEnchantmentBasedOnDifficulty.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.setEnchantmentBasedOnDifficulty.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Sets armor depending on difficulty
	*/
	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_setArmorDependingOnDifficulty_16(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.setArmorDependingOnDifficulty.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.setArmorDependingOnDifficulty.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.setArmorDependingOnDifficulty.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Sets armor depending on difficulty
	*/
	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_setArmorDependingOnDifficulty_17(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.setArmorDependingOnDifficulty.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.setArmorDependingOnDifficulty.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.setArmorDependingOnDifficulty.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Sets armor depending on difficulty
	*/
	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_setArmorDependingOnDifficulty_18(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.setArmorDependingOnDifficulty.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.setArmorDependingOnDifficulty.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.setArmorDependingOnDifficulty.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Sets armor depending on difficulty
	*/
	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_setArmorDependingOnDifficulty_19(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.setArmorDependingOnDifficulty.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.setArmorDependingOnDifficulty.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.setArmorDependingOnDifficulty.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Sets armor depending on difficulty
	*/
	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_setArmorDependingOnDifficulty_20(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.setArmorDependingOnDifficulty.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.setArmorDependingOnDifficulty.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.setArmorDependingOnDifficulty.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Sets armor depending on difficulty
	*/
	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_setArmorDependingOnDifficulty_21(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.setArmorDependingOnDifficulty.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.setArmorDependingOnDifficulty.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.setArmorDependingOnDifficulty.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Spawn explosion particles
	*/
	@Redirect(method = "spawnExplosionParticle()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_explosionParticle_22(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.explosionParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.explosionParticle.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.explosionParticle.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Spawn explosion particles
	*/
	@Redirect(method = "spawnExplosionParticle()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_explosionParticle_23(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.explosionParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.explosionParticle.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.explosionParticle.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Spawn explosion particles
	*/
	@Redirect(method = "spawnExplosionParticle()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_explosionParticle_24(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.explosionParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.explosionParticle.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.explosionParticle.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Spawn explosion particles
	*/
	@Redirect(method = "spawnExplosionParticle()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_explosionParticle_25(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.explosionParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.explosionParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.explosionParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Spawn explosion particles
	*/
	@Redirect(method = "spawnExplosionParticle()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_explosionParticle_26(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.explosionParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.explosionParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.explosionParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Spawn explosion particles
	*/
	@Redirect(method = "spawnExplosionParticle()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_explosionParticle_27(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.explosionParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.explosionParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.explosionParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* If the item is dropped when a better equipment is available
	*/
	@Redirect(method = "updateEquipmentIfNeeded(Lnet/minecraft/entity/item/EntityItem;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_dropEquipmentIfBetter_28(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.dropEquipmentIfBetter.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.dropEquipmentIfBetter.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.dropEquipmentIfBetter.nextFloat();
			return rand.nextFloat();
		}
	}


}