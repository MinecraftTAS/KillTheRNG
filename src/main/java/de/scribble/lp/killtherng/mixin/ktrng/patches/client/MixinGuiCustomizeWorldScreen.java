package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.gui.GuiCustomizeWorldScreen.class)
public class MixinGuiCustomizeWorldScreen{

	/**
	* Random position of sliders in customize world screen when clicking randomize
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_customizeWorldGuiSliderPos_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.customizeWorldGuiSliderPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.customizeWorldGuiSliderPos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.customizeWorldGuiSliderPos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Random position of sliders in customize world screen when clicking randomize
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_customizeWorldGuiSliderPos_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.customizeWorldGuiSliderPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.customizeWorldGuiSliderPos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.customizeWorldGuiSliderPos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Random position of sliders in customize world screen when clicking randomize
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_customizeWorldGuiSliderPos_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.customizeWorldGuiSliderPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.customizeWorldGuiSliderPos.nextBoolean();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.customizeWorldGuiSliderPos.nextBoolean();
			return rand.nextBoolean();
		}
	}

	/**
	* Random position of sliders in customize world screen when clicking randomize
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_customizeWorldGuiSliderPos_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.customizeWorldGuiSliderPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.customizeWorldGuiSliderPos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.customizeWorldGuiSliderPos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Random position of sliders in customize world screen when clicking randomize
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_customizeWorldGuiSliderPos_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.customizeWorldGuiSliderPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.customizeWorldGuiSliderPos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.customizeWorldGuiSliderPos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Random position of sliders in customize world screen when clicking randomize
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_customizeWorldGuiSliderPos_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.customizeWorldGuiSliderPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.customizeWorldGuiSliderPos.nextBoolean();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.customizeWorldGuiSliderPos.nextBoolean();
			return rand.nextBoolean();
		}
	}


}