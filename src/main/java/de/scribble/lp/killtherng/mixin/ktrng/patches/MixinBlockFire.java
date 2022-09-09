package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockFire.class)
public class MixinBlockFire{

	/**
	* Chance for a block to catch on fire
	*/
	@Redirect(method = "tryCatchFire(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;ILjava/util/Random;ILnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	public int redirect_catchFireChance_1(Random rand, int i) {
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
	public int redirect_catchFireChance_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.catchFireChance.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.catchFireChance.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.catchFireChance.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* dunno
	*/
	@Redirect(method = "tryCatchFire(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;ILjava/util/Random;ILnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2), remap = false)
	public int redirect_catchFireThing_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.catchFireThing.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.catchFireThing.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.catchFireThing.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* dunno
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_fireThing_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireThing.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireThing.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireThing.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* dunno
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_fireThing_5(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireThing.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireThing.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireThing.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* dunno
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_fireThing_6(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireThing.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireThing.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireThing.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* dunno
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_fireThing_7(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireThing.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireThing.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireThing.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* dunno
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_fireThing_8(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireThing.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireThing.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireThing.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* dunno
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_fireThing_9(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireThing.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireThing.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireThing.nextInt(i);
			return rand.nextInt(i);
		}
	}


}