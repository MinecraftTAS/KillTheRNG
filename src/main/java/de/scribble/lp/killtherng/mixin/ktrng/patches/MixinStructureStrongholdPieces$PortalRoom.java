package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.StructureStrongholdPieces.PortalRoom.class)
public class MixinStructureStrongholdPieces$PortalRoom{

	/**
	* Position, Rotation and Type of next Stronghold Piece
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_posRotTypeStronghold_1(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeStronghold.nextFloat();
		de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeStronghold.nextFloat();
		return rand.nextFloat();
	}


}