package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.feature.WorldGenBigMushroom.class)
public class MixinWorldGenBigMushroom{

	/**
	* Mushroom Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_mushroomGeneration_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomGeneration.nextBoolean();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomGeneration.nextBoolean();
			return rand.nextBoolean();
		}
	}

	/**
	* Mushroom Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_mushroomGeneration_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Mushroom Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_mushroomGeneration_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}


}