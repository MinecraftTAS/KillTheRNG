package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.MapGenStructure;

@Mixin(MapGenStructure.class)
public class MixinMapGenStructure {

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	public int redirect_random_1602_0(Random rand) {
		return KillTheRNG.randomness.random_1602.nextInt();
	}

	/**
	* null
	*/
	@Redirect(method = "findNearestStructurePosBySpacing(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/MapGenStructure;Lnet/minecraft/util/math/BlockPos;IIIZIZ)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1603_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1603.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findNearestStructurePosBySpacing(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/MapGenStructure;Lnet/minecraft/util/math/BlockPos;IIIZIZ)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_random_1604_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1604.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findNearestStructurePosBySpacing(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/MapGenStructure;Lnet/minecraft/util/math/BlockPos;IIIZIZ)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	private static int redirect_random_1605_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1605.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findNearestStructurePosBySpacing(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/MapGenStructure;Lnet/minecraft/util/math/BlockPos;IIIZIZ)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	private static int redirect_random_1606_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1606.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findNearestStructurePosBySpacing(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/MapGenStructure;Lnet/minecraft/util/math/BlockPos;IIIZIZ)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	private static int redirect_random_1607_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1607.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findNearestStructurePosBySpacing(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/MapGenStructure;Lnet/minecraft/util/math/BlockPos;IIIZIZ)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	private static int redirect_random_1608_5(Random rand, int i) {
		return KillTheRNG.randomness.random_1608.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findNearestStructurePosBySpacing(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/MapGenStructure;Lnet/minecraft/util/math/BlockPos;IIIZIZ)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 6))
	private static int redirect_random_1609_6(Random rand) {
		return KillTheRNG.randomness.random_1609.nextInt();
	}

}
