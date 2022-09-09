package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockRedstoneTorch.class)
public class MixinBlockRedstoneTorch{

	/**
	* Particles of redstone torch
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_redstoneTorchParticles_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.redstoneTorchParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.redstoneTorchParticles.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.redstoneTorchParticles.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Particles of redstone torch
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_redstoneTorchParticles_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.redstoneTorchParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.redstoneTorchParticles.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.redstoneTorchParticles.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Particles of redstone torch
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_redstoneTorchParticles_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.redstoneTorchParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.redstoneTorchParticles.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.redstoneTorchParticles.nextDouble();
			return rand.nextDouble();
		}
	}


}