package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.ai.EntityAIFleeSun.class)
public class MixinEntityAIFleeSun{

	/**
	* Looks 10 times around the entity randomly for a shelter
	*/
	@Redirect(method = "findPossibleShelter()Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiFleeSun_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiFleeSun.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiFleeSun.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiFleeSun.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Looks 10 times around the entity randomly for a shelter
	*/
	@Redirect(method = "findPossibleShelter()Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_aiFleeSun_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiFleeSun.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiFleeSun.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiFleeSun.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Looks 10 times around the entity randomly for a shelter
	*/
	@Redirect(method = "findPossibleShelter()Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_aiFleeSun_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiFleeSun.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiFleeSun.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiFleeSun.nextInt(i);
			return rand.nextInt(i);
		}
	}


}