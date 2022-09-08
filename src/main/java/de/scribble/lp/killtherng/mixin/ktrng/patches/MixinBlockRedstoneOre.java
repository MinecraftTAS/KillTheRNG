package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockRedstoneOre.class)
public class MixinBlockRedstoneOre{

	/**
	* null
	*/
	@Redirect(method = "getExpDrop(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;I)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	public int redirect_random_406_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_406.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_406.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "quantityDropped(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_405_2(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_405.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_405.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "quantityDroppedWithBonus(ILjava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_404_3(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_404.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_404.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_407_4(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_407.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_407.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_408_5(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_408.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_408.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_409_6(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_409.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_409.nextFloat();
//		return rand.nextFloat();
	}


}