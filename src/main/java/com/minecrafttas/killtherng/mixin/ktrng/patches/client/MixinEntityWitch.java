package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.monster.EntityWitch.class)
public class MixinEntityWitch{

	/**
	* Quantity and position of which particles
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_witchParticle_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.witchParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.witchParticle.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.witchParticle.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Quantity and position of which particles
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_witchParticle_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.witchParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.witchParticle.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.witchParticle.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Quantity and position of which particles
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_witchParticle_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.witchParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.witchParticle.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.witchParticle.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Quantity and position of which particles
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_witchParticle_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.witchParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.witchParticle.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.witchParticle.nextGaussian();
			return rand.nextGaussian();
		}
	}


}