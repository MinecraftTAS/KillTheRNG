package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockSapling;

@Mixin(BlockSapling.class)
public class MixinBlockSapling {

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_235_0(Random rand, int i) {
		return KillTheRNG.randomness.random_235.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generateTree(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_236_0(Random rand, int i) {
		return KillTheRNG.randomness.random_236.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generateTree(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_random_237_1(Random rand) {
		return KillTheRNG.randomness.random_237.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "generateTree(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_238_2(Random rand, int i) {
		return KillTheRNG.randomness.random_238.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "canUseBonemeal(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_239_0(Random rand) {
		return KillTheRNG.randomness.random_239.nextFloat();
	}

}
