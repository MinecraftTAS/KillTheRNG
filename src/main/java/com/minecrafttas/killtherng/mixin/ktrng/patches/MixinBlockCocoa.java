package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockCocoa.class)
public class MixinBlockCocoa{

	/**
	* Chance for cocoa to grow
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_cocoaGrow_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.cocoaGrow.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.cocoaGrow.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.cocoaGrow.nextInt(i);
			return rand.nextInt(i);
		}
	}


}