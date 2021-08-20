package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.gui.GuiIngame;

@Mixin(GuiIngame.class)
public class MixinGuiIngame {

	/**
	* null
	*/
	@Redirect(method = "renderPlayerStats(Lnet/minecraft/client/gui/ScaledResolution;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_17_0(Random rand, long unused) {
	}

	/**
	* null
	*/
	@Redirect(method = "renderPlayerStats(Lnet/minecraft/client/gui/ScaledResolution;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_18_1(Random rand, int i) {
		return KillTheRNG.randomness.random_18.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "renderPlayerStats(Lnet/minecraft/client/gui/ScaledResolution;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_19_2(Random rand, int i) {
		return KillTheRNG.randomness.random_19.nextInt(i);
	}

}
