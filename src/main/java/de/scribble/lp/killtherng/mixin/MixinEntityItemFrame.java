package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.item.EntityItemFrame;

@Mixin(EntityItemFrame.class)
public class MixinEntityItemFrame {
	@Redirect(method = "dropItemOrSelf(Lnet/minecraft/entity/Entity;Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_590(Random rand) {
		return KillTheRNG.randomness.random_590.nextFloat();
	}

}
