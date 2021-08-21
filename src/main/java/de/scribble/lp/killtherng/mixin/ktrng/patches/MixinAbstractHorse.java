package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.AbstractHorse;

@Mixin(AbstractHorse.class)
public class MixinAbstractHorse {

	/**
	* Pitch of horse eating
	*/
	@Redirect(method = "eatingHorse()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_horseEatSound_1(Random rand) {
		return KillTheRNG.randomness.horseEatSound.nextFloat();
//		KillTheRNG.randomness.horseEatSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of horse eating
	*/
	@Redirect(method = "eatingHorse()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_horseEatSound_2(Random rand) {
		return KillTheRNG.randomness.horseEatSound.nextFloat();
//		KillTheRNG.randomness.horseEatSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* If the horse starts rearing after getting hurt
	*/
	@Redirect(method = "getHurtSound(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_horseRearOnGettingHurt_3(Random rand, int i) {
		return KillTheRNG.randomness.horseRearOnGettingHurt.nextInt(i);
//		KillTheRNG.randomness.horseRearOnGettingHurt.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Make the horse rear randomly
	*/
	@Redirect(method = "getAmbientSound()Lnet/minecraft/util/SoundEvent;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_horseRearOnAmbient_4(Random rand, int i) {
		return KillTheRNG.randomness.horseRearOnAmbient.nextInt(i);
//		KillTheRNG.randomness.horseRearOnAmbient.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Position of the villager happy particles when feeding a young horse
	*/
	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_horseChildGrowingUpParticle_5(Random rand) {
		return KillTheRNG.randomness.horseChildGrowingUpParticle.nextFloat();
//		KillTheRNG.randomness.horseChildGrowingUpParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of the villager happy particles when feeding a young horse
	*/
	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_horseChildGrowingUpParticle_6(Random rand) {
		return KillTheRNG.randomness.horseChildGrowingUpParticle.nextFloat();
//		KillTheRNG.randomness.horseChildGrowingUpParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of the villager happy particles when feeding a young horse
	*/
	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_horseChildGrowingUpParticle_7(Random rand) {
		return KillTheRNG.randomness.horseChildGrowingUpParticle.nextFloat();
//		KillTheRNG.randomness.horseChildGrowingUpParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Plays tail animation
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_horseMoveTailAnimation_8(Random rand, int i) {
		return KillTheRNG.randomness.horseMoveTailAnimation.nextInt(i);
//		KillTheRNG.randomness.horseMoveTailAnimation.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Plays tail animation
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_horseMoveTailAnimation_9(Random rand, int i) {
		return KillTheRNG.randomness.horseMoveTailAnimation.nextInt(i);
//		KillTheRNG.randomness.horseMoveTailAnimation.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Plays tail animation
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_horseMoveTailAnimation_10(Random rand, int i) {
		return KillTheRNG.randomness.horseMoveTailAnimation.nextInt(i);
//		KillTheRNG.randomness.horseMoveTailAnimation.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_170_11(Random rand) {
		return KillTheRNG.randomness.random_170.nextGaussian();
//		KillTheRNG.randomness.random_170.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_171_12(Random rand) {
		return KillTheRNG.randomness.random_171.nextGaussian();
//		KillTheRNG.randomness.random_171.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_172_13(Random rand) {
		return KillTheRNG.randomness.random_172.nextGaussian();
//		KillTheRNG.randomness.random_172.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_173_14(Random rand) {
		return KillTheRNG.randomness.random_173.nextFloat();
//		KillTheRNG.randomness.random_173.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_174_15(Random rand) {
		return KillTheRNG.randomness.random_174.nextFloat();
//		KillTheRNG.randomness.random_174.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnHorseParticles(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_175_16(Random rand) {
		return KillTheRNG.randomness.random_175.nextFloat();
//		KillTheRNG.randomness.random_175.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Max health of the horse
	*/
	@Redirect(method = "getModifiedMaxHealth()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_horseMaxHealth_17(Random rand, int i) {
		return KillTheRNG.randomness.horseMaxHealth.nextInt(i);
//		KillTheRNG.randomness.horseMaxHealth.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Max health of the horse
	*/
	@Redirect(method = "getModifiedMaxHealth()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_horseMaxHealth_18(Random rand, int i) {
		return KillTheRNG.randomness.horseMaxHealth.nextInt(i);
//		KillTheRNG.randomness.horseMaxHealth.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Max jump strength of horse
	*/
	@Redirect(method = "getModifiedJumpStrength()D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_horseJumpHeight_19(Random rand) {
		return KillTheRNG.randomness.horseJumpHeight.nextDouble();
//		KillTheRNG.randomness.horseJumpHeight.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Max jump strength of horse
	*/
	@Redirect(method = "getModifiedJumpStrength()D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_horseJumpHeight_20(Random rand) {
		return KillTheRNG.randomness.horseJumpHeight.nextDouble();
//		KillTheRNG.randomness.horseJumpHeight.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Max jump strength of horse
	*/
	@Redirect(method = "getModifiedJumpStrength()D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_horseJumpHeight_21(Random rand) {
		return KillTheRNG.randomness.horseJumpHeight.nextDouble();
//		KillTheRNG.randomness.horseJumpHeight.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Max movement speed of a horse
	*/
	@Redirect(method = "getModifiedMovementSpeed()D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_horseSpeed_22(Random rand) {
		return KillTheRNG.randomness.horseSpeed.nextDouble();
//		KillTheRNG.randomness.horseSpeed.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Max movement speed of a horse
	*/
	@Redirect(method = "getModifiedMovementSpeed()D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_horseSpeed_23(Random rand) {
		return KillTheRNG.randomness.horseSpeed.nextDouble();
//		KillTheRNG.randomness.horseSpeed.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Max movement speed of a horse
	*/
	@Redirect(method = "getModifiedMovementSpeed()D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_horseSpeed_24(Random rand) {
		return KillTheRNG.randomness.horseSpeed.nextDouble();
//		KillTheRNG.randomness.horseSpeed.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* The horse is a child when spawning
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_horseChild_25(Random rand, int i) {
		return KillTheRNG.randomness.horseChild.nextInt(i);
//		KillTheRNG.randomness.horseChild.nextInt(i);
//		return rand.nextInt(i);
	}

}
