package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.EntityLiving;

@Mixin(EntityLiving.class)
public class MixinEntityLiving {

	/**
	* null
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_125_0(Random rand, int i) {
		return KillTheRNG.randomness.random_125.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getExperiencePoints(Lnet/minecraft/entity/player/EntityPlayer;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_126_0(Random rand, int i) {
		return KillTheRNG.randomness.random_126.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getExperiencePoints(Lnet/minecraft/entity/player/EntityPlayer;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_127_1(Random rand, int i) {
		return KillTheRNG.randomness.random_127.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "spawnExplosionParticle()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_128_0(Random rand) {
		return KillTheRNG.randomness.random_128.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnExplosionParticle()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_129_1(Random rand) {
		return KillTheRNG.randomness.random_129.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnExplosionParticle()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_130_2(Random rand) {
		return KillTheRNG.randomness.random_130.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnExplosionParticle()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_131_3(Random rand) {
		return KillTheRNG.randomness.random_131.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnExplosionParticle()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_132_4(Random rand) {
		return KillTheRNG.randomness.random_132.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnExplosionParticle()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_133_5(Random rand) {
		return KillTheRNG.randomness.random_133.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "dropFewItems(ZI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_134_0(Random rand, int i) {
		return KillTheRNG.randomness.random_134.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "dropFewItems(ZI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_135_1(Random rand, int i) {
		return KillTheRNG.randomness.random_135.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateEquipmentIfNeeded(Lnet/minecraft/entity/item/EntityItem;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_136_0(Random rand) {
		return KillTheRNG.randomness.random_136.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "despawnEntity()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_137_0(Random rand, int i) {
		return KillTheRNG.randomness.random_137.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "dropEquipment(ZI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_138_0(Random rand) {
		return KillTheRNG.randomness.random_138.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "dropEquipment(ZI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_139_1(Random rand, int i) {
		return KillTheRNG.randomness.random_139.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "dropEquipment(ZI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_140_2(Random rand, int i) {
		return KillTheRNG.randomness.random_140.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_141_0(Random rand) {
		return KillTheRNG.randomness.random_141.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_142_1(Random rand, int i) {
		return KillTheRNG.randomness.random_142.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_143_2(Random rand) {
		return KillTheRNG.randomness.random_143.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_144_3(Random rand) {
		return KillTheRNG.randomness.random_144.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_145_4(Random rand) {
		return KillTheRNG.randomness.random_145.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_146_5(Random rand) {
		return KillTheRNG.randomness.random_146.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "setEnchantmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_147_0(Random rand) {
		return KillTheRNG.randomness.random_147.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "setEnchantmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_148_1(Random rand, int i) {
		return KillTheRNG.randomness.random_148.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "setEnchantmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_149_2(Random rand) {
		return KillTheRNG.randomness.random_149.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "setEnchantmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_150_3(Random rand, int i) {
		return KillTheRNG.randomness.random_150.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_151_0(Random rand) {
		return KillTheRNG.randomness.random_151.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_152_1(Random rand) {
		return KillTheRNG.randomness.random_152.nextFloat();
	}

}
