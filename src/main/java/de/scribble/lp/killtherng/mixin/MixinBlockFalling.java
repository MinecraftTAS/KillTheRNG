package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockFalling;

@Mixin(BlockFalling.class)
public class MixinBlockFalling {

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_313_0(Random rand, int i) {
		return KillTheRNG.randomness.random_313.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_314_1(Random rand) {
		return KillTheRNG.randomness.random_314.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_315_2(Random rand) {
		return KillTheRNG.randomness.random_315.nextFloat();
	}

}
