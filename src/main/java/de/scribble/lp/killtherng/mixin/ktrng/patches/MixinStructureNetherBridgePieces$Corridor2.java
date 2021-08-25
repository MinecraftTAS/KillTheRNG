package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureNetherBridgePieces;

@Mixin(StructureNetherBridgePieces.Corridor2.class)
public class MixinStructureNetherBridgePieces$Corridor2 {

	/**
	* Position, Rotation and Type of next Nether Bridge Piece
	*/
	@Redirect(method = "<init>(ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotTypeNetherBridge_1(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeNetherBridge.nextInt(i);
		KillTheRNG.randomness.posRotTypeNetherBridge.nextInt(i);
		return rand.nextInt(i);
	}

}
