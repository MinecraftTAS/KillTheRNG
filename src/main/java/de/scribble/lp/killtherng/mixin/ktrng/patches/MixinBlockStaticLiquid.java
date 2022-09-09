package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockStaticLiquid.class)
public class MixinBlockStaticLiquid{

	/**
	* Chance of fire spreading and how much spreads
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_lavaFireSpreadChanceAndAmount_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.lavaFireSpreadChanceAndAmount.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.lavaFireSpreadChanceAndAmount.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.lavaFireSpreadChanceAndAmount.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of next fire spread
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_lavaFireSpreadPos_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.lavaFireSpreadPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.lavaFireSpreadPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.lavaFireSpreadPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of next fire spread
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_lavaFireSpreadPos_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.lavaFireSpreadPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.lavaFireSpreadPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.lavaFireSpreadPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of next fire spread
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_lavaFireSpreadPos_4(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.lavaFireSpreadPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.lavaFireSpreadPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.lavaFireSpreadPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of next fire spread
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_lavaFireSpreadPos_5(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.lavaFireSpreadPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.lavaFireSpreadPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.lavaFireSpreadPos.nextInt(i);
			return rand.nextInt(i);
		}
	}


}