package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockFurnace.class)
public class MixinBlockFurnace{

	/**
	* Offset of the position of the furnace particles in the Y axis
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_furnaceParticlePos_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.furnaceParticlePos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.furnaceParticlePos.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.furnaceParticlePos.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of some furnace particles
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_furnaceParticlePos_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.furnaceParticlePos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.furnaceParticlePos.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.furnaceParticlePos.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Chance for the furnace to crackle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_furnaceSound_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.furnaceSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.furnaceSound.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.furnaceSound.nextDouble();
			return rand.nextDouble();
		}
	}


}