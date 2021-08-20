package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.biome.BiomeEndDecorator;

@Mixin(BiomeEndDecorator.class)
public class MixinBiomeEndDecorator {

	/**
	* null
	*/
	@Redirect(method = "getSpikesForWorld(Lnet/minecraft/world/World;)[Lnet/minecraft/world/gen/feature/WorldGenSpikes$EndSpike;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	private static long redirect_random_1248_0(Random rand) {
		return KillTheRNG.randomness.random_1248.nextLong();
	}

}
