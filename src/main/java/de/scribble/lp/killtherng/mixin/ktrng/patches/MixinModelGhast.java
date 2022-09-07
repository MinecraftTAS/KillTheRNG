package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.model.ModelGhast;

@Mixin(ModelGhast.class)
public class MixinModelGhast {

	/**
	* Length of a ghasts tentacles
	*/
	@Redirect(method = "<init>()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_modelGhast_1(Random rand, int i) {
		return KillTheRNG.randomness.modelGhast.nextInt(i);
//		KillTheRNG.randomness.modelGhast.nextInt(i);
//		return rand.nextInt(i);
	}

}
