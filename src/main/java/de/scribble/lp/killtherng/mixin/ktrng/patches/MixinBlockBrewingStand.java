package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockBrewingStand;

@Mixin(BlockBrewingStand.class)
public class MixinBlockBrewingStand {

	/**
	* Get the X of the position of a particle of a brewing stand
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_brewingStandParticlePosition_1(Random rand) {
		return KillTheRNG.randomness.brewingStandParticlePosition.nextFloat();
//		KillTheRNG.randomness.brewingStandParticlePosition.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Get the Y of the position of a particle of a brewing stand
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_brewingStandParticlePosition_2(Random rand) {
		return KillTheRNG.randomness.brewingStandParticlePosition.nextFloat();
//		KillTheRNG.randomness.brewingStandParticlePosition.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Get the Z of the position of a particle of a brewing stand
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_brewingStandParticlePosition_3(Random rand) {
		return KillTheRNG.randomness.brewingStandParticlePosition.nextFloat();
//		KillTheRNG.randomness.brewingStandParticlePosition.nextFloat();
//		return rand.nextFloat();
	}

}
