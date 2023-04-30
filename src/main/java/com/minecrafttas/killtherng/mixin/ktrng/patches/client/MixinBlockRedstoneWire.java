package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockRedstoneWire.class)
public class MixinBlockRedstoneWire{

	/**
	* Particles of redstone wires
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_redstoneWireParticles_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.redstoneWireParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.redstoneWireParticles.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.redstoneWireParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Particles of redstone wires
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_redstoneWireParticles_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.redstoneWireParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.redstoneWireParticles.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.redstoneWireParticles.nextFloat();
			return rand.nextFloat();
		}
	}


}