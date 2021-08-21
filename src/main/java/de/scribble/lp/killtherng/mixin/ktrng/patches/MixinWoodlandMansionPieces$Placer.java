package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;

@Mixin(targets="net.minecraft.world.gen.structure.WoodlandMansionPieces$Placer")
public class MixinWoodlandMansionPieces$Placer {

	/**
	* null
	*/
	@Redirect(method = "createMansion(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/Rotation;Ljava/util/List;Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$Grid;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1955_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1955.nextInt(i);
//		KillTheRNG.randomness.random_1955.nextInt(i);
//		return rand.nextInt(i);
	}

}
