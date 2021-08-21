package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockDoublePlant;

@Mixin(BlockDoublePlant.class)
public class MixinBlockDoublePlant {

	/**
	* null
	*/
	@Redirect(method = "getItemDropped(Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;I)Lnet/minecraft/item/Item;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_216_1(Random rand, int i) {
		return KillTheRNG.randomness.random_216.nextInt(i);
//		KillTheRNG.randomness.random_216.nextInt(i);
//		return rand.nextInt(i);
	}

}
