package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockPotato.class)
public class MixinBlockPotato{

	/**
	* null
	*/
	@Redirect(method = "getDrops(Lnet/minecraft/util/NonNullList;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	public int redirect_random_511_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_511.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_511.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_511.nextInt(i);
			return rand.nextInt(i);
		}
	}


}