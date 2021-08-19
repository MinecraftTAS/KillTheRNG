package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.end.DragonFightManager;

@Mixin(DragonFightManager.class)
public class MixinDragonFightManager {
	@Redirect(method = "createNewDragon()Lnet/minecraft/entity/boss/EntityDragon;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1851(Random rand) {
		return KillTheRNG.randomness.random_1851.nextFloat();
	}

}
