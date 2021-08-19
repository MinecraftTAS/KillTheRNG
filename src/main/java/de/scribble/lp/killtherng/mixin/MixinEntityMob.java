package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntityMob;

@Mixin(EntityMob.class)
public class MixinEntityMob {
	@Redirect(method = "attackEntityAsMob(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_454(Random rand) {
		return KillTheRNG.randomness.random_454.nextFloat();
	}

	@Redirect(method = "isValidLightLevel()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_455(Random rand, int i) {
		return KillTheRNG.randomness.random_455.nextInt(i);
	}

	@Redirect(method = "isValidLightLevel()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_456(Random rand, int i) {
		return KillTheRNG.randomness.random_456.nextInt(i);
	}

}
