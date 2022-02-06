package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.feature.WorldGenSwamp;

@Mixin(WorldGenSwamp.class)
public class MixinWorldGenSwamp {

	/**
	* Swamp Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_swampGeneration_1(Random rand, int i) {
//		return KillTheRNG.randomness.swampGeneration.nextInt(i);
		KillTheRNG.randomness.swampGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Swamp Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_swampGeneration_2(Random rand, int i) {
//		return KillTheRNG.randomness.swampGeneration.nextInt(i);
		KillTheRNG.randomness.swampGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Swamp Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_swampGeneration_3(Random rand, int i) {
//		return KillTheRNG.randomness.swampGeneration.nextInt(i);
		KillTheRNG.randomness.swampGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Swamp Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_swampGeneration_4(Random rand, int i) {
//		return KillTheRNG.randomness.swampGeneration.nextInt(i);
		KillTheRNG.randomness.swampGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Swamp Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_swampGeneration_5(Random rand, int i) {
//		return KillTheRNG.randomness.swampGeneration.nextInt(i);
		KillTheRNG.randomness.swampGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Swamp Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_swampGeneration_6(Random rand, int i) {
//		return KillTheRNG.randomness.swampGeneration.nextInt(i);
		KillTheRNG.randomness.swampGeneration.nextInt(i);
		return rand.nextInt(i);
	}

}