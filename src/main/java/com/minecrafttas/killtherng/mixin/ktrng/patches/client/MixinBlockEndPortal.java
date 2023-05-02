package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockEndPortal.class)
public class MixinBlockEndPortal{

	/**
	* The position of end portal particles
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_endPortalParticle_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.endPortalParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.endPortalParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.endPortalParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* The position of end portal particles
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_endPortalParticle_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.endPortalParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.endPortalParticle.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.endPortalParticle.nextFloat();
			return rand.nextFloat();
		}
	}


}