package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.feature.WorldGenMegaPineTree;

@Mixin(WorldGenMegaPineTree.class)
public class MixinWorldGenMegaPineTree {

	/**
	* null
	*/
	@Redirect(method = "createCrown(Lnet/minecraft/world/World;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_257_1(Random rand, int i) {
		return KillTheRNG.randomness.random_257.nextInt(i);
//		KillTheRNG.randomness.random_257.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generateSaplings(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_258_2(Random rand, int i) {
		return KillTheRNG.randomness.random_258.nextInt(i);
//		KillTheRNG.randomness.random_258.nextInt(i);
//		return rand.nextInt(i);
	}

}
