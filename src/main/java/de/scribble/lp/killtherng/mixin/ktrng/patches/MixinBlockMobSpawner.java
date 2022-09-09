package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockMobSpawner.class)
public class MixinBlockMobSpawner{

	/**
	* null
	*/
	@Redirect(method = "getExpDrop(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;I)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	public int redirect_random_393_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_393.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_393.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_393.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "getExpDrop(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;I)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1), remap = false)
	public int redirect_random_394_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_394.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_394.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_394.nextInt(i);
			return rand.nextInt(i);
		}
	}


}