package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.passive.EntityOcelot.class)
public class MixinEntityOcelot{

	/**
	* If the cat purrs or does an ambient sound
	*/
	@Redirect(method = "getAmbientSound()Lnet/minecraft/util/SoundEvent;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_ocelotMeowOrAmbientSound_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ocelotMeowOrAmbientSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ocelotMeowOrAmbientSound.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ocelotMeowOrAmbientSound.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_977_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_977.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_977.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_977.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_978_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_978.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_978.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_978.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* If taming is successful
	*/
	@Redirect(method = "processInteract(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_ocelotTamingChance_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ocelotTamingChance.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ocelotTamingChance.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ocelotTamingChance.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* If taming is successful
	*/
	@Redirect(method = "processInteract(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_ocelotTamingChance_5(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ocelotTamingChance.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ocelotTamingChance.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ocelotTamingChance.nextInt(i);
			return rand.nextInt(i);
		}
	}


}