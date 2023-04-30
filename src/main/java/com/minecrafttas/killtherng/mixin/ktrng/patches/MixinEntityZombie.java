package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.monster.EntityZombie.class)
public class MixinEntityZombie{

	/**
	* Spawn with having reinforcements?
	*/
	@Redirect(method = "applyEntityAttributes()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_zombieReinforcementsChance_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieReinforcementsChance.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieReinforcementsChance.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieReinforcementsChance.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Ignites other mobs while being on fire
	*/
	@Redirect(method = "attackEntityAsMob(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_zombieIgniteOtherMobs_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieIgniteOtherMobs.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieIgniteOtherMobs.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieIgniteOtherMobs.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* If the zombie calls in other zombies in hard mode
	*/
	@Redirect(method = "attackEntityFrom(Lnet/minecraft/util/DamageSource;F)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_zombieReinforcementsApply_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieReinforcementsApply.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieReinforcementsApply.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieReinforcementsApply.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* If the zombie is able to pickup loot
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_zombieCanPickupLoot_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* If the zombie is able to pickup loot
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_zombieCanPickupLoot_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* If the zombie is able to pickup loot
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_zombieCanPickupLoot_6(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* If the zombie is able to pickup loot
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_zombieCanPickupLoot_7(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* If the zombie is able to pickup loot
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_zombieCanPickupLoot_8(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* If the zombie is able to pickup loot
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_zombieCanPickupLoot_9(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* If the zombie is able to pickup loot
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_zombieCanPickupLoot_10(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* If the zombie is able to pickup loot
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_zombieCanPickupLoot_11(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* If the zombie is able to pickup loot
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_zombieCanPickupLoot_12(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* If the zombie is able to pickup loot
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_zombieCanPickupLoot_13(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* If the zombie is able to pickup loot
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_zombieCanPickupLoot_14(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* If the zombie is able to pickup loot
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_zombieCanPickupLoot_15(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieCanPickupLoot.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* If the villager killed by the zombie will transform into a zombie villager
	*/
	@Redirect(method = "onKillEntity(Lnet/minecraft/entity/EntityLivingBase;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_zombieConvertToZombieVillager_16(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieConvertToZombieVillager.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieConvertToZombieVillager.nextBoolean();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieConvertToZombieVillager.nextBoolean();
			return rand.nextBoolean();
		}
	}

	/**
	* Chance of lighting Zombie on fire
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_zombieFireChance_17(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieFireChance.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieFireChance.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieFireChance.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Chance of lighting Zombie on fire
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_zombieFireChance_18(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieFireChance.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieFireChance.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieFireChance.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Set an item to the main hand based on difficulty
	*/
	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_zombieSetEquipment_19(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieSetEquipment.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieSetEquipment.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieSetEquipment.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Set an item to the main hand based on difficulty
	*/
	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_zombieSetEquipment_20(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieSetEquipment.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieSetEquipment.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.zombieSetEquipment.nextInt(i);
			return rand.nextInt(i);
		}
	}


}