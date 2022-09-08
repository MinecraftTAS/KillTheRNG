package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockMelon.class)
public class MixinBlockMelon{

	/**
	* Quantity of melon drop
	*/
	@Redirect(method = "quantityDropped(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_melonDrop_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.melonDrop.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.melonDrop.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Quantity of bonus melon drop
	*/
	@Redirect(method = "quantityDroppedWithBonus(ILjava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_bonusMelonDrop_2(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.bonusMelonDrop.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.bonusMelonDrop.nextInt(i);
//		return rand.nextInt(i);
	}


}