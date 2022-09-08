package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockEnderChest.class)
public class MixinBlockEnderChest{

	/**
	* Where the ender chest particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_enderChestParticlePos_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.enderChestParticlePos.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.enderChestParticlePos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Where the ender chest particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_enderChestParticlePos_2(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.enderChestParticlePos.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.enderChestParticlePos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Where the ender chest particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_enderChestParticlePos_3(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.enderChestParticlePos.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.enderChestParticlePos.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Where the ender chest particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_enderChestParticlePos_4(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.enderChestParticlePos.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.enderChestParticlePos.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Where the ender chest particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_enderChestParticlePos_5(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.enderChestParticlePos.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.enderChestParticlePos.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Where the ender chest particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_enderChestParticlePos_6(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.enderChestParticlePos.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.enderChestParticlePos.nextFloat();
//		return rand.nextFloat();
	}


}