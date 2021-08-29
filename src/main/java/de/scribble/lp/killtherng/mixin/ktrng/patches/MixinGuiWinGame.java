package de.scribble.lp.killtherng.mixin.ktrng.patches;

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
	@Redirect(method = "drawScreen(IIF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1467_1(Random rand, long seed) {
		KillTheRNG.randomness.random_1467.setSeed(seed, true);
		rand.setSeed(seed);
	}

	/**
	* null
	*/
	@Redirect(method = "initGui()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1466_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1466.nextInt(i);
//		KillTheRNG.randomness.random_1466.nextInt(i);
//		return rand.nextInt(i);
	}

}
