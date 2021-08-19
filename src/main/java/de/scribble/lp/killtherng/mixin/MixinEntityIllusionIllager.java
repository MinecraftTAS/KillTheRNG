package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntityIllusionIllager;

@Mixin(EntityIllusionIllager.class)
public class MixinEntityIllusionIllager {
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_809(Random rand, int i) {
		return KillTheRNG.randomness.random_809.nextInt(i);
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_810(Random rand, int i) {
		return KillTheRNG.randomness.random_810.nextInt(i);
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_811(Random rand, int i) {
		return KillTheRNG.randomness.random_811.nextInt(i);
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_812(Random rand) {
		return KillTheRNG.randomness.random_812.nextDouble();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_813(Random rand) {
		return KillTheRNG.randomness.random_813.nextDouble();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_814(Random rand) {
		return KillTheRNG.randomness.random_814.nextDouble();
	}

	@Redirect(method = "attackEntityWithRangedAttack(Lnet/minecraft/entity/EntityLivingBase;F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_815(Random rand) {
		return KillTheRNG.randomness.random_815.nextFloat();
	}

}
