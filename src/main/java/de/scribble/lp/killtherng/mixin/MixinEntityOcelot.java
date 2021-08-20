package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityOcelot;

@Mixin(EntityOcelot.class)
public class MixinEntityOcelot {

	/**
	* null
	*/
	@Redirect(method = "getAmbientSound()Lnet/minecraft/util/SoundEvent;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_974_0(Random rand, int i) {
		return KillTheRNG.randomness.random_974.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "processInteract(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_975_0(Random rand, int i) {
		return KillTheRNG.randomness.random_975.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "processInteract(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_976_1(Random rand, int i) {
		return KillTheRNG.randomness.random_976.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_977_0(Random rand, int i) {
		return KillTheRNG.randomness.random_977.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_978_0(Random rand, int i) {
		return KillTheRNG.randomness.random_978.nextInt(i);
	}

}
