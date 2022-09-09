package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockEndRod.class)
public class MixinBlockEndRod{

	/**
	* Where the end rod particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_endRodParticlePos_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the end rod particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_endRodParticlePos_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the end rod particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_endRodParticlePos_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the end rod particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_endRodParticlePos_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the end rod particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_endRodParticlePos_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Chance for the end rod particle to spawn
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_endRodParticlePosChance_6(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePosChance.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePosChance.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePosChance.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Where the end rod particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_endRodParticlePos_7(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePos.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePos.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Where the end rod particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_endRodParticlePos_8(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePos.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePos.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Where the end rod particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_endRodParticlePos_9(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePos.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endRodParticlePos.nextGaussian();
			return rand.nextGaussian();
		}
	}


}