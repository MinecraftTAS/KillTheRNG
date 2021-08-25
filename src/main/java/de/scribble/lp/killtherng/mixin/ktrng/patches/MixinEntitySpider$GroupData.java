package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntitySpider;

@Mixin(EntitySpider.GroupData.class)
public class MixinEntitySpider$GroupData {

	/**
	* Random effect from a spider, when spawning naturally
	*/
	@Redirect(method = "setRandomEffect(Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_spiderEffect_1(Random rand, int i) {
		return KillTheRNG.randomness.spiderEffect.nextInt(i);
//		KillTheRNG.randomness.spiderEffect.nextInt(i);
//		return rand.nextInt(i);
	}

}
