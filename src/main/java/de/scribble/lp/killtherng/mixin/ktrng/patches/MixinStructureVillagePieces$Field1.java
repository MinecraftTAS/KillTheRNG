package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureVillagePieces;

@Mixin(StructureVillagePieces.Field1.class)
public class MixinStructureVillagePieces$Field1 {

	/**
	* null
	*/
	@Redirect(method = "getRandomCropType(Ljava/util/Random;)Lnet/minecraft/block/Block;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1660_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1660.nextInt(i);
//		KillTheRNG.randomness.random_1660.nextInt(i);
//		return rand.nextInt(i);
	}

}
