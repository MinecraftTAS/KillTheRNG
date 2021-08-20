package de.scribble.lp.killtherng.mixin;

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
	public int redirect_random_269_0(Random rand, int i) {
		return KillTheRNG.randomness.random_269.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_270_1(Random rand) {
		return KillTheRNG.randomness.random_270.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_271_2(Random rand, int i) {
		return KillTheRNG.randomness.random_271.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_272_3(Random rand, int i) {
		return KillTheRNG.randomness.random_272.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "placeVine(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/properties/PropertyBool;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_273_0(Random rand, int i) {
		return KillTheRNG.randomness.random_273.nextInt(i);
	}

}
