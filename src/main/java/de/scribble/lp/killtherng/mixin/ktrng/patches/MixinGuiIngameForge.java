package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraftforge.client.GuiIngameForge;

@Mixin(GuiIngameForge.class)
public class MixinGuiIngameForge {

	/**
	* Sets the random seed of forge's GuiIngame
	*/
	@Redirect(method = "renderGameOverlay(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_forgeGuiIngameSetRandomSeed_1(Random rand, long seed) {
		KillTheRNG.randomness.forgeGuiIngameSetRandomSeed.setSeed(seed, true);
		rand.setSeed(seed);
	}

	/**
	* Sets the random seed of forge's GuiIngame Health Bar
	*/
	@Redirect(method = "renderHealth(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0), remap=false)
	public void redirect_forgeGuiIngameHealthSetRandomSeed_2(Random rand, long seed) {
		KillTheRNG.randomness.forgeGuiIngameHealthSetRandomSeed.setSeed(seed, true);
		rand.setSeed(seed);
	}

	/**
	* Pattern of hearts shaking in forge's GuiIngame
	*/
	@Redirect(method = "renderHealth(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap=false)
	public int redirect_forgeGuiIngameShakeHearts_3(Random rand, int i) {
//		return KillTheRNG.randomness.forgeGuiIngameShakeHearts.nextInt(i);
		KillTheRNG.randomness.forgeGuiIngameShakeHearts.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Pattern of hearts shaking in forge's GuiIngame
	*/
	@Redirect(method = "renderFood(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap=false)
	public int redirect_forgeGuiIngameShakeHunger_4(Random rand, int i) {
//		return KillTheRNG.randomness.forgeGuiIngameShakeHunger.nextInt(i);
		KillTheRNG.randomness.forgeGuiIngameShakeHunger.nextInt(i);
		return rand.nextInt(i);
	}

}
