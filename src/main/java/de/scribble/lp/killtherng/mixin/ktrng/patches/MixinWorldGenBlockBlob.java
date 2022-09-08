package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.feature.WorldGenBlockBlob.class)
public class MixinWorldGenBlockBlob{

	/**
	* Block Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_blockGeneration_1(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.blockGeneration.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.blockGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Block Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_blockGeneration_2(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.blockGeneration.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.blockGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Block Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_blockGeneration_3(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.blockGeneration.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.blockGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Block Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_blockGeneration_4(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.blockGeneration.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.blockGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Block Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_blockGeneration_5(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.blockGeneration.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.blockGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Block Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_blockGeneration_6(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.blockGeneration.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.blockGeneration.nextInt(i);
		return rand.nextInt(i);
	}


}