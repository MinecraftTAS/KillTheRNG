package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockRedstoneWire.class)
public class MixinBlockRedstoneWire{

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_397_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_397.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_397.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_397.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_398_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_398.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_398.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_398.nextFloat();
			return rand.nextFloat();
		}
	}


}