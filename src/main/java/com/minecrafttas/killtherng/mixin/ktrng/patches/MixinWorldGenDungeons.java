package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.feature.WorldGenDungeons.class)
public class MixinWorldGenDungeons{

	/**
	* Position for Dungeons
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_dungeonPos_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.dungeonPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.dungeonPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.dungeonPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position for Dungeons
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_dungeonPos_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.dungeonPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.dungeonPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.dungeonPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position for Dungeons
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_dungeonPos_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.dungeonPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.dungeonPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.dungeonPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position for Dungeons
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_dungeonPos_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.dungeonPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.dungeonPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.dungeonPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position for Dungeons
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_dungeonPos_5(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.dungeonPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.dungeonPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.dungeonPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position for Dungeons
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_dungeonPos_6(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.dungeonPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.dungeonPos.nextLong();
		} else {
				com.minecrafttas.killtherng.KillTheRNG.commonRandom.dungeonPos.nextLong();
				return rand.nextLong();
		}
	}


}