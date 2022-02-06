package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.biome.BiomeDesert;

@Mixin(BiomeDesert.class)
public class MixinBiomeDesert {

	/**
	* Desert Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_desertGeneration_1(Random rand, int i) {
//		return KillTheRNG.randomness.desertGeneration.nextInt(i);
		KillTheRNG.randomness.desertGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Desert Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_desertGeneration_2(Random rand, int i) {
//		return KillTheRNG.randomness.desertGeneration.nextInt(i);
		KillTheRNG.randomness.desertGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Desert Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_desertGeneration_3(Random rand, int i) {
//		return KillTheRNG.randomness.desertGeneration.nextInt(i);
		KillTheRNG.randomness.desertGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Desert Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_desertGeneration_4(Random rand, int i) {
//		return KillTheRNG.randomness.desertGeneration.nextInt(i);
		KillTheRNG.randomness.desertGeneration.nextInt(i);
		return rand.nextInt(i);
	}

}