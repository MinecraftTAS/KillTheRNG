package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockMycelium.class)
public class MixinBlockMycelium{

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_466_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_466.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_466.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_466.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_467_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_467.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_467.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_467.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_468_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_468.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_468.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_468.nextInt(i);
			return rand.nextInt(i);
		}
	}


}