package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.feature.WorldGenMegaJungle.class)
public class MixinWorldGenMegaJungle{

	/**
	* Height of jungle tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_genMegaJungleHeight_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genMegaJungleHeight.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genMegaJungleHeight.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.genMegaJungleHeight.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Crown of jungle tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_genMegaJungleCrown_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genMegaJungleCrown.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genMegaJungleCrown.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.genMegaJungleCrown.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Height of jungle tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_genMegaJungleHeight_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genMegaJungleHeight.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genMegaJungleHeight.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.genMegaJungleHeight.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Crown of jungle tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_genMegaJungleCrown_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genMegaJungleCrown.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genMegaJungleCrown.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.genMegaJungleCrown.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* If a vine should be placed
	*/
	@Redirect(method = "placeVine(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/properties/PropertyBool;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_genMegaJungleVine_5(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genMegaJungleVine.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genMegaJungleVine.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.genMegaJungleVine.nextInt(i);
			return rand.nextInt(i);
		}
	}


}