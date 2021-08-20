package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.gui.GuiCreateWorld;

@Mixin(GuiCreateWorld.class)
public class MixinGuiCreateWorld {

	/**
	* null
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_random_1472_0(Random rand) {
		return KillTheRNG.randomness.random_1472.nextLong();
	}

}
