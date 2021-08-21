package de.scribble.lp.killtherng.mixin.ktrng.patches;

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
	public boolean redirect_random_1658_1(Random rand) {
		return KillTheRNG.randomness.random_1658.nextBoolean();
//		KillTheRNG.randomness.random_1658.nextBoolean();
//		return rand.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1659_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1659.nextInt(i);
//		KillTheRNG.randomness.random_1659.nextInt(i);
//		return rand.nextInt(i);
	}

}
