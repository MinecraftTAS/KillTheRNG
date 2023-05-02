package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraftforge.fml.common.registry.GameRegistry.class)
public class MixinGameRegistry{

	/**
	* Generates values used for the chunk seed
	*/
	@Redirect(method = "generateWorld(IILnet/minecraft/world/World;Lnet/minecraft/world/gen/IChunkGenerator;Lnet/minecraft/world/chunk/IChunkProvider;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0), remap = false)
	private static long redirect_forgeGetChunkSeedFromWorldSeed_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.forgeGetChunkSeedFromWorldSeed.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.forgeGetChunkSeedFromWorldSeed.nextLong();
		} else {
				com.minecrafttas.killtherng.KillTheRNG.commonRandom.forgeGetChunkSeedFromWorldSeed.nextLong();
				return rand.nextLong();
		}
	}

	/**
	* Generates values used for the chunk seed
	*/
	@Redirect(method = "generateWorld(IILnet/minecraft/world/World;Lnet/minecraft/world/gen/IChunkGenerator;Lnet/minecraft/world/chunk/IChunkProvider;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1), remap = false)
	private static long redirect_forgeGetChunkSeedFromWorldSeed_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.forgeGetChunkSeedFromWorldSeed.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.forgeGetChunkSeedFromWorldSeed.nextLong();
		} else {
				com.minecrafttas.killtherng.KillTheRNG.commonRandom.forgeGetChunkSeedFromWorldSeed.nextLong();
				return rand.nextLong();
		}
	}

	/**
	* Forge's system to set the chunk seed
	*/
	@Redirect(method = "generateWorld(IILnet/minecraft/world/World;Lnet/minecraft/world/gen/IChunkGenerator;Lnet/minecraft/world/chunk/IChunkProvider;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0), remap = false)
	private static void redirect_forgeSetChunkSeed_3(Random rand, long seed) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.forgeSetChunkSeed.isEnabled()) {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.forgeSetChunkSeed.setSeed(seed, true);		} else {
			rand.setSeed(seed);
		}
	}


}