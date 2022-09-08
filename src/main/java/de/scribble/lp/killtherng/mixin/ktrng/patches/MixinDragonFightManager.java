package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.end.DragonFightManager.class)
public class MixinDragonFightManager{

	/**
	* Angle for the ender dragon when spawning
	*/
	@Redirect(method = "createNewDragon()Lnet/minecraft/entity/boss/EntityDragon;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_enderDragonYaw_1(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.enderDragonYaw.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.enderDragonYaw.nextFloat();
//		return rand.nextFloat();
	}


}