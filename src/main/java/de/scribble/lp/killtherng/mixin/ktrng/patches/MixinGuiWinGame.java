package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.gui.GuiWinGame.class)
public class MixinGuiWinGame{

	/**
	* Set's the fontrandom seed in GuiWinGame
	*/
	@Redirect(method = "drawScreen(IIF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_fontRandomSetSeed_1(Random rand, long seed) {
		de.scribble.lp.killtherng.KillTheRNG.randomness.fontRandomSetSeed.setSeed(seed, true);		rand.setSeed(seed);
	}

	/**
	* The randomness of the obfuscation
	*/
	@Redirect(method = "initGui()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_fontRandomObfuscation_2(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.fontRandomObfuscation.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.fontRandomObfuscation.nextInt(i);
		return rand.nextInt(i);
	}


}