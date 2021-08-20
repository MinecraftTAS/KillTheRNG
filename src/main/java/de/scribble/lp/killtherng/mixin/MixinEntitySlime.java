package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntitySlime;

@Mixin(EntitySlime.class)
public class MixinEntitySlime {

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_836_0(Random rand) {
		return KillTheRNG.randomness.random_836.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_837_1(Random rand) {
		return KillTheRNG.randomness.random_837.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_838_2(Random rand) {
		return KillTheRNG.randomness.random_838.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_839_3(Random rand) {
		return KillTheRNG.randomness.random_839.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "getJumpDelay()I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_840_0(Random rand, int i) {
		return KillTheRNG.randomness.random_840.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "notifyDataManagerChange(Lnet/minecraft/network/datasync/DataParameter;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_841_0(Random rand, int i) {
		return KillTheRNG.randomness.random_841.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "setDead()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_842_0(Random rand, int i) {
		return KillTheRNG.randomness.random_842.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "setDead()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_843_1(Random rand) {
		return KillTheRNG.randomness.random_843.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "dealDamage(Lnet/minecraft/entity/EntityLivingBase;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_844_0(Random rand) {
		return KillTheRNG.randomness.random_844.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "dealDamage(Lnet/minecraft/entity/EntityLivingBase;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_845_1(Random rand) {
		return KillTheRNG.randomness.random_845.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_846_0(Random rand) {
		return KillTheRNG.randomness.random_846.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_847_1(Random rand) {
		return KillTheRNG.randomness.random_847.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_848_2(Random rand, int i) {
		return KillTheRNG.randomness.random_848.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_849_3(Random rand, int i) {
		return KillTheRNG.randomness.random_849.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_850_4(Random rand, int i) {
		return KillTheRNG.randomness.random_850.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_851_0(Random rand, int i) {
		return KillTheRNG.randomness.random_851.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_852_1(Random rand) {
		return KillTheRNG.randomness.random_852.nextFloat();
	}

}
