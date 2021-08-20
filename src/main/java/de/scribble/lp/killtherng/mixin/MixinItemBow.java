package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.item.ItemBow;

@Mixin(ItemBow.class)
public class MixinItemBow {

	/**
	* null
	*/
	@Redirect(method = "onPlayerStoppedUsing(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_572_0(Random rand) {
		return KillTheRNG.randomness.random_572.nextFloat();
	}

}
