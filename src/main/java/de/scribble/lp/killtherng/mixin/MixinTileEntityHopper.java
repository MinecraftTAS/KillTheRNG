package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.tileentity.TileEntityHopper;

@Mixin(TileEntityHopper.class)
public class MixinTileEntityHopper {

	/**
	* null
	*/
	@Redirect(method = "getInventoryAtPosition(Lnet/minecraft/world/World;DDD)Lnet/minecraft/inventory/IInventory;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_529_0(Random rand, int i) {
		return KillTheRNG.randomness.random_529.nextInt(i);
	}

}
