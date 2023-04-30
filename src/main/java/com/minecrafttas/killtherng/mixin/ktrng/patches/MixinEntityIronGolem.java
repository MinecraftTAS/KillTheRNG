package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.monster.EntityIronGolem.class)
public class MixinEntityIronGolem{

	/**
	* Adds random damage to the base damage
	*/
	@Redirect(method = "attackEntityAsMob(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_ironGolemDamage_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ironGolemDamage.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ironGolemDamage.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ironGolemDamage.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Sets the attack target if a monster collides with the iron golem
	*/
	@Redirect(method = "collideWithEntity(Lnet/minecraft/entity/Entity;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_golemSetAttackTarget_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.golemSetAttackTarget.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.golemSetAttackTarget.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.golemSetAttackTarget.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Whether particles will be shown
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_ironGolemParticlesEnabled_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ironGolemParticlesEnabled.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ironGolemParticlesEnabled.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ironGolemParticlesEnabled.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Whether particles will be shown
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_ironGolemParticlesEnabled_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ironGolemParticlesEnabled.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ironGolemParticlesEnabled.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ironGolemParticlesEnabled.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Whether particles will be shown
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_ironGolemParticlesEnabled_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ironGolemParticlesEnabled.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ironGolemParticlesEnabled.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ironGolemParticlesEnabled.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Whether particles will be shown
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_ironGolemParticlesEnabled_6(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ironGolemParticlesEnabled.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ironGolemParticlesEnabled.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ironGolemParticlesEnabled.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Whether particles will be shown
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_ironGolemParticlesEnabled_7(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ironGolemParticlesEnabled.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ironGolemParticlesEnabled.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ironGolemParticlesEnabled.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* How long it takes until the golem checks where his home is
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_ironGolemHomeCheck_8(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ironGolemHomeCheck.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ironGolemHomeCheck.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ironGolemHomeCheck.nextInt(i);
			return rand.nextInt(i);
		}
	}


}