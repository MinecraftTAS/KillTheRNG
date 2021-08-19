package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityRabbit;

@Mixin(EntityRabbit.class)
public class MixinEntityRabbit {
	@Redirect(method = "setJumping(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_984(Random rand) {
		return KillTheRNG.randomness.random_984.nextFloat();
	}

	@Redirect(method = "setJumping(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_985(Random rand) {
		return KillTheRNG.randomness.random_985.nextFloat();
	}

	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_986(Random rand, int i) {
		return KillTheRNG.randomness.random_986.nextInt(i);
	}

	@Redirect(method = "attackEntityAsMob(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_987(Random rand) {
		return KillTheRNG.randomness.random_987.nextFloat();
	}

	@Redirect(method = "attackEntityAsMob(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_988(Random rand) {
		return KillTheRNG.randomness.random_988.nextFloat();
	}

	@Redirect(method = "createChild(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/passive/EntityRabbit;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_989(Random rand, int i) {
		return KillTheRNG.randomness.random_989.nextInt(i);
	}

	@Redirect(method = "createChild(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/passive/EntityRabbit;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_random_990(Random rand) {
		return KillTheRNG.randomness.random_990.nextBoolean();
	}

	@Redirect(method = "getRandomRabbitType()I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_991(Random rand, int i) {
		return KillTheRNG.randomness.random_991.nextInt(i);
	}

	@Redirect(method = "createEatingParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_992(Random rand) {
		return KillTheRNG.randomness.random_992.nextFloat();
	}

	@Redirect(method = "createEatingParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_993(Random rand) {
		return KillTheRNG.randomness.random_993.nextFloat();
	}

	@Redirect(method = "createEatingParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_994(Random rand) {
		return KillTheRNG.randomness.random_994.nextFloat();
	}

}
