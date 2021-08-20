package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.biome.Biome;

@Mixin(Biome.class)
public class MixinBiome {

	/**
	* null
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_207_0(Random rand, int i) {
		return KillTheRNG.randomness.random_207.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "pickRandomFlower(Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/BlockFlower$EnumFlowerType;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_208_0(Random rand, int i) {
		return KillTheRNG.randomness.random_208.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generateBiomeTerrain(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/chunk/ChunkPrimer;IID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_209_0(Random rand) {
		return KillTheRNG.randomness.random_209.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "generateBiomeTerrain(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/chunk/ChunkPrimer;IID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_210_1(Random rand, int i) {
		return KillTheRNG.randomness.random_210.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generateBiomeTerrain(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/chunk/ChunkPrimer;IID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_211_2(Random rand, int i) {
		return KillTheRNG.randomness.random_211.nextInt(i);
	}

}
