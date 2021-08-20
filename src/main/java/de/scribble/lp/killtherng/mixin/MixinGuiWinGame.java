package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.gui.GuiWinGame;

@Mixin(GuiWinGame.class)
public class MixinGuiWinGame {

	/**
	* null
	*/
	@Redirect(method = "initGui()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1466_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1466.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "drawScreen(IIF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1467_0(Random rand, long unused) {
	}

}
