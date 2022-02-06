package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureOceanMonument;

@Mixin(StructureOceanMonument.StartMonument.class)
public class MixinStructureOceanMonument$StartMonument {

	/**
	* Position, Rotation and Type of next Ocean Monument Piece
	*/
	@Redirect(method = "create(Lnet/minecraft/world/World;Ljava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_posRotTypeOceanMonument_1(Random rand, long seed) {
		KillTheRNG.randomness.posRotTypeOceanMonument.setSeed(seed, true);
		rand.setSeed(seed);
	}

	/**
	* Position, Rotation and Type of next Ocean Monument Piece
	*/
	@Redirect(method = "create(Lnet/minecraft/world/World;Ljava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_posRotTypeOceanMonument_2(Random rand) {
//		return KillTheRNG.randomness.posRotTypeOceanMonument.nextLong();
		KillTheRNG.randomness.posRotTypeOceanMonument.nextLong();
		return rand.nextLong();
	}

	/**
	* Position, Rotation and Type of next Ocean Monument Piece
	*/
	@Redirect(method = "create(Lnet/minecraft/world/World;Ljava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	public long redirect_posRotTypeOceanMonument_3(Random rand) {
//		return KillTheRNG.randomness.posRotTypeOceanMonument.nextLong();
		KillTheRNG.randomness.posRotTypeOceanMonument.nextLong();
		return rand.nextLong();
	}

	/**
	* Position, Rotation and Type of next Ocean Monument Piece
	*/
	@Redirect(method = "create(Lnet/minecraft/world/World;Ljava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 1))
	public void redirect_posRotTypeOceanMonument_4(Random rand, long seed) {
		KillTheRNG.randomness.posRotTypeOceanMonument.setSeed(seed, true);
		rand.setSeed(seed);
	}

}