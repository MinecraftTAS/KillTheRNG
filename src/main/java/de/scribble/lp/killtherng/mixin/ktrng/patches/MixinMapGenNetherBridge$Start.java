package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.MapGenNetherBridge.Start.class)
public class MixinMapGenNetherBridge$Start{

	/**
	* Position of the Nether Bridge Beginning
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;Ljava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posNetherBridge_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posNetherBridge.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posNetherBridge.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posNetherBridge.nextInt(i);
			return rand.nextInt(i);
		}
	}


}