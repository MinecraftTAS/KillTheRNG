package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityOcelot;

@Mixin(EntityOcelot.class)
public class MixinEntityOcelot {

	/**
	* If the cat purrs or does an ambient sound
	*/
	@Redirect(method = "getAmbientSound()Lnet/minecraft/util/SoundEvent;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_ocelotMeowOrAmbientSound_1(Random rand, int i) {
		return KillTheRNG.randomness.ocelotMeowOrAmbientSound.nextInt(i);
//		KillTheRNG.randomness.ocelotMeowOrAmbientSound.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* If taming is successful
	*/
	@Redirect(method = "processInteract(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_ocelotTamingChance_2(Random rand, int i) {
		return KillTheRNG.randomness.ocelotTamingChance.nextInt(i);
//		KillTheRNG.randomness.ocelotTamingChance.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* If taming is successful
	*/
	@Redirect(method = "processInteract(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_ocelotTamingChance_3(Random rand, int i) {
		return KillTheRNG.randomness.ocelotTamingChance.nextInt(i);
//		KillTheRNG.randomness.ocelotTamingChance.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_977_4(Random rand, int i) {
		return KillTheRNG.randomness.random_977.nextInt(i);
//		KillTheRNG.randomness.random_977.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_978_5(Random rand, int i) {
		return KillTheRNG.randomness.random_978.nextInt(i);
//		KillTheRNG.randomness.random_978.nextInt(i);
//		return rand.nextInt(i);
	}

}
