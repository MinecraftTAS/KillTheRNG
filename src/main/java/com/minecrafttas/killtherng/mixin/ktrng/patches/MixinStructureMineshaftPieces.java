package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.StructureMineshaftPieces.class)
public class MixinStructureMineshaftPieces{

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "createRandomShaftPiece(Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;ILnet/minecraft/world/gen/structure/MapGenMineshaft$Type;)Lnet/minecraft/world/gen/structure/StructureMineshaftPieces$Peice;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_posRotTypeMineshaft_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeMineshaft.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeMineshaft.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeMineshaft.nextInt(i);
			return rand.nextInt(i);
		}
	}


}