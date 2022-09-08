package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockPortal.class)
public class MixinBlockPortal{

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_438_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_438.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_438.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_438.nextInt(i);
			return rand.nextInt(i);
		}
	}


}