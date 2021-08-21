package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;

@Mixin(targets="net.minecraft.world.gen.structure.WoodlandMansionPieces$Grid")
public class MixinWoodlandMansionPieces$Grid {

	/**
	* null
	*/
	@Redirect(method = "recursiveCorridor(Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$SimpleGrid;IILnet/minecraft/util/EnumFacing;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1949_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1949.nextInt(i);
//		KillTheRNG.randomness.random_1949.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveCorridor(Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$SimpleGrid;IILnet/minecraft/util/EnumFacing;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_random_1950_2(Random rand) {
		return KillTheRNG.randomness.random_1950.nextBoolean();
//		KillTheRNG.randomness.random_1950.nextBoolean();
//		return rand.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "setupThirdFloor()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1951_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1951.nextInt(i);
//		KillTheRNG.randomness.random_1951.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "setupThirdFloor()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1952_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1952.nextInt(i);
//		KillTheRNG.randomness.random_1952.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "identifyRooms(Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$SimpleGrid;Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$SimpleGrid;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_random_1953_5(Random rand) {
		return KillTheRNG.randomness.random_1953.nextBoolean();
//		KillTheRNG.randomness.random_1953.nextBoolean();
//		return rand.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "identifyRooms(Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$SimpleGrid;Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$SimpleGrid;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_random_1954_6(Random rand) {
		return KillTheRNG.randomness.random_1954.nextBoolean();
//		KillTheRNG.randomness.random_1954.nextBoolean();
//		return rand.nextBoolean();
	}

}
