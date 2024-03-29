package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.EntityLivingBase.class)
public class MixinEntityLivingBase{

	/**
	* Pitch of the death sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_entityDeathSound_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.entityDeathSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.entityDeathSound.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.entityDeathSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of the death sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_entityDeathSound_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.entityDeathSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.entityDeathSound.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.entityDeathSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of the shield break sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_entityShieldBreakSound_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.entityShieldBreakSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.entityShieldBreakSound.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.entityShieldBreakSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of the shield block sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_entityShieldBlockSound_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.entityShieldBlockSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.entityShieldBlockSound.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.entityShieldBlockSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of the thorns hit sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_entityThornsSound_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.entityThornsSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.entityThornsSound.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.entityThornsSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of the thorns hit sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_entityThornsSound_6(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.entityThornsSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.entityThornsSound.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.entityThornsSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of the hurt sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_entityHurtSound_7(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.entityHurtSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.entityHurtSound.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.entityHurtSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of the hurt sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_entityHurtSound_8(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.entityHurtSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.entityHurtSound.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.entityHurtSound.nextFloat();
			return rand.nextFloat();
		}
	}


}