package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.monster.EntitySpider.GroupData.class)
public class MixinEntitySpider$GroupData{

	/**
	* Random effect from a spider, when spawning naturally
	*/
	@Redirect(method = "setRandomEffect(Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_spiderEffect_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.spiderEffect.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.spiderEffect.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.spiderEffect.nextInt(i);
			return rand.nextInt(i);
		}
	}


}