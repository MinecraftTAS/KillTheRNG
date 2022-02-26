package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockFire;

@Mixin(BlockFire.class)
public class MixinBlockFire2 {

	/**
	* Chance whether fire can spread
	*/
	@Redirect(method = "onBlockAdded(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_fireSpreading_1(Random rand, int i) {
		return KillTheRNG.randomness.fireSpreading.nextInt(i);
//		KillTheRNG.randomness.fireSpreading.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Chance if fire makes a sound
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_fireSoundChance_2(Random rand, int i) {
		return KillTheRNG.randomness.fireSoundChance.nextInt(i);
//		KillTheRNG.randomness.fireSoundChance.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Something about fire sound
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_fireSound_3(Random rand) {
		return KillTheRNG.randomness.fireSound.nextFloat();
//		KillTheRNG.randomness.fireSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Something about fire sound
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_fireSound_4(Random rand) {
		return KillTheRNG.randomness.fireSound.nextFloat();
//		KillTheRNG.randomness.fireSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Get the X of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_fireParticlePosX_5(Random rand) {
		return KillTheRNG.randomness.fireParticlePosX.nextDouble();
//		KillTheRNG.randomness.fireParticlePosX.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Get the Y of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_fireParticlePosY_6(Random rand) {
		return KillTheRNG.randomness.fireParticlePosY.nextDouble();
//		KillTheRNG.randomness.fireParticlePosY.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Get the Z of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_fireParticlePosZ_7(Random rand) {
		return KillTheRNG.randomness.fireParticlePosZ.nextDouble();
//		KillTheRNG.randomness.fireParticlePosZ.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Get the X of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_fireParticlePosX_8(Random rand) {
		return KillTheRNG.randomness.fireParticlePosX.nextDouble();
//		KillTheRNG.randomness.fireParticlePosX.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Get the Y of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_fireParticlePosY_9(Random rand) {
		return KillTheRNG.randomness.fireParticlePosY.nextDouble();
//		KillTheRNG.randomness.fireParticlePosY.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Get the Z of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_fireParticlePosZ_10(Random rand) {
		return KillTheRNG.randomness.fireParticlePosZ.nextDouble();
//		KillTheRNG.randomness.fireParticlePosZ.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Get the X of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 6))
	public double redirect_fireParticlePosX_11(Random rand) {
		return KillTheRNG.randomness.fireParticlePosX.nextDouble();
//		KillTheRNG.randomness.fireParticlePosX.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Get the Y of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 7))
	public double redirect_fireParticlePosY_12(Random rand) {
		return KillTheRNG.randomness.fireParticlePosY.nextDouble();
//		KillTheRNG.randomness.fireParticlePosY.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Get the Z of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 8))
	public double redirect_fireParticlePosZ_13(Random rand) {
		return KillTheRNG.randomness.fireParticlePosZ.nextDouble();
//		KillTheRNG.randomness.fireParticlePosZ.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Get the X of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 9))
	public double redirect_fireParticlePosX_14(Random rand) {
		return KillTheRNG.randomness.fireParticlePosX.nextDouble();
//		KillTheRNG.randomness.fireParticlePosX.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Get the Y of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 10))
	public double redirect_fireParticlePosY_15(Random rand) {
		return KillTheRNG.randomness.fireParticlePosY.nextDouble();
//		KillTheRNG.randomness.fireParticlePosY.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Get the Z of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 11))
	public double redirect_fireParticlePosZ_16(Random rand) {
		return KillTheRNG.randomness.fireParticlePosZ.nextDouble();
//		KillTheRNG.randomness.fireParticlePosZ.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Get the X of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 12))
	public double redirect_fireParticlePosX_17(Random rand) {
		return KillTheRNG.randomness.fireParticlePosX.nextDouble();
//		KillTheRNG.randomness.fireParticlePosX.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Get the Y of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 13))
	public double redirect_fireParticlePosY_18(Random rand) {
		return KillTheRNG.randomness.fireParticlePosY.nextDouble();
//		KillTheRNG.randomness.fireParticlePosY.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Get the Z of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 14))
	public double redirect_fireParticlePosZ_19(Random rand) {
		return KillTheRNG.randomness.fireParticlePosZ.nextDouble();
//		KillTheRNG.randomness.fireParticlePosZ.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Get the X of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 15))
	public double redirect_fireParticlePosX_20(Random rand) {
		return KillTheRNG.randomness.fireParticlePosX.nextDouble();
//		KillTheRNG.randomness.fireParticlePosX.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Get the Y of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 16))
	public double redirect_fireParticlePosY_21(Random rand) {
		return KillTheRNG.randomness.fireParticlePosY.nextDouble();
//		KillTheRNG.randomness.fireParticlePosY.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Get the Z of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 17))
	public double redirect_fireParticlePosZ_22(Random rand) {
		return KillTheRNG.randomness.fireParticlePosZ.nextDouble();
//		KillTheRNG.randomness.fireParticlePosZ.nextDouble();
//		return rand.nextDouble();
	}

}
