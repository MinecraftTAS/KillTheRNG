package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.item.ItemLingeringPotion.class)
public class MixinItemLingeringPotion{

	/**
	* null
	*/
	@Redirect(method = "onItemRightClick(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/ActionResult;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_675_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_675.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_675.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_675.nextFloat();
			return rand.nextFloat();
		}
	}


}