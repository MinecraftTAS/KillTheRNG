package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockOldLeaf.class)
public class MixinBlockOldLeaf{

	/**
	* Chance of dropping on apple on leaf break
	*/
	@Redirect(method = "dropApple(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_leafDropApple_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.leafDropApple.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.leafDropApple.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.leafDropApple.nextInt(i);
			return rand.nextInt(i);
		}
	}


}