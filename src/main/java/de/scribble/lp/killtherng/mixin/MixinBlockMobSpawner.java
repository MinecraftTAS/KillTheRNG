package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockMobSpawner;

@Mixin(BlockMobSpawner.class)
public class MixinBlockMobSpawner {

	/**
	* null
	*/
	@Redirect(method = "getExpDrop(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;I)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap=false)
	public int redirect_random_393_0(Random rand, int i) {
		return KillTheRNG.randomness.random_393.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getExpDrop(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;I)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1), remap=false)
	public int redirect_random_394_1(Random rand, int i) {
		return KillTheRNG.randomness.random_394.nextInt(i);
	}

}
