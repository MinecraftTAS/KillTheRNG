package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.tileentity.TileEntityShulkerBox;

@Mixin(TileEntityShulkerBox.class)
public class MixinTileEntityShulkerBox {
	@Redirect(method = "openInventory(Lnet/minecraft/entity/player/EntityPlayer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_562(Random rand) {
		return KillTheRNG.randomness.random_562.nextFloat();
	}

	@Redirect(method = "closeInventory(Lnet/minecraft/entity/player/EntityPlayer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_563(Random rand) {
		return KillTheRNG.randomness.random_563.nextFloat();
	}

}
