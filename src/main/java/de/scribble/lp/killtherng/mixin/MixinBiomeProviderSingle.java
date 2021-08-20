package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.biome.BiomeProviderSingle;

@Mixin(BiomeProviderSingle.class)
public class MixinBiomeProviderSingle {

	/**
	* null
	*/
	@Redirect(method = "findBiomePosition(IIILjava/util/List;Ljava/util/Random;)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1363_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1363.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findBiomePosition(IIILjava/util/List;Ljava/util/Random;)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1364_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1364.nextInt(i);
	}

}
