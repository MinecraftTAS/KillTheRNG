package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockPistonBase;

@Mixin(BlockPistonBase.class)
public class MixinBlockPistonBase {

	/**
	* null
	*/
	@Redirect(method = "eventReceived(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_343_1(Random rand) {
		return KillTheRNG.randomness.random_343.nextFloat();
//		KillTheRNG.randomness.random_343.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "eventReceived(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_344_2(Random rand) {
		return KillTheRNG.randomness.random_344.nextFloat();
//		KillTheRNG.randomness.random_344.nextFloat();
//		return rand.nextFloat();
	}

}
