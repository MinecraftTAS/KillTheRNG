package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockStem.class)
public class MixinBlockStem{

	/**
	* null
	*/
	@Redirect(method = "getDrops(Lnet/minecraft/util/NonNullList;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	public int redirect_random_461_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_461.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_461.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_461.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_460_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_460.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_460.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_460.nextInt(i);
			return rand.nextInt(i);
		}
	}


}