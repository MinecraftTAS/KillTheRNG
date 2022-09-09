package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockMushroom.class)
public class MixinBlockMushroom{

	/**
	* null
	*/
	@Redirect(method = "canUseBonemeal(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_357_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_357.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_357.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_357.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_348_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_348.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_348.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_348.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_349_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_349.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_349.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_349.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_350_4(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_350.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_350.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_350.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_351_5(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_351.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_351.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_351.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_352_6(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_352.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_352.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_352.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_353_7(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_353.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_353.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_353.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_random_354_8(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_354.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_354.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_354.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_355_9(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_355.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_355.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_355.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_random_356_10(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_356.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_356.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_356.nextInt(i);
			return rand.nextInt(i);
		}
	}


}