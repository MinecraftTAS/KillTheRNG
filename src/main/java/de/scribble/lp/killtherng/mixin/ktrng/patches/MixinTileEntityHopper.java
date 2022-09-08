package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.tileentity.TileEntityHopper.class)
public class MixinTileEntityHopper{

	/**
	* null
	*/
	@Redirect(method = "getInventoryAtPosition(Lnet/minecraft/world/World;DDD)Lnet/minecraft/inventory/IInventory;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_529_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_529.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_529.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_529.nextInt(i);
			return rand.nextInt(i);
		}
	}


}