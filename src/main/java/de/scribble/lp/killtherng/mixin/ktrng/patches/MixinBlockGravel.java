package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockGravel;

@Mixin(BlockGravel.class)
public class MixinBlockGravel {

	/**
	* null
	*/
	@Redirect(method = "getItemDropped(Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;I)Lnet/minecraft/item/Item;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_317_1(Random rand, int i) {
		return KillTheRNG.randomness.random_317.nextInt(i);
//		KillTheRNG.randomness.random_317.nextInt(i);
//		return rand.nextInt(i);
	}

}
