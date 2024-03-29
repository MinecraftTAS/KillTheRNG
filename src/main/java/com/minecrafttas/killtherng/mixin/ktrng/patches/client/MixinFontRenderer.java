package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.gui.FontRenderer.class)
public class MixinFontRenderer{

	/**
	* Chooses a seed for the obfuscated text
	*/
	@Redirect(method = "renderStringAtPos(Ljava/lang/String;Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_fontRendererObfuscation_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.fontRendererObfuscation.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.fontRendererObfuscation.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.fontRendererObfuscation.nextInt(i);
			return rand.nextInt(i);
		}
	}


}