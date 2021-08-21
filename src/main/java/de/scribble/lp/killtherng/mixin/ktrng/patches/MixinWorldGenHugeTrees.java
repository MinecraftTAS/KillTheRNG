package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.feature.WorldGenHugeTrees;

@Mixin(WorldGenHugeTrees.class)
public class MixinWorldGenHugeTrees {

	/**
	* null
	*/
	@Redirect(method = "getHeight(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_259_1(Random rand, int i) {
		return KillTheRNG.randomness.random_259.nextInt(i);
//		KillTheRNG.randomness.random_259.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getHeight(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_260_2(Random rand, int i) {
		return KillTheRNG.randomness.random_260.nextInt(i);
//		KillTheRNG.randomness.random_260.nextInt(i);
//		return rand.nextInt(i);
	}

}
