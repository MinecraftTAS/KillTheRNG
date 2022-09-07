package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.gui.GuiCustomizeWorldScreen;

@Mixin(GuiCustomizeWorldScreen.class)
public class MixinGuiCustomizeWorldScreen {

	/**
	* Random position of sliders in customize world screen when clicking randomize
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_customizeWorldGuiSliderPosition_1(Random rand) {
		return KillTheRNG.randomness.customizeWorldGuiSliderPosition.nextFloat();
//		KillTheRNG.randomness.customizeWorldGuiSliderPosition.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Random position of sliders in customize world screen when clicking randomize
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_customizeWorldGuiSliderPosition_2(Random rand) {
		return KillTheRNG.randomness.customizeWorldGuiSliderPosition.nextFloat();
//		KillTheRNG.randomness.customizeWorldGuiSliderPosition.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Random position of sliders in customize world screen when clicking randomize
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_customizeWorldGuiSliderPosition_3(Random rand) {
		return KillTheRNG.randomness.customizeWorldGuiSliderPosition.nextBoolean();
//		KillTheRNG.randomness.customizeWorldGuiSliderPosition.nextBoolean();
//		return rand.nextBoolean();
	}

	/**
	* Random position of sliders in customize world screen when clicking randomize
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_customizeWorldGuiSliderPosition_4(Random rand) {
		return KillTheRNG.randomness.customizeWorldGuiSliderPosition.nextFloat();
//		KillTheRNG.randomness.customizeWorldGuiSliderPosition.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Random position of sliders in customize world screen when clicking randomize
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_customizeWorldGuiSliderPosition_5(Random rand) {
		return KillTheRNG.randomness.customizeWorldGuiSliderPosition.nextFloat();
//		KillTheRNG.randomness.customizeWorldGuiSliderPosition.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Random position of sliders in customize world screen when clicking randomize
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_customizeWorldGuiSliderPosition_6(Random rand) {
		return KillTheRNG.randomness.customizeWorldGuiSliderPosition.nextBoolean();
//		KillTheRNG.randomness.customizeWorldGuiSliderPosition.nextBoolean();
//		return rand.nextBoolean();
	}

}
