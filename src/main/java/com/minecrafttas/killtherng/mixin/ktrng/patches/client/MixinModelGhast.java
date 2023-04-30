package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.model.ModelGhast.class)
public class MixinModelGhast{

	/**
	* Length of a ghasts tentacles
	*/
	@Redirect(method = "<init>()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_modelGhast_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.modelGhast.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.modelGhast.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.modelGhast.nextInt(i);
			return rand.nextInt(i);
		}
	}


}