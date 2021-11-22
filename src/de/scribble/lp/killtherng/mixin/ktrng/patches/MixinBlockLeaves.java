package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockLeaves;

@Mixin(BlockLeaves.class)
public class MixinBlockLeaves {

	/**
	* Chance of a sapling dropped
	*/
	@Redirect(method = "getDrops(Lnet/minecraft/util/NonNullList;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap=false)
	public int redirect_leafDropSapling2_1(Random rand, int i) {
		return KillTheRNG.randomness.leafDropSapling2.nextInt(i);
//		KillTheRNG.randomness.leafDropSapling2.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Chance of a sapling dropped
	*/
	@Redirect(method = "quantityDropped(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_leafDropSapling_2(Random rand, int i) {
		return KillTheRNG.randomness.leafDropSapling.nextInt(i);
//		KillTheRNG.randomness.leafDropSapling.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* If a drip particle should spawn
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_leafDripParticleActivate_3(Random rand, int i) {
		return KillTheRNG.randomness.leafDripParticleActivate.nextInt(i);
//		KillTheRNG.randomness.leafDripParticleActivate.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Position of drip particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_leafDripParticle_4(Random rand) {
		return KillTheRNG.randomness.leafDripParticle.nextFloat();
//		KillTheRNG.randomness.leafDripParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of drip particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_leafDripParticle_5(Random rand) {
		return KillTheRNG.randomness.leafDripParticle.nextFloat();
//		KillTheRNG.randomness.leafDripParticle.nextFloat();
//		return rand.nextFloat();
	}

}
