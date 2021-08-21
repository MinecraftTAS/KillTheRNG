package de.scribble.lp.killtherng.mixin.ktrng.patches;

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
	public float redirect_random_562_1(Random rand) {
		return KillTheRNG.randomness.random_562.nextFloat();
//		KillTheRNG.randomness.random_562.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "closeInventory(Lnet/minecraft/entity/player/EntityPlayer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_563_2(Random rand) {
		return KillTheRNG.randomness.random_563.nextFloat();
//		KillTheRNG.randomness.random_563.nextFloat();
//		return rand.nextFloat();
	}

}
