package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.item.EntityExpBottle.class)
public class MixinEntityExpBottle{

	/**
	* null
	*/
	@Redirect(method = "onImpact(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_657_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_657.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_657.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_657.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "onImpact(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_658_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_658.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_658.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_658.nextInt(i);
			return rand.nextInt(i);
		}
	}


}