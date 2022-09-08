package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockOre.class)
public class MixinBlockOre{

	/**
	* How much lapis you get
	*/
	@Redirect(method = "quantityDropped(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_oreLapisAmount_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.oreLapisAmount.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.oreLapisAmount.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.oreLapisAmount.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* How much extra ore drop you get with fortune
	*/
	@Redirect(method = "quantityDroppedWithBonus(ILjava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_oreFortuneBonus_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.oreFortuneBonus.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.oreFortuneBonus.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.oreFortuneBonus.nextInt(i);
			return rand.nextInt(i);
		}
	}


}