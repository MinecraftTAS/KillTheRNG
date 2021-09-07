package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.item.EntityItemFrame;

@Mixin(EntityItemFrame.class)
public class MixinEntityItemFrame {

	/**
	* Chance of not dropping the item in an item frame
	*/
	@Redirect(method = "dropItemOrSelf(Lnet/minecraft/entity/Entity;Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_itemFrameDropChance_1(Random rand) {
		return KillTheRNG.randomness.itemFrameDropChance.nextFloat();
//		KillTheRNG.randomness.itemFrameDropChance.nextFloat();
//		return rand.nextFloat();
	}

}
