package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockBrewingStand.class)
public class MixinBlockBrewingStand{

	/**
	* Get the X of the position of a particle of a brewing stand
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_brewingStandParticlePositionX_1(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.brewingStandParticlePositionX.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.brewingStandParticlePositionX.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Get the Y of the position of a particle of a brewing stand
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_brewingStandParticlePositionY_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.brewingStandParticlePositionY.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.brewingStandParticlePositionY.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Get the Z of the position of a particle of a brewing stand
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_brewingStandParticlePositionZ_3(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.brewingStandParticlePositionZ.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.brewingStandParticlePositionZ.nextFloat();
//		return rand.nextFloat();
	}


}