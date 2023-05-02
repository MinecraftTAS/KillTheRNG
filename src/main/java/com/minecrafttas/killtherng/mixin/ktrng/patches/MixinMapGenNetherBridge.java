package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.MapGenNetherBridge.class)
public class MixinMapGenNetherBridge{

	/**
	* Nether Brige Spawn Position
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_netherBridgeSpawnPos_1(Random rand, long seed) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherBridgeSpawnPos.isEnabled()) {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherBridgeSpawnPos.setSeed(seed, true);		} else {
			rand.setSeed(seed);
		}
	}

	/**
	* Nether Brige Spawn Position
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	public int redirect_netherBridgeSpawnPos_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherBridgeSpawnPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherBridgeSpawnPos.nextInt();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherBridgeSpawnPos.nextInt();
			return rand.nextInt();
		}
	}

	/**
	* Nether Brige Spawn Position
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_netherBridgeSpawnPos_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherBridgeSpawnPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherBridgeSpawnPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherBridgeSpawnPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether Brige Spawn Position
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_netherBridgeSpawnPos_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherBridgeSpawnPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherBridgeSpawnPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherBridgeSpawnPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether Brige Spawn Position
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_netherBridgeSpawnPos_5(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherBridgeSpawnPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherBridgeSpawnPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherBridgeSpawnPos.nextInt(i);
			return rand.nextInt(i);
		}
	}


}