package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.feature.WorldGenDeadBush.class)
public class MixinWorldGenDeadBush{

	/**
	* Dead Bush Position when being generated
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_deadBushPosition_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.deadBushPosition.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.deadBushPosition.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.deadBushPosition.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Dead Bush Position when being generated
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_deadBushPosition_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.deadBushPosition.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.deadBushPosition.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.deadBushPosition.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Dead Bush Position when being generated
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_deadBushPosition_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.deadBushPosition.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.deadBushPosition.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.deadBushPosition.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Dead Bush Position when being generated
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_deadBushPosition_4(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.deadBushPosition.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.deadBushPosition.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.deadBushPosition.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Dead Bush Position when being generated
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_deadBushPosition_5(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.deadBushPosition.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.deadBushPosition.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.deadBushPosition.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Dead Bush Position when being generated
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_deadBushPosition_6(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.deadBushPosition.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.deadBushPosition.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.deadBushPosition.nextInt(i);
			return rand.nextInt(i);
		}
	}


}