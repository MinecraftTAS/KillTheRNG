package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.gui.GuiEnchantment;

@Mixin(GuiEnchantment.class)
public class MixinGuiEnchantment {

	/**
	* Time when the Book in an Enchantment Gui should flip
	*/
	@Redirect(method = "tickBook()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_flipBookEnchant_1(Random rand, int i) {
		return KillTheRNG.randomness.flipBookEnchant.nextInt(i);
//		KillTheRNG.randomness.flipBookEnchant.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Time when the Book in an Enchantment Gui should flip
	*/
	@Redirect(method = "tickBook()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_flipBookEnchant_2(Random rand, int i) {
		return KillTheRNG.randomness.flipBookEnchant.nextInt(i);
//		KillTheRNG.randomness.flipBookEnchant.nextInt(i);
//		return rand.nextInt(i);
	}

}
