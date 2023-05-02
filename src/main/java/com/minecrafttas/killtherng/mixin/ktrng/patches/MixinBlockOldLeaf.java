package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockOldLeaf.class)
public class MixinBlockOldLeaf{

	/**
	* Chance of alpha leaves dropping an apple on leaf break
	*/
	@Redirect(method = "dropApple(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_leafOldDropApple_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.leafOldDropApple.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.leafOldDropApple.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.leafOldDropApple.nextInt(i);
			return rand.nextInt(i);
		}
	}


}