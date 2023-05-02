package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.gui.GuiIngame.class)
public class MixinGuiIngame{

	/**
	* Sets the random seed in GuiIngame
	*/
	@Redirect(method = "renderPlayerStats(Lnet/minecraft/client/gui/ScaledResolution;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_guiIngameSetRandomSeed_1(Random rand, long seed) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.guiIngameSetRandomSeed.isEnabled()) {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.guiIngameSetRandomSeed.setSeed(seed, true);		} else {
			rand.setSeed(seed);
		}
	}

	/**
	* Pattern of hearts shaking
	*/
	@Redirect(method = "renderPlayerStats(Lnet/minecraft/client/gui/ScaledResolution;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_guiIngameShakeHearts_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.guiIngameShakeHearts.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.guiIngameShakeHearts.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.guiIngameShakeHearts.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Pattern of hunger bars shaking
	*/
	@Redirect(method = "renderPlayerStats(Lnet/minecraft/client/gui/ScaledResolution;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_guiIngameShakeHunger_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.guiIngameShakeHunger.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.guiIngameShakeHunger.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.guiIngameShakeHunger.nextInt(i);
			return rand.nextInt(i);
		}
	}


}