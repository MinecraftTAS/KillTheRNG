package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.item.EntityEnderEye.class)
public class MixinEntityEnderEye{

	/**
	* If the ender eye shatters or drops
	*/
	@Redirect(method = "moveTowards(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_enderEyeShatter_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.enderEyeShatter.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.enderEyeShatter.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.enderEyeShatter.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Particle of ender eye
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_enderEyeParticle_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.enderEyeParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.enderEyeParticle.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.enderEyeParticle.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Particle of ender eye
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_enderEyeParticle_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.enderEyeParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.enderEyeParticle.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.enderEyeParticle.nextDouble();
			return rand.nextDouble();
		}
	}


}