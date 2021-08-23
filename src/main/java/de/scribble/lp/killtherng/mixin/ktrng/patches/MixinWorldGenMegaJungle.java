package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.feature.WorldGenMegaJungle;

@Mixin(WorldGenMegaJungle.class)
public class MixinWorldGenMegaJungle {

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_269_1(Random rand, int i) {
//		return KillTheRNG.randomness.random_269.nextInt(i);
		KillTheRNG.randomness.random_269.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_270_2(Random rand) {
//		return KillTheRNG.randomness.random_270.nextFloat();
		KillTheRNG.randomness.random_270.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_271_3(Random rand, int i) {
//		return KillTheRNG.randomness.random_271.nextInt(i);
		KillTheRNG.randomness.random_271.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_272_4(Random rand, int i) {
//		return KillTheRNG.randomness.random_272.nextInt(i);
		KillTheRNG.randomness.random_272.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "placeVine(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/properties/PropertyBool;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_273_5(Random rand, int i) {
//		return KillTheRNG.randomness.random_273.nextInt(i);
		KillTheRNG.randomness.random_273.nextInt(i);
		return rand.nextInt(i);
	}

}
