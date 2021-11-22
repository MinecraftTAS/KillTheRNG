package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockNewLeaf;

@Mixin(BlockNewLeaf.class)
public class MixinBlockNewLeaf {

	/**
	* null
	*/
	@Redirect(method = "dropApple(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_530_1(Random rand, int i) {
		return KillTheRNG.randomness.random_530.nextInt(i);
//		KillTheRNG.randomness.random_530.nextInt(i);
//		return rand.nextInt(i);
	}

}
