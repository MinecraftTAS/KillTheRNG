package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockFalling;

@Mixin(BlockFalling.class)
public class MixinBlockFalling {

	/**
	* Chance of a falling block particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_fallingBlockParticleActivate_1(Random rand, int i) {
		return KillTheRNG.randomness.fallingBlockParticleActivate.nextInt(i);
//		KillTheRNG.randomness.fallingBlockParticleActivate.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Position of falling block particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_fallingBlockParticlePos_2(Random rand) {
		return KillTheRNG.randomness.fallingBlockParticlePos.nextFloat();
//		KillTheRNG.randomness.fallingBlockParticlePos.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of falling block particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_fallingBlockParticlePos_3(Random rand) {
		return KillTheRNG.randomness.fallingBlockParticlePos.nextFloat();
//		KillTheRNG.randomness.fallingBlockParticlePos.nextFloat();
//		return rand.nextFloat();
	}

}
