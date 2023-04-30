package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.biome.BiomeMesa.class)
public class MixinBiomeMesa{

	/**
	* Mesa Generation
	*/
	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_mesaGeneration_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Mesa Generation
	*/
	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_mesaGeneration_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Mesa Generation
	*/
	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_mesaGeneration_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Mesa Generation
	*/
	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_mesaGeneration_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Mesa Generation
	*/
	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_mesaGeneration_5(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Mesa Generation
	*/
	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_mesaGeneration_6(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Mesa Generation
	*/
	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_mesaGeneration_7(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Mesa Generation
	*/
	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_mesaGeneration_8(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Mesa Generation
	*/
	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_mesaGeneration_9(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Mesa Generation
	*/
	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_mesaGeneration_10(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Mesa Generation
	*/
	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_mesaGeneration_11(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Mesa Generation
	*/
	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_mesaGeneration_12(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Mesa Generation
	*/
	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_mesaGeneration_13(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextBoolean();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextBoolean();
			return rand.nextBoolean();
		}
	}

	/**
	* Mesa Generation
	*/
	@Redirect(method = "generateBands(J)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_mesaGeneration_14(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextBoolean();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextBoolean();
			return rand.nextBoolean();
		}
	}

	/**
	* Mesa Generation
	*/
	@Redirect(method = "genTerrainBlocks(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/chunk/ChunkPrimer;IID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_mesaGeneration_15(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Mesa Generation
	*/
	@Redirect(method = "genTerrainBlocks(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/chunk/ChunkPrimer;IID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_mesaGeneration_16(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mesaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}


}