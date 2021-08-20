package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockRedstoneOre;

@Mixin(BlockRedstoneOre.class)
public class MixinBlockRedstoneOre {

	/**
	* null
	*/
	@Redirect(method = "quantityDroppedWithBonus(ILjava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_404_0(Random rand, int i) {
		return KillTheRNG.randomness.random_404.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "quantityDropped(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_405_0(Random rand, int i) {
		return KillTheRNG.randomness.random_405.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getExpDrop(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;I)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_406_0(Random rand, int i) {
		return KillTheRNG.randomness.random_406.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_407_0(Random rand) {
		return KillTheRNG.randomness.random_407.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_408_1(Random rand) {
		return KillTheRNG.randomness.random_408.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_409_2(Random rand) {
		return KillTheRNG.randomness.random_409.nextFloat();
	}

}