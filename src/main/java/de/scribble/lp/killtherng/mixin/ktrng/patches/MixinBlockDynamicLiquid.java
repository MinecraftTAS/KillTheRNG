package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockDynamicLiquid.class)
public class MixinBlockDynamicLiquid{

	/**
	* If lava should spread
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_lavaFlow_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.lavaFlow.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.lavaFlow.nextInt(i);
//		return rand.nextInt(i);
	}


}