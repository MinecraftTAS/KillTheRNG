package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.feature.WorldGenGlowStone2.class)
public class MixinWorldGenGlowStone2{

	/**
	* Glowstone Position and Count
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_glowstoneGen2_1(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen2.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen2.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Glowstone Position and Count
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_glowstoneGen2_2(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen2.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen2.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Glowstone Position and Count
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_glowstoneGen2_3(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen2.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen2.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Glowstone Position and Count
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_glowstoneGen2_4(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen2.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen2.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Glowstone Position and Count
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_glowstoneGen2_5(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen2.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.glowstoneGen2.nextInt(i);
		return rand.nextInt(i);
	}


}