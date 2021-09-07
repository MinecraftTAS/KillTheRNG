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
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;Ljava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1628_1(Random rand, int i) {
//		return KillTheRNG.randomness.random_1628.nextInt(i);
		KillTheRNG.randomness.random_1628.nextInt(i);
		return rand.nextInt(i);
	}

}
