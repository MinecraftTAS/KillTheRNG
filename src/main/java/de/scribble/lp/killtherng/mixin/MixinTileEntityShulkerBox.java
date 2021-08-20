package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.tileentity.TileEntityShulkerBox;

@Mixin(TileEntityShulkerBox.class)
public class MixinTileEntityShulkerBox {

	/**
	* null
	*/
	@Redirect(method = "openInventory(Lnet/minecraft/entity/player/EntityPlayer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_562_0(Random rand) {
		return KillTheRNG.randomness.random_562.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "closeInventory(Lnet/minecraft/entity/player/EntityPlayer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_563_0(Random rand) {
		return KillTheRNG.randomness.random_563.nextFloat();
	}

}
