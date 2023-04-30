package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.item.ItemShears.class)
public class MixinItemShears{

	/**
	* null
	*/
	@Redirect(method = "itemInteractionForEntity(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_636_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_636.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_636.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_636.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "itemInteractionForEntity(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_637_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_637.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_637.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_637.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "itemInteractionForEntity(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_638_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_638.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_638.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_638.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "itemInteractionForEntity(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_639_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_639.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_639.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_639.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "itemInteractionForEntity(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_640_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_640.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_640.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_640.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "onBlockStartBreak(Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/EntityPlayer;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0), remap = false)
	public float redirect_random_641_6(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_641.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_641.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_641.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "onBlockStartBreak(Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/EntityPlayer;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1), remap = false)
	public float redirect_random_642_7(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_642.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_642.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_642.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "onBlockStartBreak(Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/EntityPlayer;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2), remap = false)
	public float redirect_random_643_8(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_643.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_643.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_643.nextFloat();
			return rand.nextFloat();
		}
	}


}