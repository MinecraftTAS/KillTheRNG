package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureStrongholdPieces;

@Mixin(StructureStrongholdPieces.Stronghold.class)
public class MixinStructureStrongholdPieces$Stronghold {

	/**
	* null
	*/
	@Redirect(method = "getRandomDoor(Ljava/util/Random;)Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$Door;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1723_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1723.nextInt(i);
//		KillTheRNG.randomness.random_1723.nextInt(i);
//		return rand.nextInt(i);
	}

}
