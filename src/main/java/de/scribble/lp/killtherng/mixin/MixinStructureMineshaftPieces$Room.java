package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureMineshaftPieces;

@Mixin(StructureMineshaftPieces.Room.class)
public class MixinStructureMineshaftPieces$Room {

	/**
	* null
	*/
	@Redirect(method = "<init>(ILjava/util/Random;IILnet/minecraft/world/gen/structure/MapGenMineshaft$Type;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1700_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1700.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(ILjava/util/Random;IILnet/minecraft/world/gen/structure/MapGenMineshaft$Type;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1701_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1701.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(ILjava/util/Random;IILnet/minecraft/world/gen/structure/MapGenMineshaft$Type;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1702_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1702.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1703_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1703.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1704_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1704.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1705_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1705.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1706_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1706.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1707_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1707.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1708_5(Random rand, int i) {
		return KillTheRNG.randomness.random_1708.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_random_1709_6(Random rand, int i) {
		return KillTheRNG.randomness.random_1709.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_1710_7(Random rand, int i) {
		return KillTheRNG.randomness.random_1710.nextInt(i);
	}

}