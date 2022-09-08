package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.feature.WorldGenGlowStone1.class)
public class MixinWorldGenGlowStone1{

	/**
	* Glowstone Position and Count
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_glowstoneGen_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Glowstone Position and Count
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_glowstoneGen_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Glowstone Position and Count
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_glowstoneGen_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Glowstone Position and Count
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_glowstoneGen_4(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Glowstone Position and Count
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_glowstoneGen_5(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen.nextInt(i);
			return rand.nextInt(i);
		}
	}


}