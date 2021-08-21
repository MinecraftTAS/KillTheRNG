package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.feature.WorldGenBigTree;

@Mixin(WorldGenBigTree.class)
public class MixinWorldGenBigTree {

	/**
	* null
	*/
	@Redirect(method = "generateLeafNodeList()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_240_1(Random rand) {
		return KillTheRNG.randomness.random_240.nextFloat();
//		KillTheRNG.randomness.random_240.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "generateLeafNodeList()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_241_2(Random rand) {
		return KillTheRNG.randomness.random_241.nextFloat();
//		KillTheRNG.randomness.random_241.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_random_242_3(Random rand) {
		return KillTheRNG.randomness.random_242.nextLong();
//		KillTheRNG.randomness.random_242.nextLong();
//		return rand.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_243_4(Random rand, int i) {
		return KillTheRNG.randomness.random_243.nextInt(i);
//		KillTheRNG.randomness.random_243.nextInt(i);
//		return rand.nextInt(i);
	}

}
