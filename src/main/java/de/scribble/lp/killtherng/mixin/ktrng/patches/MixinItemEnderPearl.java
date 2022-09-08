package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.item.ItemEnderPearl.class)
public class MixinItemEnderPearl{

	/**
	* null
	*/
	@Redirect(method = "onItemRightClick(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/ActionResult;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_644_1(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_644.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_644.nextFloat();
//		return rand.nextFloat();
	}


}