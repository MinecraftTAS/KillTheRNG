package de.scribble.lp.killtherng.mixin.ktrng.patches;

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
	public float redirect_random_1474_1(Random rand) {
		return KillTheRNG.randomness.random_1474.nextFloat();
//		KillTheRNG.randomness.random_1474.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1475_2(Random rand) {
		return KillTheRNG.randomness.random_1475.nextFloat();
//		KillTheRNG.randomness.random_1475.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_random_1476_3(Random rand) {
		return KillTheRNG.randomness.random_1476.nextBoolean();
//		KillTheRNG.randomness.random_1476.nextBoolean();
//		return rand.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1477_4(Random rand) {
		return KillTheRNG.randomness.random_1477.nextFloat();
//		KillTheRNG.randomness.random_1477.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1478_5(Random rand) {
		return KillTheRNG.randomness.random_1478.nextFloat();
//		KillTheRNG.randomness.random_1478.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "actionPerformed(Lnet/minecraft/client/gui/GuiButton;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_random_1479_6(Random rand) {
		return KillTheRNG.randomness.random_1479.nextBoolean();
//		KillTheRNG.randomness.random_1479.nextBoolean();
//		return rand.nextBoolean();
	}

}
