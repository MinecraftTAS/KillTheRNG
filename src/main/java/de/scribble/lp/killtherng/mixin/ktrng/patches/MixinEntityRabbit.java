package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityRabbit;

@Mixin(EntityRabbit.class)
public class MixinEntityRabbit {

	/**
	* Pitch of the sound when the killer rabbit attacks
	*/
	@Redirect(method = "attackEntityAsMob(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_rabbitKillerAttackSound_1(Random rand) {
		return KillTheRNG.randomness.rabbitKillerAttackSound.nextFloat();
//		KillTheRNG.randomness.rabbitKillerAttackSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of the sound when the killer rabbit attacks
	*/
	@Redirect(method = "attackEntityAsMob(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_rabbitKillerAttackSound_2(Random rand) {
		return KillTheRNG.randomness.rabbitKillerAttackSound.nextFloat();
//		KillTheRNG.randomness.rabbitKillerAttackSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* If the variant of the child is random
	*/
	@Redirect(method = "createChild(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/passive/EntityRabbit;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_rabbitChildRandomType_3(Random rand, int i) {
		return KillTheRNG.randomness.rabbitChildRandomType.nextInt(i);
//		KillTheRNG.randomness.rabbitChildRandomType.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* If the variant of the child is random
	*/
	@Redirect(method = "createChild(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/passive/EntityRabbit;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_rabbitChildRandomType_4(Random rand) {
		return KillTheRNG.randomness.rabbitChildRandomType.nextBoolean();
//		KillTheRNG.randomness.rabbitChildRandomType.nextBoolean();
//		return rand.nextBoolean();
	}

	/**
	* Location of the carrot eating particles
	*/
	@Redirect(method = "createEatingParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_rabbitEatingParticle_5(Random rand) {
		return KillTheRNG.randomness.rabbitEatingParticle.nextFloat();
//		KillTheRNG.randomness.rabbitEatingParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Location of the carrot eating particles
	*/
	@Redirect(method = "createEatingParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_rabbitEatingParticle_6(Random rand) {
		return KillTheRNG.randomness.rabbitEatingParticle.nextFloat();
//		KillTheRNG.randomness.rabbitEatingParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Location of the carrot eating particles
	*/
	@Redirect(method = "createEatingParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_rabbitEatingParticle_7(Random rand) {
		return KillTheRNG.randomness.rabbitEatingParticle.nextFloat();
//		KillTheRNG.randomness.rabbitEatingParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Which variant the rabbit will have
	*/
	@Redirect(method = "getRandomRabbitType()I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_rabbitRandomVariant_8(Random rand, int i) {
		return KillTheRNG.randomness.rabbitRandomVariant.nextInt(i);
//		KillTheRNG.randomness.rabbitRandomVariant.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Pitch of rabbit jumping
	*/
	@Redirect(method = "setJumping(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_rabbitJumpingSound_9(Random rand) {
		return KillTheRNG.randomness.rabbitJumpingSound.nextFloat();
//		KillTheRNG.randomness.rabbitJumpingSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of rabbit jumping
	*/
	@Redirect(method = "setJumping(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_rabbitJumpingSound_10(Random rand) {
		return KillTheRNG.randomness.rabbitJumpingSound.nextFloat();
//		KillTheRNG.randomness.rabbitJumpingSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* How fast a rabbit eats a carrot
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_rabbitCarrotEatenSpeed_11(Random rand, int i) {
		return KillTheRNG.randomness.rabbitCarrotEatenSpeed.nextInt(i);
//		KillTheRNG.randomness.rabbitCarrotEatenSpeed.nextInt(i);
//		return rand.nextInt(i);
	}

}
