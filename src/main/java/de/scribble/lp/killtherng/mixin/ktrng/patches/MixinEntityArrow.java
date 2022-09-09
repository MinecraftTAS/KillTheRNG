package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.projectile.EntityArrow.class)
public class MixinEntityArrow{

	/**
	* Get the damage of a critical arrow
	*/
	@Redirect(method = "onHit(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_arrowCritDamage_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowCritDamage.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowCritDamage.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowCritDamage.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Get the damage of a critical arrow
	*/
	@Redirect(method = "onHit(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_arrowCritDamage_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowCritDamage.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowCritDamage.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowCritDamage.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Get the damage of a critical arrow
	*/
	@Redirect(method = "onHit(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_arrowCritDamage_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowCritDamage.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowCritDamage.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowCritDamage.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Add a random amount of force to the shot
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_arrowMotion_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowMotion.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowMotion.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowMotion.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Add a random amount of force to the shot
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_arrowMotion_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowMotion.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowMotion.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowMotion.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Add a random amount of force to the shot
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_arrowMotion_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowMotion.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowMotion.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowMotion.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Damage of arrow with enchantments
	*/
	@Redirect(method = "setEnchantmentEffectsFromEntity(Lnet/minecraft/entity/EntityLivingBase;F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_arrowEnchantmentDamage_7(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowEnchantmentDamage.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowEnchantmentDamage.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowEnchantmentDamage.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Add inaccuracy to the shot
	*/
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_arrowInaccuracy_8(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowInaccuracy.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowInaccuracy.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowInaccuracy.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Add inaccuracy to the shot
	*/
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_arrowInaccuracy_9(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowInaccuracy.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowInaccuracy.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowInaccuracy.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Add inaccuracy to the shot
	*/
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_arrowInaccuracy_10(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowInaccuracy.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowInaccuracy.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.arrowInaccuracy.nextGaussian();
			return rand.nextGaussian();
		}
	}


}