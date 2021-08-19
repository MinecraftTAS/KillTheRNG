package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.model.ModelGhast;

@Mixin(ModelGhast.class)
public class MixinModelGhast {
	@Redirect(method = "<init>()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1378(Random rand, int i) {
		return KillTheRNG.randomness.random_1378.nextInt(i);
	}

}
