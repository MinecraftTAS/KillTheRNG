package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockDoublePlant.class)
public class MixinBlockDoublePlant{

	/**
	* If a seed is dropped from a double grass
	*/
	@Redirect(method = "getItemDropped(Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;I)Lnet/minecraft/item/Item;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_seedFromDoublePlant_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.seedFromDoublePlant.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.seedFromDoublePlant.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.seedFromDoublePlant.nextInt(i);
			return rand.nextInt(i);
		}
	}


}