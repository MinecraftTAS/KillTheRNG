package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.player.EntityPlayer;

@Mixin(EntityPlayer.class)
public class MixinEntityPlayer {

	/**
	* Motion of the items when player dies
	*/
	@Redirect(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_playerDropAroundWhenDyingMotion_1(Random rand) {
		return KillTheRNG.randomness.playerDropAroundWhenDyingMotion.nextFloat();
//		KillTheRNG.randomness.playerDropAroundWhenDyingMotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Motion of the items when player dies
	*/
	@Redirect(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_playerDropAroundWhenDyingMotion_2(Random rand) {
		return KillTheRNG.randomness.playerDropAroundWhenDyingMotion.nextFloat();
//		KillTheRNG.randomness.playerDropAroundWhenDyingMotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Motion of the items when player dies
	*/
	@Redirect(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_playerDropAroundWhenDyingMotion_3(Random rand) {
		return KillTheRNG.randomness.playerDropAroundWhenDyingMotion.nextFloat();
//		KillTheRNG.randomness.playerDropAroundWhenDyingMotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Motion of the items when dropped
	*/
	@Redirect(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_playerDropItemMotion_4(Random rand) {
		return KillTheRNG.randomness.playerDropItemMotion.nextFloat();
//		KillTheRNG.randomness.playerDropItemMotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Motion of the items when dropped
	*/
	@Redirect(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_playerDropItemMotion_5(Random rand) {
		return KillTheRNG.randomness.playerDropItemMotion.nextFloat();
//		KillTheRNG.randomness.playerDropItemMotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Motion of the items when dropped
	*/
	@Redirect(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_playerDropItemMotion_6(Random rand) {
		return KillTheRNG.randomness.playerDropItemMotion.nextFloat();
//		KillTheRNG.randomness.playerDropItemMotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Setting xp seed when no xp seed was found in the nbt
	*/
	@Redirect(method = "readEntityFromNBT(Lnet/minecraft/nbt/NBTTagCompound;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	public int redirect_playerReadXpSeed_7(Random rand) {
		return KillTheRNG.randomness.playerReadXpSeed.nextInt();
//		KillTheRNG.randomness.playerReadXpSeed.nextInt();
//		return rand.nextInt();
	}

	/**
	* If the shield cooldown should be applied
	*/
	@Redirect(method = "damageShield(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_playerShieldCooldown_8(Random rand) {
		return KillTheRNG.randomness.playerShieldCooldown.nextFloat();
//		KillTheRNG.randomness.playerShieldCooldown.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of the sound when disabling a shield
	*/
	@Redirect(method = "disableShield(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_playerShieldDisablePitch_9(Random rand) {
		return KillTheRNG.randomness.playerShieldDisablePitch.nextFloat();
//		KillTheRNG.randomness.playerShieldDisablePitch.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* What the next xp seed is
	*/
	@Redirect(method = "onEnchant(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	public int redirect_playerNextXpSeed_10(Random rand) {
		return KillTheRNG.randomness.playerNextXpSeed.nextInt();
//		KillTheRNG.randomness.playerNextXpSeed.nextInt();
//		return rand.nextInt();
	}

}
