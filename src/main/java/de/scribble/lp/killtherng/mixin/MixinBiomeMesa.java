package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.biome.BiomeMesa;

@Mixin(BiomeMesa.class)
public class MixinBiomeMesa {
	@Redirect(method = "genTerrainBlocks(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/chunk/ChunkPrimer;IID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_1091(Random rand) {
		return KillTheRNG.randomness.random_1091.nextDouble();
	}

	@Redirect(method = "genTerrainBlocks(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/chunk/ChunkPrimer;IID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1092(Random rand, int i) {
		return KillTheRNG.randomness.random_1092.nextInt(i);
	}

	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1093(Random rand, int i) {
		return KillTheRNG.randomness.random_1093.nextInt(i);
	}

	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1094(Random rand, int i) {
		return KillTheRNG.randomness.random_1094.nextInt(i);
	}

	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1095(Random rand, int i) {
		return KillTheRNG.randomness.random_1095.nextInt(i);
	}

	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1096(Random rand, int i) {
		return KillTheRNG.randomness.random_1096.nextInt(i);
	}

	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1097(Random rand, int i) {
		return KillTheRNG.randomness.random_1097.nextInt(i);
	}

	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1098(Random rand, int i) {
		return KillTheRNG.randomness.random_1098.nextInt(i);
	}

	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_random_1099(Random rand, int i) {
		return KillTheRNG.randomness.random_1099.nextInt(i);
	}

	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_1100(Random rand, int i) {
		return KillTheRNG.randomness.random_1100.nextInt(i);
	}

	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_random_1101(Random rand, int i) {
		return KillTheRNG.randomness.random_1101.nextInt(i);
	}

	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_random_1102(Random rand, int i) {
		return KillTheRNG.randomness.random_1102.nextInt(i);
	}

	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_random_1103(Random rand, int i) {
		return KillTheRNG.randomness.random_1103.nextInt(i);
	}

	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_random_1104(Random rand, int i) {
		return KillTheRNG.randomness.random_1104.nextInt(i);
	}

	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 12))
	public boolean redirect_random_1105(Random rand) {
		return KillTheRNG.randomness.random_1105.nextBoolean();
	}

	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 13))
	public boolean redirect_random_1106(Random rand) {
		return KillTheRNG.randomness.random_1106.nextBoolean();
	}

}
