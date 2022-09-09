package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.item.EntityItemFrame.class)
public class MixinEntityItemFrame{

	/**
	* Chance of not dropping the item in an item frame
	*/
	@Redirect(method = "dropItemOrSelf(Lnet/minecraft/entity/Entity;Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_itemFrameDropChance_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.itemFrameDropChance.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.itemFrameDropChance.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.itemFrameDropChance.nextFloat();
			return rand.nextFloat();
		}
	}


}