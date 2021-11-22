package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.biome.Biome;

@Mixin(Biome.class)
public class MixinBiome {

	/**
	* The basic noise value used for biome generation
	*/
	@Redirect(method = "generateBiomeTerrain(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/chunk/ChunkPrimer;IID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_genBaseNoiseValue_1(Random rand) {
//		return KillTheRNG.randomness.genBaseNoiseValue.nextDouble();
		KillTheRNG.randomness.genBaseNoiseValue.nextDouble();
		return rand.nextDouble();
	}

	/**
	* The height of the bedrock layer in that current position
	*/
	@Redirect(method = "generateBiomeTerrain(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/chunk/ChunkPrimer;IID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_genBedrockLayer_2(Random rand, int i) {
//		return KillTheRNG.randomness.genBedrockLayer.nextInt(i);
		KillTheRNG.randomness.genBedrockLayer.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* How many layers of sandstone should be generated below a block
	*/
	@Redirect(method = "generateBiomeTerrain(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/chunk/ChunkPrimer;IID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_genSandstone_3(Random rand, int i) {
//		return KillTheRNG.randomness.genSandstone.nextInt(i);
		KillTheRNG.randomness.genSandstone.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* If a big oak tree should be generated instead of a normal tree
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_genBigOakTree_4(Random rand, int i) {
//		return KillTheRNG.randomness.genBigOakTree.nextInt(i);
		KillTheRNG.randomness.genBigOakTree.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* If a dandelion or a poppy should be generated
	*/
	@Redirect(method = "pickRandomFlower(Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/BlockFlower$EnumFlowerType;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_genDifferentFlower_5(Random rand, int i) {
//		return KillTheRNG.randomness.genDifferentFlower.nextInt(i);
		KillTheRNG.randomness.genDifferentFlower.nextInt(i);
		return rand.nextInt(i);
	}

}
