package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.RandomPositionGenerator;

@Mixin(RandomPositionGenerator.class)
public class MixinRandomPositionGenerator {

	/**
	* Random for determining the coordinates of an entity, used by AI tasks
	*/
	@Redirect(method = "generateRandomPos(Lnet/minecraft/entity/EntityCreature;IILnet/minecraft/util/math/Vec3d;Z)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_randomPositionGenerator_1(Random rand, int i) {
		return KillTheRNG.randomness.randomPositionGenerator.nextInt(i);
//		KillTheRNG.randomness.randomPositionGenerator.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Random for determining the coordinates of an entity, used by AI tasks
	*/
	@Redirect(method = "generateRandomPos(Lnet/minecraft/entity/EntityCreature;IILnet/minecraft/util/math/Vec3d;Z)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_randomPositionGenerator_2(Random rand, int i) {
		return KillTheRNG.randomness.randomPositionGenerator.nextInt(i);
//		KillTheRNG.randomness.randomPositionGenerator.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Random for determining the coordinates of an entity, used by AI tasks
	*/
	@Redirect(method = "generateRandomPos(Lnet/minecraft/entity/EntityCreature;IILnet/minecraft/util/math/Vec3d;Z)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	private static int redirect_randomPositionGenerator_3(Random rand, int i) {
		return KillTheRNG.randomness.randomPositionGenerator.nextInt(i);
//		KillTheRNG.randomness.randomPositionGenerator.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Random for determining the coordinates of an entity, used by AI tasks
	*/
	@Redirect(method = "generateRandomPos(Lnet/minecraft/entity/EntityCreature;IILnet/minecraft/util/math/Vec3d;Z)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	private static int redirect_randomPositionGenerator_4(Random rand, int i) {
		return KillTheRNG.randomness.randomPositionGenerator.nextInt(i);
//		KillTheRNG.randomness.randomPositionGenerator.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Random for determining the coordinates of an entity, used by AI tasks
	*/
	@Redirect(method = "generateRandomPos(Lnet/minecraft/entity/EntityCreature;IILnet/minecraft/util/math/Vec3d;Z)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	private static int redirect_randomPositionGenerator_5(Random rand, int i) {
		return KillTheRNG.randomness.randomPositionGenerator.nextInt(i);
//		KillTheRNG.randomness.randomPositionGenerator.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Random for determining the coordinates of an entity, used by AI tasks
	*/
	@Redirect(method = "generateRandomPos(Lnet/minecraft/entity/EntityCreature;IILnet/minecraft/util/math/Vec3d;Z)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	private static int redirect_randomPositionGenerator_6(Random rand, int i) {
		return KillTheRNG.randomness.randomPositionGenerator.nextInt(i);
//		KillTheRNG.randomness.randomPositionGenerator.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Random for determining the coordinates of an entity, used by AI tasks
	*/
	@Redirect(method = "generateRandomPos(Lnet/minecraft/entity/EntityCreature;IILnet/minecraft/util/math/Vec3d;Z)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	private static int redirect_randomPositionGenerator_7(Random rand, int i) {
		return KillTheRNG.randomness.randomPositionGenerator.nextInt(i);
//		KillTheRNG.randomness.randomPositionGenerator.nextInt(i);
//		return rand.nextInt(i);
	}

}
