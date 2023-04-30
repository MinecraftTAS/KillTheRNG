package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.monster.EntityMob.class)
public class MixinEntityMob{

	/**
	* Whether there will be a cooldown applied when using a shield and getting attacked
	*/
	@Redirect(method = "attackEntityAsMob(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_mobPlayerShieldCooldown_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mobPlayerShieldCooldown.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mobPlayerShieldCooldown.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mobPlayerShieldCooldown.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* If a mob should spawn below a certain light level
	*/
	@Redirect(method = "isValidLightLevel()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_mobSpawningLightLevel_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mobSpawningLightLevel.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mobSpawningLightLevel.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mobSpawningLightLevel.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* If a mob should spawn below a certain light level
	*/
	@Redirect(method = "isValidLightLevel()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_mobSpawningLightLevel_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mobSpawningLightLevel.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mobSpawningLightLevel.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mobSpawningLightLevel.nextInt(i);
			return rand.nextInt(i);
		}
	}


}