package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.projectile.EntityArrow;

@Mixin(EntityArrow.class)
public class MixinEntityArrow {
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_573(Random rand) {
		return KillTheRNG.randomness.random_573.nextGaussian();
	}

	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_574(Random rand) {
		return KillTheRNG.randomness.random_574.nextGaussian();
	}

	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_575(Random rand) {
		return KillTheRNG.randomness.random_575.nextGaussian();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_576(Random rand) {
		return KillTheRNG.randomness.random_576.nextFloat();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_577(Random rand) {
		return KillTheRNG.randomness.random_577.nextFloat();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_578(Random rand) {
		return KillTheRNG.randomness.random_578.nextFloat();
	}

	@Redirect(method = "onHit(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_579(Random rand, int i) {
		return KillTheRNG.randomness.random_579.nextInt(i);
	}

	@Redirect(method = "onHit(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_580(Random rand) {
		return KillTheRNG.randomness.random_580.nextFloat();
	}

	@Redirect(method = "onHit(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_581(Random rand) {
		return KillTheRNG.randomness.random_581.nextFloat();
	}

	@Redirect(method = "setEnchantmentEffectsFromEntity(Lnet/minecraft/entity/EntityLivingBase;F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_582(Random rand) {
		return KillTheRNG.randomness.random_582.nextGaussian();
	}

}
