package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.gui.GuiMainMenu.class)
public class MixinGuiMainMenu{

	/**
	* Random splash text in the title screen
	*/
	@Redirect(method = "<init>()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_splashTextIndex_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.splashTextIndex.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.splashTextIndex.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.splashTextIndex.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Chance for 'Minceraft' to appear in the Title Screen
	*/
	@Redirect(method = "<init>()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_minceraftRandom_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.minceraftRandom.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.minceraftRandom.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.minceraftRandom.nextFloat();
			return rand.nextFloat();
		}
	}


}