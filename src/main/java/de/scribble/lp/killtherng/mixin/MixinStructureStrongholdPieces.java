package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureStrongholdPieces;

@Mixin(StructureStrongholdPieces.class)
public class MixinStructureStrongholdPieces {

	/**
	* null
	*/
	@Redirect(method = "generatePieceFromSmallDoor(Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;I)Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1722_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1722.nextInt(i);
	}

}
