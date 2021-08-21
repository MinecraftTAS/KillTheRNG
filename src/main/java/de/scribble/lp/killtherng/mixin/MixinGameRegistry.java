package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mixin(GameRegistry.class)
public class MixinGameRegistry {

	/**
	* null
	*/
	@Redirect(method = "generateWorld(IILnet/minecraft/world/World;Lnet/minecraft/world/gen/IChunkGenerator;Lnet/minecraft/world/chunk/IChunkProvider;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0), remap=false)
	private static long redirect_random_213_0(Random rand) {
		return KillTheRNG.randomness.random_213.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "generateWorld(IILnet/minecraft/world/World;Lnet/minecraft/world/gen/IChunkGenerator;Lnet/minecraft/world/chunk/IChunkProvider;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1), remap=false)
	private static long redirect_random_214_1(Random rand) {
		return KillTheRNG.randomness.random_214.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "generateWorld(IILnet/minecraft/world/World;Lnet/minecraft/world/gen/IChunkGenerator;Lnet/minecraft/world/chunk/IChunkProvider;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 2), remap=false)
	private static void redirect_random_215_2(Random rand, long unused) {
	}

}
