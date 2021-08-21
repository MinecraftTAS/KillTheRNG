package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureNetherBridgePieces;

@Mixin(StructureNetherBridgePieces.Corridor.class)
public class MixinStructureNetherBridgePieces$Corridor {

	/**
	* null
	*/
	@Redirect(method = "<init>(ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1713_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1713.nextInt(i);
//		KillTheRNG.randomness.random_1713.nextInt(i);
//		return rand.nextInt(i);
	}

}
