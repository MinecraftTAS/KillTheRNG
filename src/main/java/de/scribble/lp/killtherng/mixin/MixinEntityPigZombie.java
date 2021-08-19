package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntityPigZombie;

@Mixin(EntityPigZombie.class)
public class MixinEntityPigZombie {
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_863(Random rand) {
		return KillTheRNG.randomness.random_863.nextFloat();
	}

	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_864(Random rand) {
		return KillTheRNG.randomness.random_864.nextFloat();
	}

	@Redirect(method = "becomeAngryAt(Lnet/minecraft/entity/Entity;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_865(Random rand, int i) {
		return KillTheRNG.randomness.random_865.nextInt(i);
	}

	@Redirect(method = "becomeAngryAt(Lnet/minecraft/entity/Entity;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_866(Random rand, int i) {
		return KillTheRNG.randomness.random_866.nextInt(i);
	}

}
