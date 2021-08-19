package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraftforge.client.GuiIngameForge;

@Mixin(GuiIngameForge.class)
public class MixinGuiIngameForge {
	@Redirect(method = "renderGameOverlay(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_20(Random rand, long unused) {
	}

	@Redirect(method = "renderHealth(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_21(Random rand, long unused) {
	}

	@Redirect(method = "renderHealth(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_22(Random rand, int i) {
		return KillTheRNG.randomness.random_22.nextInt(i);
	}

	@Redirect(method = "renderFood(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_23(Random rand, int i) {
		return KillTheRNG.randomness.random_23.nextInt(i);
	}

}
