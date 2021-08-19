package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.AbstractHorse;

@Mixin(AbstractHorse.class)
public class MixinAbstractHorse {
	@Redirect(method = "eatingHorse()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_160(Random rand) {
		return KillTheRNG.randomness.random_160.nextFloat();
	}

	@Redirect(method = "eatingHorse()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_161(Random rand) {
		return KillTheRNG.randomness.random_161.nextFloat();
	}

	@Redirect(method = "getHurtSound(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_162(Random rand, int i) {
		return KillTheRNG.randomness.random_162.nextInt(i);
	}

	@Redirect(method = "getAmbientSound()Lnet/minecraft/util/SoundEvent;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_163(Random rand, int i) {
		return KillTheRNG.randomness.random_163.nextInt(i);
	}

	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_164(Random rand) {
		return KillTheRNG.randomness.random_164.nextFloat();
	}

	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_165(Random rand) {
		return KillTheRNG.randomness.random_165.nextFloat();
	}

	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_166(Random rand) {
		return KillTheRNG.randomness.random_166.nextFloat();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_167(Random rand, int i) {
		return KillTheRNG.randomness.random_167.nextInt(i);
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_168(Random rand, int i) {
		return KillTheRNG.randomness.random_168.nextInt(i);
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_169(Random rand, int i) {
		return KillTheRNG.randomness.random_169.nextInt(i);
	}

	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_170(Random rand) {
		return KillTheRNG.randomness.random_170.nextGaussian();
	}

	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_171(Random rand) {
		return KillTheRNG.randomness.random_171.nextGaussian();
	}

	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_172(Random rand) {
		return KillTheRNG.randomness.random_172.nextGaussian();
	}

	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_173(Random rand) {
		return KillTheRNG.randomness.random_173.nextFloat();
	}

	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_174(Random rand) {
		return KillTheRNG.randomness.random_174.nextFloat();
	}

	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_175(Random rand) {
		return KillTheRNG.randomness.random_175.nextFloat();
	}

	@Redirect(method = "getModifiedMaxHealth()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_176(Random rand, int i) {
		return KillTheRNG.randomness.random_176.nextInt(i);
	}

	@Redirect(method = "getModifiedMaxHealth()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_177(Random rand, int i) {
		return KillTheRNG.randomness.random_177.nextInt(i);
	}

	@Redirect(method = "getModifiedJumpStrength()D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_178(Random rand) {
		return KillTheRNG.randomness.random_178.nextDouble();
	}

	@Redirect(method = "getModifiedJumpStrength()D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_179(Random rand) {
		return KillTheRNG.randomness.random_179.nextDouble();
	}

	@Redirect(method = "getModifiedJumpStrength()D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_180(Random rand) {
		return KillTheRNG.randomness.random_180.nextDouble();
	}

	@Redirect(method = "getModifiedMovementSpeed()D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_181(Random rand) {
		return KillTheRNG.randomness.random_181.nextDouble();
	}

	@Redirect(method = "getModifiedMovementSpeed()D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_182(Random rand) {
		return KillTheRNG.randomness.random_182.nextDouble();
	}

	@Redirect(method = "getModifiedMovementSpeed()D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_183(Random rand) {
		return KillTheRNG.randomness.random_183.nextDouble();
	}

	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_184(Random rand, int i) {
		return KillTheRNG.randomness.random_184.nextInt(i);
	}

}
