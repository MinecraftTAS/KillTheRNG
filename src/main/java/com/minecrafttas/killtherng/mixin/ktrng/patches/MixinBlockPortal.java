package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockPortal.class)
public class MixinBlockPortal{

	/**
	* Chance of piglin spawning in the nether portal
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_netherPortalPiglin_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPortalPiglin.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPortalPiglin.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPortalPiglin.nextInt(i);
			return rand.nextInt(i);
		}
	}


}