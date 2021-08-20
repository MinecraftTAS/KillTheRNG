package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.gui.GuiEnchantment;

@Mixin(GuiEnchantment.class)
public class MixinGuiEnchantment {

	/**
	* null
	*/
	@Redirect(method = "tickBook()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1946_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1946.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "tickBook()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1947_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1947.nextInt(i);
	}

}
