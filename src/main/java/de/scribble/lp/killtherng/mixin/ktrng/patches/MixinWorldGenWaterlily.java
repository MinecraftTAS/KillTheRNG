package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.feature.WorldGenWaterlily.class)
public class MixinWorldGenWaterlily{

	/**
	* Lilypad Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_lilypadGeneration_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.lilypadGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.lilypadGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.lilypadGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Lilypad Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_lilypadGeneration_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.lilypadGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.lilypadGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.lilypadGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Lilypad Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_lilypadGeneration_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.lilypadGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.lilypadGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.lilypadGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Lilypad Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_lilypadGeneration_4(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.lilypadGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.lilypadGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.lilypadGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Lilypad Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_lilypadGeneration_5(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.lilypadGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.lilypadGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.lilypadGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Lilypad Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_lilypadGeneration_6(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.lilypadGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.lilypadGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.lilypadGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}


}