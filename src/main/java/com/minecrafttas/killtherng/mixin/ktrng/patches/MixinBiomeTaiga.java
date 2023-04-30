package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.biome.BiomeTaiga.class)
public class MixinBiomeTaiga{

	/**
	* Taiga Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_taigaGeneration_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Taiga Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_taigaGeneration_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Taiga Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_taigaGeneration_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Taiga Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_taigaGeneration_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Taiga Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_taigaGeneration_5(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Taiga Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_taigaGeneration_6(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Taiga Generation
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_taigaGeneration_7(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Taiga Generation
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_taigaGeneration_8(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Taiga Generation
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_taigaGeneration_9(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Taiga Generation
	*/
	@Redirect(method = "getRandomWorldGenForGrass(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenerator;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_taigaGeneration_10(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.taigaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}


}