package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.tileentity.TileEntityShulkerBox.class)
public class MixinTileEntityShulkerBox{

	/**
	* null
	*/
	@Redirect(method = "closeInventory(Lnet/minecraft/entity/player/EntityPlayer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_563_1(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_563.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_563.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "openInventory(Lnet/minecraft/entity/player/EntityPlayer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_562_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_562.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_562.nextFloat();
//		return rand.nextFloat();
	}


}