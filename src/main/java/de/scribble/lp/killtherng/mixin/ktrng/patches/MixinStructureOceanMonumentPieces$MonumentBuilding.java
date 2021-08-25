package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureOceanMonumentPieces;

@Mixin(StructureOceanMonumentPieces.MonumentBuilding.class)
public class MixinStructureOceanMonumentPieces$MonumentBuilding {

	/**
	* Position, Rotation and Type of next Ocean Monument Piece
	*/
	@Redirect(method = "<init>(Ljava/util/Random;IILnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	public int redirect_posRotTypeOceanMonument_1(Random rand) {
//		return KillTheRNG.randomness.posRotTypeOceanMonument.nextInt();
		KillTheRNG.randomness.posRotTypeOceanMonument.nextInt();
		return rand.nextInt();
	}

	/**
	* Position, Rotation and Type of next Ocean Monument Piece
	*/
	@Redirect(method = "generateRoomGraph(Ljava/util/Random;)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotTypeOceanMonument_2(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeOceanMonument.nextInt(i);
		KillTheRNG.randomness.posRotTypeOceanMonument.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Ocean Monument Piece
	*/
	@Redirect(method = "generateRoomGraph(Ljava/util/Random;)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_posRotTypeOceanMonument_3(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeOceanMonument.nextInt(i);
		KillTheRNG.randomness.posRotTypeOceanMonument.nextInt(i);
		return rand.nextInt(i);
	}

}
