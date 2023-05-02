package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.WoodlandMansion.Start.class)
public class MixinWoodlandMansion$Start{

	/**
	* Type and Direction of Woodland Mansion Pieces
	*/
	@Redirect(method = "create(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/ChunkGeneratorOverworld;Ljava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_woodlandMansionRng_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.woodlandMansionRng.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.woodlandMansionRng.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.woodlandMansionRng.nextInt(i);
			return rand.nextInt(i);
		}
	}


}