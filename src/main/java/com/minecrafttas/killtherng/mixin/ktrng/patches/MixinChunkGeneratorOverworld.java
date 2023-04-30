package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.ChunkGeneratorOverworld.class)
public class MixinChunkGeneratorOverworld{

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "generateChunk(II)Lnet/minecraft/world/chunk/Chunk;", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_populationGeneration_1(Random rand, long seed) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.isEnabled()) {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.setSeed(seed, true);		} else {
			rand.setSeed(seed);
		}
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_populationGeneration_2(Random rand, long seed) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.isEnabled()) {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.setSeed(seed, true);		} else {
			rand.setSeed(seed);
		}
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_populationGeneration_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextLong();
		} else {
				com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextLong();
				return rand.nextLong();
		}
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	public long redirect_populationGeneration_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextLong();
		} else {
				com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextLong();
				return rand.nextLong();
		}
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 1))
	public void redirect_populationGeneration_5(Random rand, long seed) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.isEnabled()) {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.setSeed(seed, true);		} else {
			rand.setSeed(seed);
		}
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_populationGeneration_6(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_populationGeneration_7(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_populationGeneration_8(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_populationGeneration_9(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_populationGeneration_10(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_populationGeneration_11(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_populationGeneration_12(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_populationGeneration_13(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_populationGeneration_14(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_populationGeneration_15(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_populationGeneration_16(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_populationGeneration_17(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	public int redirect_populationGeneration_18(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.populationGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}


}