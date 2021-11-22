package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.item.EntityMinecartFurnace;

@Mixin(EntityMinecartFurnace.class)
public class MixinEntityMinecartFurnace {

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_816_1(Random rand, int i) {
		return KillTheRNG.randomness.random_816.nextInt(i);
//		KillTheRNG.randomness.random_816.nextInt(i);
//		return rand.nextInt(i);
	}

}
