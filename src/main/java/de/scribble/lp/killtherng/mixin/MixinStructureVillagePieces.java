package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureVillagePieces;

@Mixin(StructureVillagePieces.class)
public class MixinStructureVillagePieces {

	/**
	* null
	*/
	@Redirect(method = "generateComponent(Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;I)Lnet/minecraft/world/gen/structure/StructureVillagePieces$Village;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1656_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1656.nextInt(i);
	}

}
