package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.projectile.EntityEgg.class)
public class MixinEntityEgg{

	/**
	* Motion of egg crack particles
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_eggCrackParticle_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.eggCrackParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.eggCrackParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.eggCrackParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Motion of egg crack particles
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_eggCrackParticle_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.eggCrackParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.eggCrackParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.eggCrackParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Motion of egg crack particles
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_eggCrackParticle_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.eggCrackParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.eggCrackParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.eggCrackParticle.nextFloat();
			return rand.nextFloat();
		}
	}


}