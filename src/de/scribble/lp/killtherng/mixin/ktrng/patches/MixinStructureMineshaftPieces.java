package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureMineshaftPieces;

@Mixin(StructureMineshaftPieces.class)
public class MixinStructureMineshaftPieces {

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "createRandomShaftPiece(Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;ILnet/minecraft/world/gen/structure/MapGenMineshaft$Type;)Lnet/minecraft/world/gen/structure/StructureMineshaftPieces$Peice;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_posRotTypeMineshaft_1(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

}
