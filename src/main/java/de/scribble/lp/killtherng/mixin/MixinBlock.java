package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.Block;

@Mixin(Block.class)
public class MixinBlock {

	/**
	* null
	*/
	@Redirect(method = "dropBlockAsItemWithChance(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;FI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_201_0(Random rand) {
		return KillTheRNG.randomness.random_201.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnAsEntity(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_random_202_0(Random rand) {
		return KillTheRNG.randomness.random_202.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnAsEntity(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	private static float redirect_random_203_1(Random rand) {
		return KillTheRNG.randomness.random_203.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnAsEntity(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	private static float redirect_random_204_2(Random rand) {
		return KillTheRNG.randomness.random_204.nextFloat();
	}

}
