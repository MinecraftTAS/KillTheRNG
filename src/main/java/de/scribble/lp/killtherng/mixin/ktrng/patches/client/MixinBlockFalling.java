package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockFalling.class)
public class MixinBlockFalling{

	/**
	* Chance of a falling block particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_fallingBlockParticleActivate_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.fallingBlockParticleActivate.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.fallingBlockParticleActivate.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.fallingBlockParticleActivate.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of falling block particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_fallingBlockParticlePos_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.fallingBlockParticlePos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.fallingBlockParticlePos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.fallingBlockParticlePos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of falling block particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_fallingBlockParticlePos_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.fallingBlockParticlePos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.fallingBlockParticlePos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.fallingBlockParticlePos.nextFloat();
			return rand.nextFloat();
		}
	}


}