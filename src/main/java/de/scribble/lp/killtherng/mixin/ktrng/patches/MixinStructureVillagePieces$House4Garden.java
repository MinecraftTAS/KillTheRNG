package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureVillagePieces;

@Mixin(StructureVillagePieces.House4Garden.class)
public class MixinStructureVillagePieces$House4Garden {

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_random_1657_1(Random rand) {
		return KillTheRNG.randomness.random_1657.nextBoolean();
//		KillTheRNG.randomness.random_1657.nextBoolean();
//		return rand.nextBoolean();
	}

}
