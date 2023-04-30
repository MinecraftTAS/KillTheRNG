package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockCauldron.class)
public class MixinBlockCauldron{

	/**
	* Chance of a cauldron increasing the water level during rain
	*/
	@Redirect(method = "fillWithRain(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_cauldronFillWIthRain_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.cauldronFillWIthRain.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.cauldronFillWIthRain.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.cauldronFillWIthRain.nextInt(i);
			return rand.nextInt(i);
		}
	}


}