package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.biome.BiomeEndDecorator;

@Mixin(BiomeEndDecorator.class)
public class MixinBiomeEndDecorator {

	/**
	* Desert Generation
	*/
	@Redirect(method = "getSpikesForWorld(Lnet/minecraft/world/World;)[Lnet/minecraft/world/gen/feature/WorldGenSpikes$EndSpike;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	private static long redirect_desertGeneration_1(Random rand) {
//		return KillTheRNG.randomness.desertGeneration.nextLong();
		KillTheRNG.randomness.desertGeneration.nextLong();
		return rand.nextLong();
	}

}
