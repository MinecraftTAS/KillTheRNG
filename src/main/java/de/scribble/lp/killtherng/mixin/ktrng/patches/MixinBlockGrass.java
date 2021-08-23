package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockGrass;

@Mixin(BlockGrass.class)
public class MixinBlockGrass {

	/**
	* Determines the next block position for grass to spread
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_grassSpreadPos_1(Random rand, int i) {
		return KillTheRNG.randomness.grassSpreadPos.nextInt(i);
//		KillTheRNG.randomness.grassSpreadPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Determines the next block position for grass to spread
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_grassSpreadPos_2(Random rand, int i) {
		return KillTheRNG.randomness.grassSpreadPos.nextInt(i);
//		KillTheRNG.randomness.grassSpreadPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Determines the next block position for grass to spread
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_grassSpreadPos_3(Random rand, int i) {
		return KillTheRNG.randomness.grassSpreadPos.nextInt(i);
//		KillTheRNG.randomness.grassSpreadPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* If a flower should be added when bonemealing grass
	*/
	@Redirect(method = "grow(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_bonemealGrassFlower_4(Random rand, int i) {
		return KillTheRNG.randomness.bonemealGrassFlower.nextInt(i);
//		KillTheRNG.randomness.bonemealGrassFlower.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* The position where the grass should grow
	*/
	@Redirect(method = "grow(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_bonemealGrassPos_5(Random rand, int i) {
		return KillTheRNG.randomness.bonemealGrassPos.nextInt(i);
//		KillTheRNG.randomness.bonemealGrassPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* The position where the grass should grow
	*/
	@Redirect(method = "grow(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_bonemealGrassPos_6(Random rand, int i) {
		return KillTheRNG.randomness.bonemealGrassPos.nextInt(i);
//		KillTheRNG.randomness.bonemealGrassPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* The position where the grass should grow
	*/
	@Redirect(method = "grow(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_bonemealGrassPos_7(Random rand, int i) {
		return KillTheRNG.randomness.bonemealGrassPos.nextInt(i);
//		KillTheRNG.randomness.bonemealGrassPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* The position where the grass should grow
	*/
	@Redirect(method = "grow(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_bonemealGrassPos_8(Random rand, int i) {
		return KillTheRNG.randomness.bonemealGrassPos.nextInt(i);
//		KillTheRNG.randomness.bonemealGrassPos.nextInt(i);
//		return rand.nextInt(i);
	}

}
