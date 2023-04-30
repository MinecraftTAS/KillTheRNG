package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraft.entity.monster.EntitySlime$SlimeMoveHelper")
public class MixinEntitySlime$SlimeMoveHelper{

	/**
	* null
	*/
	@Redirect(method = "onUpdateMoveHelper()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_853_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_853.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_853.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_853.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdateMoveHelper()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_854_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_854.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_854.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_854.nextFloat();
			return rand.nextFloat();
		}
	}


}