package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraftforge.client.GuiIngameForge.class)
public class MixinGuiIngameForge{

	/**
	* Pattern of hearts shaking in forge's GuiIngame
	*/
	@Redirect(method = "renderFood(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	public int redirect_forgeGuiIngameShakeHunger_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.forgeGuiIngameShakeHunger.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.forgeGuiIngameShakeHunger.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.forgeGuiIngameShakeHunger.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Sets the random seed of forge's GuiIngame
	*/
	@Redirect(method = "renderGameOverlay(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_forgeGuiIngameSetRandomSeed_2(Random rand, long seed) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.forgeGuiIngameSetRandomSeed.isEnabled()) {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.forgeGuiIngameSetRandomSeed.setSeed(seed, true);		} else {
			rand.setSeed(seed);
		}
	}

	/**
	* Sets the random seed of forge's GuiIngame Health Bar
	*/
	@Redirect(method = "renderHealth(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0), remap = false)
	public void redirect_forgeGuiIngameHealthSetRandomSeed_3(Random rand, long seed) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.forgeGuiIngameHealthSetRandomSeed.isEnabled()) {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.forgeGuiIngameHealthSetRandomSeed.setSeed(seed, true);		} else {
			rand.setSeed(seed);
		}
	}

	/**
	* Pattern of hearts shaking in forge's GuiIngame
	*/
	@Redirect(method = "renderHealth(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	public int redirect_forgeGuiIngameShakeHearts_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.forgeGuiIngameShakeHearts.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.forgeGuiIngameShakeHearts.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.forgeGuiIngameShakeHearts.nextInt(i);
			return rand.nextInt(i);
		}
	}


}