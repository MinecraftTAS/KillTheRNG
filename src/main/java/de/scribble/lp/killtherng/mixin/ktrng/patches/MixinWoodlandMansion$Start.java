package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.WoodlandMansion;

@Mixin(WoodlandMansion.Start.class)
public class MixinWoodlandMansion$Start {

	/**
	* Type and Direction of Woodland Mansion Pieces
	*/
	@Redirect(method = "create(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/ChunkGeneratorOverworld;Ljava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_woodlandMansionRng_1(Random rand, int i) {
//		return KillTheRNG.randomness.woodlandMansionRng.nextInt(i);
		KillTheRNG.randomness.woodlandMansionRng.nextInt(i);
		return rand.nextInt(i);
	}

}
