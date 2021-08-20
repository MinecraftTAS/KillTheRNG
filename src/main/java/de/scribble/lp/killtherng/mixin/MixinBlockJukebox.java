package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockJukebox;

@Mixin(BlockJukebox.class)
public class MixinBlockJukebox {

	/**
	* null
	*/
	@Redirect(method = "dropRecord(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_418_0(Random rand) {
		return KillTheRNG.randomness.random_418.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "dropRecord(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_419_1(Random rand) {
		return KillTheRNG.randomness.random_419.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "dropRecord(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_420_2(Random rand) {
		return KillTheRNG.randomness.random_420.nextFloat();
	}

}