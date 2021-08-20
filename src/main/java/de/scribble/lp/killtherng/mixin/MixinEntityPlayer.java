package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.player.EntityPlayer;

@Mixin(EntityPlayer.class)
public class MixinEntityPlayer {

	/**
	* null
	*/
	@Redirect(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_42_0(Random rand) {
		return KillTheRNG.randomness.random_42.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_43_1(Random rand) {
		return KillTheRNG.randomness.random_43.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_44_2(Random rand) {
		return KillTheRNG.randomness.random_44.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_45_3(Random rand) {
		return KillTheRNG.randomness.random_45.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_46_4(Random rand) {
		return KillTheRNG.randomness.random_46.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_47_5(Random rand) {
		return KillTheRNG.randomness.random_47.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "readEntityFromNBT(Lnet/minecraft/nbt/NBTTagCompound;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	public int redirect_random_48_0(Random rand) {
		return KillTheRNG.randomness.random_48.nextInt();
	}

	/**
	* null
	*/
	@Redirect(method = "damageShield(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_49_0(Random rand) {
		return KillTheRNG.randomness.random_49.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "disableShield(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_50_0(Random rand) {
		return KillTheRNG.randomness.random_50.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onEnchant(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	public int redirect_random_51_0(Random rand) {
		return KillTheRNG.randomness.random_51.nextInt();
	}

}
