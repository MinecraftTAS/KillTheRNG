package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.gui.GuiCreateWorld;

@Mixin(GuiCreateWorld.class)
public class MixinGuiCreateWorld {

	/**
	* Sets the world seed if nothing was put in
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_chooseRandomSeed_1(Random rand) {
//		return KillTheRNG.randomness.chooseRandomSeed.nextLong();
		KillTheRNG.randomness.chooseRandomSeed.nextLong();
		return rand.nextLong();
	}

}
