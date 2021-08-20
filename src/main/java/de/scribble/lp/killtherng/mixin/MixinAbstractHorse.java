package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.AbstractHorse;

@Mixin(AbstractHorse.class)
public class MixinAbstractHorse {

	/**
	* null
	*/
	@Redirect(method = "eatingHorse()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_160_0(Random rand) {
		return KillTheRNG.randomness.random_160.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "eatingHorse()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_161_1(Random rand) {
		return KillTheRNG.randomness.random_161.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "getHurtSound(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_162_0(Random rand, int i) {
		return KillTheRNG.randomness.random_162.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getAmbientSound()Lnet/minecraft/util/SoundEvent;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_163_0(Random rand, int i) {
		return KillTheRNG.randomness.random_163.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_164_0(Random rand) {
		return KillTheRNG.randomness.random_164.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_165_1(Random rand) {
		return KillTheRNG.randomness.random_165.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_166_2(Random rand) {
		return KillTheRNG.randomness.random_166.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_167_0(Random rand, int i) {
		return KillTheRNG.randomness.random_167.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_168_1(Random rand, int i) {
		return KillTheRNG.randomness.random_168.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_169_2(Random rand, int i) {
		return KillTheRNG.randomness.random_169.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_170_0(Random rand) {
		return KillTheRNG.randomness.random_170.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_171_1(Random rand) {
		return KillTheRNG.randomness.random_171.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_172_2(Random rand) {
		return KillTheRNG.randomness.random_172.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_173_3(Random rand) {
		return KillTheRNG.randomness.random_173.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_174_4(Random rand) {
		return KillTheRNG.randomness.random_174.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_175_5(Random rand) {
		return KillTheRNG.randomness.random_175.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "getModifiedMaxHealth()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_176_0(Random rand, int i) {
		return KillTheRNG.randomness.random_176.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getModifiedMaxHealth()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_177_1(Random rand, int i) {
		return KillTheRNG.randomness.random_177.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getModifiedJumpStrength()D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_178_0(Random rand) {
		return KillTheRNG.randomness.random_178.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "getModifiedJumpStrength()D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_179_1(Random rand) {
		return KillTheRNG.randomness.random_179.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "getModifiedJumpStrength()D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_180_2(Random rand) {
		return KillTheRNG.randomness.random_180.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "getModifiedMovementSpeed()D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_181_0(Random rand) {
		return KillTheRNG.randomness.random_181.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "getModifiedMovementSpeed()D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_182_1(Random rand) {
		return KillTheRNG.randomness.random_182.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "getModifiedMovementSpeed()D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_183_2(Random rand) {
		return KillTheRNG.randomness.random_183.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_184_0(Random rand, int i) {
		return KillTheRNG.randomness.random_184.nextInt(i);
	}

}
