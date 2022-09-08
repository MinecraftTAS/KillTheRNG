package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockGlowstone.class)
public class MixinBlockGlowstone{

	/**
	* Quantity of glowstone drop
	*/
	@Redirect(method = "quantityDropped(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_glowstoneDrop_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneDrop.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneDrop.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneDrop.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Quantity of bonus glowstone drop
	*/
	@Redirect(method = "quantityDroppedWithBonus(ILjava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_bonusGlowstoneDrop_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.bonusGlowstoneDrop.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.bonusGlowstoneDrop.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.bonusGlowstoneDrop.nextInt(i);
			return rand.nextInt(i);
		}
	}


}