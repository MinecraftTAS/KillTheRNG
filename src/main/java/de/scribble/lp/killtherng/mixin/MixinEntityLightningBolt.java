package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.effect.EntityLightningBolt;

@Mixin(EntityLightningBolt.class)
public class MixinEntityLightningBolt {
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_random_1393(Random rand) {
		return KillTheRNG.randomness.random_1393.nextLong();
	}

	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1394(Random rand, int i) {
		return KillTheRNG.randomness.random_1394.nextInt(i);
	}

	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1395(Random rand, int i) {
		return KillTheRNG.randomness.random_1395.nextInt(i);
	}

	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1396(Random rand, int i) {
		return KillTheRNG.randomness.random_1396.nextInt(i);
	}

	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1397(Random rand, int i) {
		return KillTheRNG.randomness.random_1397.nextInt(i);
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1398(Random rand) {
		return KillTheRNG.randomness.random_1398.nextFloat();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1399(Random rand) {
		return KillTheRNG.randomness.random_1399.nextFloat();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1400(Random rand, int i) {
		return KillTheRNG.randomness.random_1400.nextInt(i);
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 3))
	public long redirect_random_1401(Random rand) {
		return KillTheRNG.randomness.random_1401.nextLong();
	}

}
