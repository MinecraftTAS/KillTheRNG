package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureVillagePieces;

@Mixin(StructureVillagePieces.WoodHut.class)
public class MixinStructureVillagePieces$WoodHut {

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_random_1658_0(Random rand) {
		return KillTheRNG.randomness.random_1658.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1659_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1659.nextInt(i);
	}

}
