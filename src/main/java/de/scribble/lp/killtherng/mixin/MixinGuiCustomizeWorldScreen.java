package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.gui.GuiCustomizeWorldScreen;

@Mixin(GuiCustomizeWorldScreen.class)
public class MixinGuiCustomizeWorldScreen {

	/**
	* null
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1474_0(Random rand) {
		return KillTheRNG.randomness.random_1474.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1475_1(Random rand) {
		return KillTheRNG.randomness.random_1475.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 2))
	public boolean redirect_random_1476_2(Random rand) {
		return KillTheRNG.randomness.random_1476.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1477_3(Random rand) {
		return KillTheRNG.randomness.random_1477.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_1478_4(Random rand) {
		return KillTheRNG.randomness.random_1478.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 5))
	public boolean redirect_random_1479_5(Random rand) {
		return KillTheRNG.randomness.random_1479.nextBoolean();
	}

}
