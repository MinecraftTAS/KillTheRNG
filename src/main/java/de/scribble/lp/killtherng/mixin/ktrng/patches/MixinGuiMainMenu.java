package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.gui.GuiMainMenu;

@Mixin(GuiMainMenu.class)
public class MixinGuiMainMenu {

	/**
	* Random splash text in the title screen
	*/
	@Redirect(method = "<init>()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_splashTextIndex_1(Random rand, int i) {
		return KillTheRNG.randomness.splashTextIndex.nextInt(i);
//		KillTheRNG.randomness.splashTextIndex.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Chance for 'Minceraft' to appear in the Title Screen
	*/
	@Redirect(method = "<init>()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_minceraftRandom_2(Random rand) {
		return KillTheRNG.randomness.minceraftRandom.nextFloat();
//		KillTheRNG.randomness.minceraftRandom.nextFloat();
//		return rand.nextFloat();
	}

}
