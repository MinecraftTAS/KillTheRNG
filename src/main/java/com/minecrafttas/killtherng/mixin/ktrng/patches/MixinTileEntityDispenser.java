package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.tileentity.TileEntityDispenser.class)
public class MixinTileEntityDispenser{

	/**
	* null
	*/
	@Redirect(method = "getDispenseSlot()I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_333_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_333.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_333.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_333.nextInt(i);
			return rand.nextInt(i);
		}
	}


}