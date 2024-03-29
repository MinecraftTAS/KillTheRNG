package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.player.EntityPlayer.class)
public class MixinEntityPlayer{

	/**
	* If the shield cooldown should be applied
	*/
	@Redirect(method = "damageShield(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_playerShieldCooldown_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerShieldCooldown.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerShieldCooldown.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerShieldCooldown.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of the sound when disabling a shield
	*/
	@Redirect(method = "disableShield(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_playerShieldDisablePitch_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerShieldDisablePitch.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerShieldDisablePitch.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerShieldDisablePitch.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Motion of the items when player dies
	*/
	@Redirect(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_playerDropAroundWhenDyingMotion_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerDropAroundWhenDyingMotion.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerDropAroundWhenDyingMotion.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerDropAroundWhenDyingMotion.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Motion of the items when player dies
	*/
	@Redirect(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_playerDropAroundWhenDyingMotion_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerDropAroundWhenDyingMotion.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerDropAroundWhenDyingMotion.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerDropAroundWhenDyingMotion.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Motion of the items when player dies
	*/
	@Redirect(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_playerDropAroundWhenDyingMotion_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerDropAroundWhenDyingMotion.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerDropAroundWhenDyingMotion.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerDropAroundWhenDyingMotion.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Motion of the items when dropped
	*/
	@Redirect(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_playerDropItemMotion_6(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerDropItemMotion.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerDropItemMotion.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerDropItemMotion.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Motion of the items when dropped
	*/
	@Redirect(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_playerDropItemMotion_7(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerDropItemMotion.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerDropItemMotion.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerDropItemMotion.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Motion of the items when dropped
	*/
	@Redirect(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_playerDropItemMotion_8(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerDropItemMotion.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerDropItemMotion.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerDropItemMotion.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* What the next xp seed is
	*/
	@Redirect(method = "onEnchant(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	public int redirect_playerNextXpSeed_9(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerNextXpSeed.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerNextXpSeed.nextInt();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerNextXpSeed.nextInt();
			return rand.nextInt();
		}
	}

	/**
	* Setting xp seed when no xp seed was found in the nbt
	*/
	@Redirect(method = "readEntityFromNBT(Lnet/minecraft/nbt/NBTTagCompound;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	public int redirect_playerReadXpSeed_10(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerReadXpSeed.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerReadXpSeed.nextInt();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.playerReadXpSeed.nextInt();
			return rand.nextInt();
		}
	}


}