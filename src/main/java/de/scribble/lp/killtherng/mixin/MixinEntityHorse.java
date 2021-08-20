package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityHorse;

@Mixin(EntityHorse.class)
public class MixinEntityHorse {

	/**
	* null
	*/
	@Redirect(method = "playGallopSound(Lnet/minecraft/block/SoundType;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_153_0(Random rand, int i) {
		return KillTheRNG.randomness.random_153.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createChild(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/EntityAgeable;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_154_0(Random rand, int i) {
		return KillTheRNG.randomness.random_154.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createChild(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/EntityAgeable;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_155_1(Random rand, int i) {
		return KillTheRNG.randomness.random_155.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createChild(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/EntityAgeable;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_156_2(Random rand, int i) {
		return KillTheRNG.randomness.random_156.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createChild(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/EntityAgeable;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_157_3(Random rand, int i) {
		return KillTheRNG.randomness.random_157.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_158_0(Random rand, int i) {
		return KillTheRNG.randomness.random_158.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_159_1(Random rand, int i) {
		return KillTheRNG.randomness.random_159.nextInt(i);
	}

}
