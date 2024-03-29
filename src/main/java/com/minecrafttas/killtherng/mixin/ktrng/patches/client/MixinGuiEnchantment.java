package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.gui.GuiEnchantment.class)
public class MixinGuiEnchantment{

	/**
	* The amount of pages the book should flip
	*/
	@Redirect(method = "tickBook()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_guiEnchantmentFlipBook_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.guiEnchantmentFlipBook.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.guiEnchantmentFlipBook.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.guiEnchantmentFlipBook.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The amount of pages the book should flip
	*/
	@Redirect(method = "tickBook()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_guiEnchantmentFlipBook_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.guiEnchantmentFlipBook.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.guiEnchantmentFlipBook.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.guiEnchantmentFlipBook.nextInt(i);
			return rand.nextInt(i);
		}
	}


}