package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.gui.GuiCreateWorld.class)
public class MixinGuiCreateWorld{

	/**
	* Sets the world seed if nothing was put in
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_chooseRandomSeed_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.chooseRandomSeed.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.chooseRandomSeed.nextLong();
		} else {
				com.minecrafttas.killtherng.KillTheRNG.clientRandom.chooseRandomSeed.nextLong();
				return rand.nextLong();
		}
	}


}