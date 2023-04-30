package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.projectile.EntityTippedArrow.class)
public class MixinEntityTippedArrow{

	/**
	* Position of potion particle on a tipped arrow
	*/
	@Redirect(method = "spawnPotionParticles(I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_tippedArrowParticle_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.tippedArrowParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.tippedArrowParticle.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.tippedArrowParticle.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of potion particle on a tipped arrow
	*/
	@Redirect(method = "spawnPotionParticles(I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_tippedArrowParticle_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.tippedArrowParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.tippedArrowParticle.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.tippedArrowParticle.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of potion particle on a tipped arrow
	*/
	@Redirect(method = "spawnPotionParticles(I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_tippedArrowParticle_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.tippedArrowParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.tippedArrowParticle.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.tippedArrowParticle.nextDouble();
			return rand.nextDouble();
		}
	}


}