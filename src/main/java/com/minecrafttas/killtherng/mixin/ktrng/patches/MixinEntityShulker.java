package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.monster.EntityShulker.class)
public class MixinEntityShulker{

	/**
	* Whether the shulker teleports after taking damage
	*/
	@Redirect(method = "attackEntityFrom(Lnet/minecraft/util/DamageSource;F)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_sulkerTeleportOnHealthLoss_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.sulkerTeleportOnHealthLoss.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.sulkerTeleportOnHealthLoss.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.sulkerTeleportOnHealthLoss.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Coordinate to teleport to
	*/
	@Redirect(method = "tryTeleportToNewPosition()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_shulkerTeleportToBlockPos_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.shulkerTeleportToBlockPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.shulkerTeleportToBlockPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.shulkerTeleportToBlockPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Coordinate to teleport to
	*/
	@Redirect(method = "tryTeleportToNewPosition()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_shulkerTeleportToBlockPos_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.shulkerTeleportToBlockPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.shulkerTeleportToBlockPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.shulkerTeleportToBlockPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Coordinate to teleport to
	*/
	@Redirect(method = "tryTeleportToNewPosition()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_shulkerTeleportToBlockPos_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.shulkerTeleportToBlockPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.shulkerTeleportToBlockPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.shulkerTeleportToBlockPos.nextInt(i);
			return rand.nextInt(i);
		}
	}


}