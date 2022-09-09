package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockFire.class)
public class MixinBlockFire{

	/**
	* Chance whether fire can spread
	*/
	@Redirect(method = "onBlockAdded(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_fireSpreading_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireSpreading.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireSpreading.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireSpreading.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Chance for a block to catch on fire
	*/
	@Redirect(method = "tryCatchFire(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;ILjava/util/Random;ILnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	public int redirect_catchFireChance_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.catchFireChance.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.catchFireChance.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.catchFireChance.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Chance for a block to catch on fire
	*/
	@Redirect(method = "tryCatchFire(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;ILjava/util/Random;ILnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1), remap = false)
	public int redirect_catchFireChance_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.catchFireChance.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.catchFireChance.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.catchFireChance.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Increases the age of the fire by a random amount
	*/
	@Redirect(method = "tryCatchFire(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;ILjava/util/Random;ILnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2), remap = false)
	public int redirect_catchFireAge_4(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.catchFireAge.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.catchFireAge.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.catchFireAge.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Chance of the fire extinguishing itself
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_fireSelfExtinguish_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireSelfExtinguish.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireSelfExtinguish.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireSelfExtinguish.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Amount to increase the age of the fire
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_fireIncreaseAge_6(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireIncreaseAge.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireIncreaseAge.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireIncreaseAge.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Amount of delay before the fire updates
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_fireUpdateDelay_7(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireUpdateDelay.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireUpdateDelay.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireUpdateDelay.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Chance of a non flammable block extinguishes itself
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_fireNonFlammableExtinguish_8(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireNonFlammableExtinguish.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireNonFlammableExtinguish.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireNonFlammableExtinguish.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Chance of increasing age when fire is in a fire cluster
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_fireClusterChance_9(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireClusterChance.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireClusterChance.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireClusterChance.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Amount to increase age when in a fire cluster
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_fireClusterIncreaseAge_10(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireClusterIncreaseAge.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireClusterIncreaseAge.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireClusterIncreaseAge.nextInt(i);
			return rand.nextInt(i);
		}
	}


}