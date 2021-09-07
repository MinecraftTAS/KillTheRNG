package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.feature.WorldGenLakes;

@Mixin(WorldGenLakes.class)
public class MixinWorldGenLakes {

	/**
	* Lake Plane for Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_lakePlaneGen_1(Random rand, int i) {
//		return KillTheRNG.randomness.lakePlaneGen.nextInt(i);
		KillTheRNG.randomness.lakePlaneGen.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Lake Plane for Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_lakePlaneGen_2(Random rand) {
//		return KillTheRNG.randomness.lakePlaneGen.nextDouble();
		KillTheRNG.randomness.lakePlaneGen.nextDouble();
		return rand.nextDouble();
	}

	/**
	* Lake Plane for Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_lakePlaneGen_3(Random rand) {
//		return KillTheRNG.randomness.lakePlaneGen.nextDouble();
		KillTheRNG.randomness.lakePlaneGen.nextDouble();
		return rand.nextDouble();
	}

	/**
	* Lake Plane for Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_lakePlaneGen_4(Random rand) {
//		return KillTheRNG.randomness.lakePlaneGen.nextDouble();
		KillTheRNG.randomness.lakePlaneGen.nextDouble();
		return rand.nextDouble();
	}

	/**
	* Lake Plane for Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_lakePlaneGen_5(Random rand) {
//		return KillTheRNG.randomness.lakePlaneGen.nextDouble();
		KillTheRNG.randomness.lakePlaneGen.nextDouble();
		return rand.nextDouble();
	}

	/**
	* Lake Plane for Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_lakePlaneGen_6(Random rand) {
//		return KillTheRNG.randomness.lakePlaneGen.nextDouble();
		KillTheRNG.randomness.lakePlaneGen.nextDouble();
		return rand.nextDouble();
	}

	/**
	* Lake Plane for Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_lakePlaneGen_7(Random rand) {
//		return KillTheRNG.randomness.lakePlaneGen.nextDouble();
		KillTheRNG.randomness.lakePlaneGen.nextDouble();
		return rand.nextDouble();
	}

	/**
	* Lake Plane for Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_lakePlaneGen_8(Random rand, int i) {
//		return KillTheRNG.randomness.lakePlaneGen.nextInt(i);
		KillTheRNG.randomness.lakePlaneGen.nextInt(i);
		return rand.nextInt(i);
	}

}
