package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityLlama;

@Mixin(EntityLlama.class)
public class MixinEntityLlama {

	/**
	* null
	*/
	@Redirect(method = "setRandomStrength()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_995_0(Random rand) {
		return KillTheRNG.randomness.random_995.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "setRandomStrength()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_996_1(Random rand, int i) {
		return KillTheRNG.randomness.random_996.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_997_0(Random rand) {
		return KillTheRNG.randomness.random_997.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_998_1(Random rand) {
		return KillTheRNG.randomness.random_998.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_999_2(Random rand) {
		return KillTheRNG.randomness.random_999.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1000_3(Random rand) {
		return KillTheRNG.randomness.random_1000.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_1001_4(Random rand) {
		return KillTheRNG.randomness.random_1001.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1002_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1002.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "playChestEquipSound()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1003_0(Random rand) {
		return KillTheRNG.randomness.random_1003.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playChestEquipSound()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1004_1(Random rand) {
		return KillTheRNG.randomness.random_1004.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "createChild(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/passive/EntityLlama;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1005_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1005.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createChild(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/passive/EntityLlama;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1006_1(Random rand) {
		return KillTheRNG.randomness.random_1006.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "createChild(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/passive/EntityLlama;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 2))
	public boolean redirect_random_1007_2(Random rand) {
		return KillTheRNG.randomness.random_1007.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "spit(Lnet/minecraft/entity/EntityLivingBase;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1008_0(Random rand) {
		return KillTheRNG.randomness.random_1008.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spit(Lnet/minecraft/entity/EntityLivingBase;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1009_1(Random rand) {
		return KillTheRNG.randomness.random_1009.nextFloat();
	}

}
