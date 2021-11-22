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
	* Angle for the ender dragon when spawning
	*/
	@Redirect(method = "createNewDragon()Lnet/minecraft/entity/boss/EntityDragon;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_enderDragonYaw_1(Random rand) {
		return KillTheRNG.randomness.enderDragonYaw.nextFloat();
//		KillTheRNG.randomness.enderDragonYaw.nextFloat();
//		return rand.nextFloat();
	}

}
