package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.biome.BiomeSavanna.class)
public class MixinBiomeSavanna{

	/**
	* Savanna Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_savannaGeneration_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.savannaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.savannaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.savannaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Savanna Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_savannaGeneration_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.savannaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.savannaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.savannaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Savanna Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_savannaGeneration_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.savannaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.savannaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.savannaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Savanna Generation
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_savannaGeneration_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.savannaGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.savannaGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.savannaGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}


}