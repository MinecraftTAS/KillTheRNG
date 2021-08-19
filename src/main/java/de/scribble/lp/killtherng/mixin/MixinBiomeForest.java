package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.biome.BiomeForest;

@Mixin(BiomeForest.class)
public class MixinBiomeForest {
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1051(Random rand, int i) {
		return KillTheRNG.randomness.random_1051.nextInt(i);
	}

	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1052(Random rand, int i) {
		return KillTheRNG.randomness.random_1052.nextInt(i);
	}

	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1053(Random rand, int i) {
		return KillTheRNG.randomness.random_1053.nextInt(i);
	}

	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1054(Random rand, int i) {
		return KillTheRNG.randomness.random_1054.nextInt(i);
	}

	@Redirect(method = "addMushrooms(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1055(Random rand, int i) {
		return KillTheRNG.randomness.random_1055.nextInt(i);
	}

	@Redirect(method = "addMushrooms(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1056(Random rand, int i) {
		return KillTheRNG.randomness.random_1056.nextInt(i);
	}

	@Redirect(method = "addMushrooms(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1057(Random rand, int i) {
		return KillTheRNG.randomness.random_1057.nextInt(i);
	}

	@Redirect(method = "addDoublePlants(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1058(Random rand, int i) {
		return KillTheRNG.randomness.random_1058.nextInt(i);
	}

	@Redirect(method = "addDoublePlants(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1059(Random rand, int i) {
		return KillTheRNG.randomness.random_1059.nextInt(i);
	}

	@Redirect(method = "addDoublePlants(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1060(Random rand, int i) {
		return KillTheRNG.randomness.random_1060.nextInt(i);
	}

	@Redirect(method = "addDoublePlants(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1061(Random rand, int i) {
		return KillTheRNG.randomness.random_1061.nextInt(i);
	}

}
