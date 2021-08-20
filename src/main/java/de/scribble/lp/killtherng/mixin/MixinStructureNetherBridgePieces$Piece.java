package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;

@Mixin(targets="net.minecraft.world.gen.structure.StructureNetherBridgePieces$Piece")
public class MixinStructureNetherBridgePieces$Piece {

	/**
	* null
	*/
	@Redirect(method = "generatePiece(Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Start;Ljava/util/List;Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;I)Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1711_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1711.nextInt(i);
	}

}
