package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureStrongholdPieces;

@Mixin(StructureStrongholdPieces.class)
public class MixinStructureStrongholdPieces {

	/**
	* Position, Rotation and Type of next Stronghold Piece
	*/
	@Redirect(method = "generatePieceFromSmallDoor(Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;I)Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_posRotTypeStronghold_1(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeStronghold.nextInt(i);
		KillTheRNG.randomness.posRotTypeStronghold.nextInt(i);
		return rand.nextInt(i);
	}

}
