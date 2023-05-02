package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockRedstoneRepeater.class)
public class MixinBlockRedstoneRepeater{

	/**
	* Particles of redstone repeater
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_redstoneRepeaterParticles_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.redstoneRepeaterParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.redstoneRepeaterParticles.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.redstoneRepeaterParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Particles of redstone repeater
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_redstoneRepeaterParticles_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.redstoneRepeaterParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.redstoneRepeaterParticles.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.redstoneRepeaterParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Particles of redstone repeater
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_redstoneRepeaterParticles_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.redstoneRepeaterParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.redstoneRepeaterParticles.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.redstoneRepeaterParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Particles of redstone repeater
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_redstoneRepeaterParticles_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.redstoneRepeaterParticles.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.redstoneRepeaterParticles.nextBoolean();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.redstoneRepeaterParticles.nextBoolean();
			return rand.nextBoolean();
		}
	}


}