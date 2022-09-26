package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockBrewingStand.class)
public class MixinBlockBrewingStand{

	/**
	* The position of brewing stand particles
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_brewingStandParticle_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.brewingStandParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.brewingStandParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.brewingStandParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* The position of brewing stand particles
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_brewingStandParticle_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.brewingStandParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.brewingStandParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.brewingStandParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* The position of brewing stand particles
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_brewingStandParticle_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.brewingStandParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.brewingStandParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.brewingStandParticle.nextFloat();
			return rand.nextFloat();
		}
	}


}