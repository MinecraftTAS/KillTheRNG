package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntityZombie;

@Mixin(EntityZombie.class)
public class MixinEntityZombie {

	/**
	* null
	*/
	@Redirect(method = "applyEntityAttributes()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_732_0(Random rand) {
		return KillTheRNG.randomness.random_732.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_733_0(Random rand) {
		return KillTheRNG.randomness.random_733.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_734_1(Random rand, int i) {
		return KillTheRNG.randomness.random_734.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "attackEntityFrom(Lnet/minecraft/util/DamageSource;F)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_735_0(Random rand) {
		return KillTheRNG.randomness.random_735.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "attackEntityAsMob(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_736_0(Random rand) {
		return KillTheRNG.randomness.random_736.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_737_0(Random rand) {
		return KillTheRNG.randomness.random_737.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_738_1(Random rand, int i) {
		return KillTheRNG.randomness.random_738.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "onKillEntity(Lnet/minecraft/entity/EntityLivingBase;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_random_739_0(Random rand) {
		return KillTheRNG.randomness.random_739.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_740_0(Random rand) {
		return KillTheRNG.randomness.random_740.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_741_1(Random rand) {
		return KillTheRNG.randomness.random_741.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_742_2(Random rand) {
		return KillTheRNG.randomness.random_742.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_743_3(Random rand) {
		return KillTheRNG.randomness.random_743.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_744_4(Random rand) {
		return KillTheRNG.randomness.random_744.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_745_5(Random rand) {
		return KillTheRNG.randomness.random_745.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_746_6(Random rand) {
		return KillTheRNG.randomness.random_746.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 7))
	public double redirect_random_747_7(Random rand) {
		return KillTheRNG.randomness.random_747.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 8))
	public double redirect_random_748_8(Random rand) {
		return KillTheRNG.randomness.random_748.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 9))
	public float redirect_random_749_9(Random rand) {
		return KillTheRNG.randomness.random_749.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 10))
	public double redirect_random_750_10(Random rand) {
		return KillTheRNG.randomness.random_750.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 11))
	public double redirect_random_751_11(Random rand) {
		return KillTheRNG.randomness.random_751.nextDouble();
	}

}
