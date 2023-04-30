package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.tileentity.TileEntityEnderChest.class)
public class MixinTileEntityEnderChest{

	/**
	* null
	*/
	@Redirect(method = "update()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_508_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_508.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_508.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_508.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "update()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_509_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_509.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_509.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_509.nextFloat();
			return rand.nextFloat();
		}
	}


}