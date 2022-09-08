package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.MapGenBase.class)
public class MixinMapGenBase{

	/**
	* Basic World Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_worldGeneration_1(Random rand, long seed) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.worldGeneration.isEnabled()) {
			de.scribble.lp.killtherng.KillTheRNG.randomness.worldGeneration.setSeed(seed, true);		} else {
			rand.setSeed(seed);
		}
	}

	/**
	* Basic World Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_worldGeneration_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.worldGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.worldGeneration.nextLong();
		} else {
				de.scribble.lp.killtherng.KillTheRNG.randomness.worldGeneration.nextLong();
				return rand.nextLong();
		}
	}

	/**
	* Basic World Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	public long redirect_worldGeneration_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.worldGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.worldGeneration.nextLong();
		} else {
				de.scribble.lp.killtherng.KillTheRNG.randomness.worldGeneration.nextLong();
				return rand.nextLong();
		}
	}

	/**
	* Basic World Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 1))
	public void redirect_worldGeneration_4(Random rand, long seed) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.worldGeneration.isEnabled()) {
			de.scribble.lp.killtherng.KillTheRNG.randomness.worldGeneration.setSeed(seed, true);		} else {
			rand.setSeed(seed);
		}
	}

	/**
	* Modifies the world seed
	*/
	@Redirect(method = "setupChunkSeed(JLjava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	private static void redirect_worldSeedManip_5(Random rand, long seed) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.worldSeedManip.isEnabled()) {
			de.scribble.lp.killtherng.KillTheRNG.randomness.worldSeedManip.setSeed(seed, true);		} else {
			rand.setSeed(seed);
		}
	}

	/**
	* Modifies the world seed
	*/
	@Redirect(method = "setupChunkSeed(JLjava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	private static long redirect_worldSeedManip_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.worldSeedManip.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.worldSeedManip.nextLong();
		} else {
				de.scribble.lp.killtherng.KillTheRNG.randomness.worldSeedManip.nextLong();
				return rand.nextLong();
		}
	}

	/**
	* Modifies the world seed
	*/
	@Redirect(method = "setupChunkSeed(JLjava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	private static long redirect_worldSeedManip_7(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.worldSeedManip.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.worldSeedManip.nextLong();
		} else {
				de.scribble.lp.killtherng.KillTheRNG.randomness.worldSeedManip.nextLong();
				return rand.nextLong();
		}
	}

	/**
	* Modifies the world seed
	*/
	@Redirect(method = "setupChunkSeed(JLjava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 1))
	private static void redirect_worldSeedManip_8(Random rand, long seed) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.worldSeedManip.isEnabled()) {
			de.scribble.lp.killtherng.KillTheRNG.randomness.worldSeedManip.setSeed(seed, true);		} else {
			rand.setSeed(seed);
		}
	}


}