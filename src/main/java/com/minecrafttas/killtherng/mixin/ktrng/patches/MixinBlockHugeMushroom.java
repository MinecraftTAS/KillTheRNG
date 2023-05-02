package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockHugeMushroom.class)
public class MixinBlockHugeMushroom{

	/**
	* Quantity of huge mushroom drop
	*/
	@Redirect(method = "quantityDropped(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_mushroomHugeDrop_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomHugeDrop.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomHugeDrop.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomHugeDrop.nextInt(i);
			return rand.nextInt(i);
		}
	}


}