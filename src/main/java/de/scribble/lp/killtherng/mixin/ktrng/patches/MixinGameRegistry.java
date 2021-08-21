package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mixin(GameRegistry.class)
public class MixinGameRegistry {

	/**
	* Generates values used for the chunk seed
	*/
	@Redirect(method = "generateWorld(IILnet/minecraft/world/World;Lnet/minecraft/world/gen/IChunkGenerator;Lnet/minecraft/world/chunk/IChunkProvider;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0), remap=false)
	private static long redirect_forgeGetChunkSeedFromWorldSeed_1(Random rand) {
//		return KillTheRNG.randomness.forgeGetChunkSeedFromWorldSeed.nextLong();
		KillTheRNG.randomness.forgeGetChunkSeedFromWorldSeed.nextLong();
		return rand.nextLong();
	}

	/**
	* Generates values used for the chunk seed
	*/
	@Redirect(method = "generateWorld(IILnet/minecraft/world/World;Lnet/minecraft/world/gen/IChunkGenerator;Lnet/minecraft/world/chunk/IChunkProvider;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1), remap=false)
	private static long redirect_forgeGetChunkSeedFromWorldSeed_2(Random rand) {
//		return KillTheRNG.randomness.forgeGetChunkSeedFromWorldSeed.nextLong();
		KillTheRNG.randomness.forgeGetChunkSeedFromWorldSeed.nextLong();
		return rand.nextLong();
	}

	/**
	* Forge's system to set the chunk seed
	*/
	@Redirect(method = "generateWorld(IILnet/minecraft/world/World;Lnet/minecraft/world/gen/IChunkGenerator;Lnet/minecraft/world/chunk/IChunkProvider;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0), remap=false)
	private static void redirect_forgeSetChunkSeed_3(Random rand, long seed) {
		KillTheRNG.randomness.forgeSetChunkSeed.setSeed(seed, true);
		rand.setSeed(seed);
	}

}
