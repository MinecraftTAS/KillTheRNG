package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.multiplayer.WorldClient.class)
public class MixinWorldClient{

	/**
	* Ticks after joining a new world, when the ambient sound should play
	*/
	@Redirect(method = "<init>(Lnet/minecraft/client/network/NetHandlerPlayClient;Lnet/minecraft/world/WorldSettings;ILnet/minecraft/world/EnumDifficulty;Lnet/minecraft/profiler/Profiler;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_ambienceTicks_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.ambienceTicks.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.ambienceTicks.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.ambienceTicks.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Maximal Light level for ambient sounds to play
	*/
	@Redirect(method = "playMoodSoundAndCheckLight(IILnet/minecraft/world/chunk/Chunk;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_ambienceLightLevel_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.ambienceLightLevel.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.ambienceLightLevel.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.ambienceLightLevel.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Volume of an ambient sounds from 0 to 0.2
	*/
	@Redirect(method = "playMoodSoundAndCheckLight(IILnet/minecraft/world/chunk/Chunk;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_ambienceVolume_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.ambienceVolume.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.ambienceVolume.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.ambienceVolume.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Ticks after joining a new world, when the ambient sound should play
	*/
	@Redirect(method = "playMoodSoundAndCheckLight(IILnet/minecraft/world/chunk/Chunk;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_ambienceTicks_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.ambienceTicks.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.ambienceTicks.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.ambienceTicks.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Random Offset of Barrier Particles
	*/
	@Redirect(method = "showBarrierParticles(IIIILjava/util/Random;ZLnet/minecraft/util/math/BlockPos$MutableBlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_barrierParticlePosition_5(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.barrierParticlePosition.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.barrierParticlePosition.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.barrierParticlePosition.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Random Offset of Barrier Particles
	*/
	@Redirect(method = "showBarrierParticles(IIIILjava/util/Random;ZLnet/minecraft/util/math/BlockPos$MutableBlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_barrierParticlePosition_6(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.barrierParticlePosition.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.barrierParticlePosition.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.barrierParticlePosition.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Random Offset of Barrier Particles
	*/
	@Redirect(method = "showBarrierParticles(IIIILjava/util/Random;ZLnet/minecraft/util/math/BlockPos$MutableBlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_barrierParticlePosition_7(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.barrierParticlePosition.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.barrierParticlePosition.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.barrierParticlePosition.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Random Offset of Barrier Particles
	*/
	@Redirect(method = "showBarrierParticles(IIIILjava/util/Random;ZLnet/minecraft/util/math/BlockPos$MutableBlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_barrierParticlePosition_8(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.barrierParticlePosition.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.barrierParticlePosition.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.barrierParticlePosition.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Random Offset of Barrier Particles
	*/
	@Redirect(method = "showBarrierParticles(IIIILjava/util/Random;ZLnet/minecraft/util/math/BlockPos$MutableBlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_barrierParticlePosition_9(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.barrierParticlePosition.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.barrierParticlePosition.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.barrierParticlePosition.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Random Offset of Barrier Particles
	*/
	@Redirect(method = "showBarrierParticles(IIIILjava/util/Random;ZLnet/minecraft/util/math/BlockPos$MutableBlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_barrierParticlePosition_10(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.barrierParticlePosition.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.barrierParticlePosition.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.barrierParticlePosition.nextInt(i);
			return rand.nextInt(i);
		}
	}


}