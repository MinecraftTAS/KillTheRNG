package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockChorusPlant.class)
public class MixinBlockChorusPlant{

	/**
	* How many chorus fruit drops when broken
	*/
	@Redirect(method = "quantityDropped(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_chorusQuantityDropped_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.chorusQuantityDropped.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.chorusQuantityDropped.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.chorusQuantityDropped.nextInt(i);
			return rand.nextInt(i);
		}
	}


}