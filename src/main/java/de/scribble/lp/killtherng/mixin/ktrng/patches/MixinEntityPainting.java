package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.item.EntityPainting.class)
public class MixinEntityPainting{

	/**
	* Which art will be displayed
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_paintingDisplay_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.paintingDisplay.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.paintingDisplay.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.paintingDisplay.nextInt(i);
			return rand.nextInt(i);
		}
	}


}