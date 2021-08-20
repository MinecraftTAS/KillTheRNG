package de.scribble.lp.killtherng.mixin;

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
	public void redirect_random_1533_0(Random rand, long unused) {
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	public long redirect_random_1534_1(Random rand) {
		return KillTheRNG.randomness.random_1534.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 2))
	public long redirect_random_1535_2(Random rand) {
		return KillTheRNG.randomness.random_1535.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 3))
	public void redirect_random_1536_3(Random rand, long unused) {
	}

	/**
	* null
	*/
	@Redirect(method = "setupChunkSeed(JLjava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	private static void redirect_random_1537_0(Random rand, long unused) {
	}

	/**
	* null
	*/
	@Redirect(method = "setupChunkSeed(JLjava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	private static long redirect_random_1538_1(Random rand) {
		return KillTheRNG.randomness.random_1538.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "setupChunkSeed(JLjava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 2))
	private static long redirect_random_1539_2(Random rand) {
		return KillTheRNG.randomness.random_1539.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "setupChunkSeed(JLjava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 3))
	private static void redirect_random_1540_3(Random rand, long unused) {
	}

}
