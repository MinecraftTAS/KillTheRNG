package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.passive.AbstractHorse.class)
public class MixinAbstractHorse{

	/**
	* Pitch of horse eating
	*/
	@Redirect(method = "eatingHorse()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_horseEatSound_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseEatSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseEatSound.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseEatSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of horse eating
	*/
	@Redirect(method = "eatingHorse()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_horseEatSound_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseEatSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseEatSound.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseEatSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Make the horse rear randomly
	*/
	@Redirect(method = "getAmbientSound()Lnet/minecraft/util/SoundEvent;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_horseRearOnAmbient_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseRearOnAmbient.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseRearOnAmbient.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseRearOnAmbient.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* If the horse starts rearing after getting hurt
	*/
	@Redirect(method = "getHurtSound(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_horseRearOnGettingHurt_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseRearOnGettingHurt.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseRearOnGettingHurt.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseRearOnGettingHurt.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Max jump strength of horse
	*/
	@Redirect(method = "getModifiedJumpStrength()D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_horseJumpHeight_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseJumpHeight.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseJumpHeight.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseJumpHeight.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Max jump strength of horse
	*/
	@Redirect(method = "getModifiedJumpStrength()D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_horseJumpHeight_6(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseJumpHeight.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseJumpHeight.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseJumpHeight.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Max jump strength of horse
	*/
	@Redirect(method = "getModifiedJumpStrength()D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_horseJumpHeight_7(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseJumpHeight.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseJumpHeight.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseJumpHeight.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Max health of the horse
	*/
	@Redirect(method = "getModifiedMaxHealth()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_horseMaxHealth_8(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseMaxHealth.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseMaxHealth.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseMaxHealth.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Max health of the horse
	*/
	@Redirect(method = "getModifiedMaxHealth()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_horseMaxHealth_9(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseMaxHealth.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseMaxHealth.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseMaxHealth.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Max movement speed of a horse
	*/
	@Redirect(method = "getModifiedMovementSpeed()D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_horseSpeed_10(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseSpeed.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseSpeed.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseSpeed.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Max movement speed of a horse
	*/
	@Redirect(method = "getModifiedMovementSpeed()D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_horseSpeed_11(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseSpeed.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseSpeed.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseSpeed.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Max movement speed of a horse
	*/
	@Redirect(method = "getModifiedMovementSpeed()D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_horseSpeed_12(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseSpeed.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseSpeed.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseSpeed.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of the villager happy particles when feeding a young horse
	*/
	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_horseChildGrowingUpParticle_13(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseChildGrowingUpParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseChildGrowingUpParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseChildGrowingUpParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of the villager happy particles when feeding a young horse
	*/
	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_horseChildGrowingUpParticle_14(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseChildGrowingUpParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseChildGrowingUpParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseChildGrowingUpParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of the villager happy particles when feeding a young horse
	*/
	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_horseChildGrowingUpParticle_15(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseChildGrowingUpParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseChildGrowingUpParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseChildGrowingUpParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* The horse is a child when spawning
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_horseChild_16(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseChild.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseChild.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseChild.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Plays tail animation
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_horseMoveTailAnimation_17(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseMoveTailAnimation.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseMoveTailAnimation.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseMoveTailAnimation.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Plays tail animation
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_horseMoveTailAnimation_18(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseMoveTailAnimation.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseMoveTailAnimation.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseMoveTailAnimation.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Plays tail animation
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_horseMoveTailAnimation_19(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseMoveTailAnimation.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseMoveTailAnimation.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.horseMoveTailAnimation.nextInt(i);
			return rand.nextInt(i);
		}
	}


}