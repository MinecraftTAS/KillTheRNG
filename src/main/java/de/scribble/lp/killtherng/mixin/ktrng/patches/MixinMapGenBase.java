package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.MapGenBase;

@Mixin(MapGenBase.class)
public class MixinMapGenBase {

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1533_1(Random rand, long seed) {
		KillTheRNG.randomness.random_1533.setSeed(seed, true);
//		rand.setSeed(seed);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_random_1534_2(Random rand) {
		return KillTheRNG.randomness.random_1534.nextLong();
//		KillTheRNG.randomness.random_1534.nextLong();
//		return rand.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	public long redirect_random_1535_3(Random rand) {
		return KillTheRNG.randomness.random_1535.nextLong();
//		KillTheRNG.randomness.random_1535.nextLong();
//		return rand.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 1))
	public void redirect_random_1536_4(Random rand, long seed) {
		KillTheRNG.randomness.random_1536.setSeed(seed, true);
//		rand.setSeed(seed);
	}

	/**
	* null
	*/
	@Redirect(method = "setupChunkSeed(JLjava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	private static void redirect_random_1537_5(Random rand, long seed) {
		KillTheRNG.randomness.random_1537.setSeed(seed, true);
//		rand.setSeed(seed);
	}

	/**
	* null
	*/
	@Redirect(method = "setupChunkSeed(JLjava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	private static long redirect_random_1538_6(Random rand) {
		return KillTheRNG.randomness.random_1538.nextLong();
//		KillTheRNG.randomness.random_1538.nextLong();
//		return rand.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "setupChunkSeed(JLjava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	private static long redirect_random_1539_7(Random rand) {
		return KillTheRNG.randomness.random_1539.nextLong();
//		KillTheRNG.randomness.random_1539.nextLong();
//		return rand.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "setupChunkSeed(JLjava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 1))
	private static void redirect_random_1540_8(Random rand, long seed) {
		KillTheRNG.randomness.random_1540.setSeed(seed, true);
//		rand.setSeed(seed);
	}

}
