package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.biome.BiomeHills.class)
public class MixinBiomeHills{

	/**
	* Hills Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_hillsGeneration_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.hillsGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.hillsGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.hillsGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Hills Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_hillsGeneration_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.hillsGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.hillsGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.hillsGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Hills Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_hillsGeneration_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.hillsGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.hillsGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.hillsGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Hills Generation
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_hillsGeneration_4(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.hillsGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.hillsGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.hillsGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}


}