package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.passive.EntityChicken.class)
public class MixinEntityChicken{

	/**
	* Time until the chicken lays its first egg
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_chickenLaysFirstEgg_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.chickenLaysFirstEgg.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.chickenLaysFirstEgg.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.chickenLaysFirstEgg.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Pitch of chicken laying an egg
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_chickenEggSound_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.chickenEggSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.chickenEggSound.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.chickenEggSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of chicken laying an egg
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_chickenEggSound_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.chickenEggSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.chickenEggSound.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.chickenEggSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of chicken laying an egg
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_chickenEggSound_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.chickenEggSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.chickenEggSound.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.chickenEggSound.nextInt(i);
			return rand.nextInt(i);
		}
	}


}