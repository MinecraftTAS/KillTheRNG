package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraft.world.biome.BiomeHills$EmeraldGenerator")
public class MixinBiomeHills$EmeraldGenerator{

	/**
	* Hills Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	public int redirect_hillsGeneration_1(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.hillsGeneration.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.hillsGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Hills Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1), remap = false)
	public int redirect_hillsGeneration_2(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.hillsGeneration.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.hillsGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Hills Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2), remap = false)
	public int redirect_hillsGeneration_3(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.hillsGeneration.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.hillsGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Hills Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3), remap = false)
	public int redirect_hillsGeneration_4(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.hillsGeneration.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.hillsGeneration.nextInt(i);
		return rand.nextInt(i);
	}


}