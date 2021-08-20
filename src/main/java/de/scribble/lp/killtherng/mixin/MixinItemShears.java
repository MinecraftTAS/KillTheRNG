package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.item.ItemShears;

@Mixin(ItemShears.class)
public class MixinItemShears {

	/**
	* null
	*/
	@Redirect(method = "itemInteractionForEntity(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_636_0(Random rand) {
		return KillTheRNG.randomness.random_636.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "itemInteractionForEntity(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_637_1(Random rand) {
		return KillTheRNG.randomness.random_637.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "itemInteractionForEntity(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_638_2(Random rand) {
		return KillTheRNG.randomness.random_638.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "itemInteractionForEntity(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_639_3(Random rand) {
		return KillTheRNG.randomness.random_639.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "itemInteractionForEntity(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_640_4(Random rand) {
		return KillTheRNG.randomness.random_640.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onBlockStartBreak(Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/EntityPlayer;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_641_0(Random rand) {
		return KillTheRNG.randomness.random_641.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onBlockStartBreak(Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/EntityPlayer;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_642_1(Random rand) {
		return KillTheRNG.randomness.random_642.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onBlockStartBreak(Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/EntityPlayer;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_643_2(Random rand) {
		return KillTheRNG.randomness.random_643.nextFloat();
	}

}
