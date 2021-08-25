package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureOceanMonumentPieces;

@Mixin(StructureOceanMonumentPieces.SimpleTopRoom.class)
public class MixinStructureOceanMonumentPieces$SimpleTopRoom {

	/**
	* Position, Rotation and Type of next Ocean Monument Piece
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotTypeOceanMonument_1(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeOceanMonument.nextInt(i);
		KillTheRNG.randomness.posRotTypeOceanMonument.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Ocean Monument Piece
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_posRotTypeOceanMonument_2(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeOceanMonument.nextInt(i);
		KillTheRNG.randomness.posRotTypeOceanMonument.nextInt(i);
		return rand.nextInt(i);
	}

}
