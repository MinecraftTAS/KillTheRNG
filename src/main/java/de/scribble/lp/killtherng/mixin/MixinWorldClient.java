package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.multiplayer.WorldClient;

@Mixin(WorldClient.class)
public class MixinWorldClient {

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/client/network/NetHandlerPlayClient;Lnet/minecraft/world/WorldSettings;ILnet/minecraft/world/EnumDifficulty;Lnet/minecraft/profiler/Profiler;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_7_0(Random rand, int i) {
		return KillTheRNG.randomness.random_7.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "playMoodSoundAndCheckLight(IILnet/minecraft/world/chunk/Chunk;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_8_0(Random rand, int i) {
		return KillTheRNG.randomness.random_8.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "playMoodSoundAndCheckLight(IILnet/minecraft/world/chunk/Chunk;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_9_1(Random rand) {
		return KillTheRNG.randomness.random_9.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playMoodSoundAndCheckLight(IILnet/minecraft/world/chunk/Chunk;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_10_2(Random rand, int i) {
		return KillTheRNG.randomness.random_10.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "showBarrierParticles(IIIILjava/util/Random;ZLnet/minecraft/util/math/BlockPos$MutableBlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_11_0(Random rand, int i) {
		return KillTheRNG.randomness.random_11.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "showBarrierParticles(IIIILjava/util/Random;ZLnet/minecraft/util/math/BlockPos$MutableBlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_12_1(Random rand, int i) {
		return KillTheRNG.randomness.random_12.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "showBarrierParticles(IIIILjava/util/Random;ZLnet/minecraft/util/math/BlockPos$MutableBlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_13_2(Random rand, int i) {
		return KillTheRNG.randomness.random_13.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "showBarrierParticles(IIIILjava/util/Random;ZLnet/minecraft/util/math/BlockPos$MutableBlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_14_3(Random rand, int i) {
		return KillTheRNG.randomness.random_14.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "showBarrierParticles(IIIILjava/util/Random;ZLnet/minecraft/util/math/BlockPos$MutableBlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_15_4(Random rand, int i) {
		return KillTheRNG.randomness.random_15.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "showBarrierParticles(IIIILjava/util/Random;ZLnet/minecraft/util/math/BlockPos$MutableBlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_16_5(Random rand, int i) {
		return KillTheRNG.randomness.random_16.nextInt(i);
	}

}
