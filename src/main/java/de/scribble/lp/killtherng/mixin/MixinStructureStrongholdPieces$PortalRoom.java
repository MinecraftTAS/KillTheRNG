package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureStrongholdPieces;

@Mixin(StructureStrongholdPieces.PortalRoom.class)
public class MixinStructureStrongholdPieces$PortalRoom {

	/**
	* null
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1731_0(Random rand) {
		return KillTheRNG.randomness.random_1731.nextFloat();
	}

}
