package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.renderer.entity.RenderEnderman.class)
public class MixinRenderEnderman{

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/monster/EntityEnderman;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_1376_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1376.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1376.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1376.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/monster/EntityEnderman;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_1377_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1377.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1377.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1377.nextGaussian();
			return rand.nextGaussian();
		}
	}


}