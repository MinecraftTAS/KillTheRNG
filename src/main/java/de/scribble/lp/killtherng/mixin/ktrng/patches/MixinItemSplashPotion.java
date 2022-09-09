package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.item.ItemSplashPotion.class)
public class MixinItemSplashPotion{

	/**
	* null
	*/
	@Redirect(method = "onItemRightClick(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/ActionResult;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_674_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_674.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_674.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_674.nextFloat();
			return rand.nextFloat();
		}
	}


}