package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.end.DragonFightManager;

@Mixin(DragonFightManager.class)
public class MixinDragonFightManager {

	/**
	* null
	*/
	@Redirect(method = "createNewDragon()Lnet/minecraft/entity/boss/EntityDragon;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1851_1(Random rand) {
		return KillTheRNG.randomness.random_1851.nextFloat();
//		KillTheRNG.randomness.random_1851.nextFloat();
//		return rand.nextFloat();
	}

}
