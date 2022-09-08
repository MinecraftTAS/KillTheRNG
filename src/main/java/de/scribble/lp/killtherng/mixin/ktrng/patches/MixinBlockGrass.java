package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockGrass.class)
public class MixinBlockGrass{

	/**
	* If a flower should be added when bonemealing grass
	*/
	@Redirect(method = "grow(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_bonemealGrassFlower_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.bonemealGrassFlower.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.bonemealGrassFlower.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.bonemealGrassFlower.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The position where the grass should grow
	*/
	@Redirect(method = "grow(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_bonemealGrassPos_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.bonemealGrassPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.bonemealGrassPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.bonemealGrassPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The position where the grass should grow
	*/
	@Redirect(method = "grow(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_bonemealGrassPos_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.bonemealGrassPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.bonemealGrassPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.bonemealGrassPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The position where the grass should grow
	*/
	@Redirect(method = "grow(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_bonemealGrassPos_4(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.bonemealGrassPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.bonemealGrassPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.bonemealGrassPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The position where the grass should grow
	*/
	@Redirect(method = "grow(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_bonemealGrassPos_5(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.bonemealGrassPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.bonemealGrassPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.bonemealGrassPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Determines the next block position for grass to spread
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_grassSpreadPos_6(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.grassSpreadPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.grassSpreadPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.grassSpreadPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Determines the next block position for grass to spread
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_grassSpreadPos_7(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.grassSpreadPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.grassSpreadPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.grassSpreadPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Determines the next block position for grass to spread
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_grassSpreadPos_8(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.grassSpreadPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.grassSpreadPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.grassSpreadPos.nextInt(i);
			return rand.nextInt(i);
		}
	}


}