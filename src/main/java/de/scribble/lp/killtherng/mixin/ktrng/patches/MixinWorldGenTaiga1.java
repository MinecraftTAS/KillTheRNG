package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.feature.WorldGenTaiga1;

@Mixin(WorldGenTaiga1.class)
public class MixinWorldGenTaiga1 {

	/**
	* Taiga Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_taigaGeneration_1(Random rand, int i) {
//		return KillTheRNG.randomness.taigaGeneration.nextInt(i);
		KillTheRNG.randomness.taigaGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Taiga Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_taigaGeneration_2(Random rand, int i) {
//		return KillTheRNG.randomness.taigaGeneration.nextInt(i);
		KillTheRNG.randomness.taigaGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Taiga Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_taigaGeneration_3(Random rand, int i) {
//		return KillTheRNG.randomness.taigaGeneration.nextInt(i);
		KillTheRNG.randomness.taigaGeneration.nextInt(i);
		return rand.nextInt(i);
	}

}
