package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.MapGenStronghold;

@Mixin(MapGenStronghold.Start.class)
public class MixinMapGenStronghold$Start {

	/**
	* Position of the Stronghold
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;Ljava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotStronghold_1(Random rand, int i) {
//		return KillTheRNG.randomness.posRotStronghold.nextInt(i);
		KillTheRNG.randomness.posRotStronghold.nextInt(i);
		return rand.nextInt(i);
	}

}