package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.item.ItemBow.class)
public class MixinItemBow{

	/**
	* null
	*/
	@Redirect(method = "onPlayerStoppedUsing(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_572_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_572.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_572.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_572.nextFloat();
			return rand.nextFloat();
		}
	}


}