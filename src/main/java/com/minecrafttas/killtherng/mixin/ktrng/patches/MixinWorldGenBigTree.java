package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.feature.WorldGenBigTree.class)
public class MixinWorldGenBigTree{

	/**
	* Advances the randomness to the next seed?
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_genBigTreeGenerateNextSeed_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genBigTreeGenerateNextSeed.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genBigTreeGenerateNextSeed.nextLong();
		} else {
				com.minecrafttas.killtherng.KillTheRNG.commonRandom.genBigTreeGenerateNextSeed.nextLong();
				return rand.nextLong();
		}
	}

	/**
	* Height limit for big trees
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_genBigTreeHeightLimit_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genBigTreeHeightLimit.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genBigTreeHeightLimit.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.genBigTreeHeightLimit.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Some leaf generation
	*/
	@Redirect(method = "generateLeafNodeList()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_genBigTreeLeafNodes_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genBigTreeLeafNodes.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genBigTreeLeafNodes.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.genBigTreeLeafNodes.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Some leaf generation
	*/
	@Redirect(method = "generateLeafNodeList()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_genBigTreeLeafNodes_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genBigTreeLeafNodes.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genBigTreeLeafNodes.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.genBigTreeLeafNodes.nextFloat();
			return rand.nextFloat();
		}
	}


}