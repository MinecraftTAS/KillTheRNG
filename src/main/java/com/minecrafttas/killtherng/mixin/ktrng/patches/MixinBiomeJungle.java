package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.biome.BiomeJungle.class)
public class MixinBiomeJungle{

	/**
	* Jungle Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_jungleGeneration_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Jungle Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_jungleGeneration_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Jungle Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_jungleGeneration_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Jungle Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_jungleGeneration_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Jungle Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_jungleGeneration_5(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Jungle Generation
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_jungleGeneration_6(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Jungle Generation
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_jungleGeneration_7(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Jungle Generation
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_jungleGeneration_8(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Jungle Generation
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_jungleGeneration_9(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Jungle Generation
	*/
	@Redirect(method = "getRandomWorldGenForGrass(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenerator;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_jungleGeneration_10(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.jungleGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}


}