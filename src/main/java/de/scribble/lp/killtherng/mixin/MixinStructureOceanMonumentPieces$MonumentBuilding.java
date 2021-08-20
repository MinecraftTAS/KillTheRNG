package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureOceanMonumentPieces;

@Mixin(StructureOceanMonumentPieces.MonumentBuilding.class)
public class MixinStructureOceanMonumentPieces$MonumentBuilding {

	/**
	* null
	*/
	@Redirect(method = "<init>(Ljava/util/Random;IILnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	public int redirect_random_1737_0(Random rand) {
		return KillTheRNG.randomness.random_1737.nextInt();
	}

	/**
	* null
	*/
	@Redirect(method = "generateRoomGraph(Ljava/util/Random;)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1738_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1738.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generateRoomGraph(Ljava/util/Random;)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1739_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1739.nextInt(i);
	}

}
