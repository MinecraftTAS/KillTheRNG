package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.gui.GuiIngame;

@Mixin(GuiIngame.class)
public class MixinGuiIngame {
	@Redirect(method = "renderPlayerStats(Lnet/minecraft/client/gui/ScaledResolution;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_17(Random rand, long unused) {
	}

	@Redirect(method = "renderPlayerStats(Lnet/minecraft/client/gui/ScaledResolution;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_18(Random rand, int i) {
		return KillTheRNG.randomness.random_18.nextInt(i);
	}

	@Redirect(method = "renderPlayerStats(Lnet/minecraft/client/gui/ScaledResolution;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_19(Random rand, int i) {
		return KillTheRNG.randomness.random_19.nextInt(i);
	}

}
