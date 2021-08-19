package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.boss.EntityDragon;

@Mixin(EntityDragon.class)
public class MixinEntityDragon {
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_900(Random rand) {
		return KillTheRNG.randomness.random_900.nextFloat();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_901(Random rand) {
		return KillTheRNG.randomness.random_901.nextFloat();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_902(Random rand, int i) {
		return KillTheRNG.randomness.random_902.nextInt(i);
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_903(Random rand) {
		return KillTheRNG.randomness.random_903.nextFloat();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_904(Random rand) {
		return KillTheRNG.randomness.random_904.nextFloat();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_905(Random rand) {
		return KillTheRNG.randomness.random_905.nextFloat();
	}

	@Redirect(method = "updateDragonEnderCrystal()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_906(Random rand, int i) {
		return KillTheRNG.randomness.random_906.nextInt(i);
	}

	@Redirect(method = "destroyBlocksInAABB(Lnet/minecraft/util/math/AxisAlignedBB;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_907(Random rand) {
		return KillTheRNG.randomness.random_907.nextFloat();
	}

	@Redirect(method = "destroyBlocksInAABB(Lnet/minecraft/util/math/AxisAlignedBB;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_908(Random rand) {
		return KillTheRNG.randomness.random_908.nextFloat();
	}

	@Redirect(method = "destroyBlocksInAABB(Lnet/minecraft/util/math/AxisAlignedBB;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_909(Random rand) {
		return KillTheRNG.randomness.random_909.nextFloat();
	}

	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_910(Random rand) {
		return KillTheRNG.randomness.random_910.nextFloat();
	}

	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_911(Random rand) {
		return KillTheRNG.randomness.random_911.nextFloat();
	}

	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_912(Random rand) {
		return KillTheRNG.randomness.random_912.nextFloat();
	}

}
