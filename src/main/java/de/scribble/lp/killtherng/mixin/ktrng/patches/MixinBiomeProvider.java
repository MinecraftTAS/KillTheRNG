package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.biome.BiomeProvider;

@Mixin(BiomeProvider.class)
public class MixinBiomeProvider {

	/**
	* Biome Generation
	*/
	@Redirect(method = "findBiomePosition(IIILjava/util/List;Ljava/util/Random;)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_biomeLocationGeneration_1(Random rand, int i) {
//		return KillTheRNG.randomness.biomeLocationGeneration.nextInt(i);
		KillTheRNG.randomness.biomeLocationGeneration.nextInt(i);
		return rand.nextInt(i);
	}

}
