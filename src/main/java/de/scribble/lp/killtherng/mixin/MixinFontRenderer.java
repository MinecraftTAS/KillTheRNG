package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.gui.FontRenderer;

@Mixin(FontRenderer.class)
public class MixinFontRenderer {

	/**
	* null
	*/
	@Redirect(method = "renderStringAtPos(Ljava/lang/String;Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1265_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1265.nextInt(i);
	}

}
