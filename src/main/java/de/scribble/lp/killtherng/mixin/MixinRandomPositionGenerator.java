package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.RandomPositionGenerator;

@Mixin(RandomPositionGenerator.class)
public class MixinRandomPositionGenerator {
	@Redirect(method = "generateRandomPos(Lnet/minecraft/entity/EntityCreature;IILnet/minecraft/util/math/Vec3d;Z)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1903(Random rand, int i) {
		return KillTheRNG.randomness.random_1903.nextInt(i);
	}

	@Redirect(method = "generateRandomPos(Lnet/minecraft/entity/EntityCreature;IILnet/minecraft/util/math/Vec3d;Z)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_random_1904(Random rand, int i) {
		return KillTheRNG.randomness.random_1904.nextInt(i);
	}

	@Redirect(method = "generateRandomPos(Lnet/minecraft/entity/EntityCreature;IILnet/minecraft/util/math/Vec3d;Z)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	private static int redirect_random_1905(Random rand, int i) {
		return KillTheRNG.randomness.random_1905.nextInt(i);
	}

	@Redirect(method = "generateRandomPos(Lnet/minecraft/entity/EntityCreature;IILnet/minecraft/util/math/Vec3d;Z)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	private static int redirect_random_1906(Random rand, int i) {
		return KillTheRNG.randomness.random_1906.nextInt(i);
	}

	@Redirect(method = "generateRandomPos(Lnet/minecraft/entity/EntityCreature;IILnet/minecraft/util/math/Vec3d;Z)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	private static int redirect_random_1907(Random rand, int i) {
		return KillTheRNG.randomness.random_1907.nextInt(i);
	}

	@Redirect(method = "generateRandomPos(Lnet/minecraft/entity/EntityCreature;IILnet/minecraft/util/math/Vec3d;Z)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	private static int redirect_random_1908(Random rand, int i) {
		return KillTheRNG.randomness.random_1908.nextInt(i);
	}

	@Redirect(method = "generateRandomPos(Lnet/minecraft/entity/EntityCreature;IILnet/minecraft/util/math/Vec3d;Z)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	private static int redirect_random_1909(Random rand, int i) {
		return KillTheRNG.randomness.random_1909.nextInt(i);
	}

}
