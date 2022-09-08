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
		return de.scribble.lp.killtherng.KillTheRNG.randomness.arrowCritDamage.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.arrowCritDamage.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Get the damage of a critical arrow
	*/
	@Redirect(method = "onHit(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_arrowCritDamage_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.arrowCritDamage.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.arrowCritDamage.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Get the damage of a critical arrow
	*/
	@Redirect(method = "onHit(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_arrowCritDamage_3(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.arrowCritDamage.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.arrowCritDamage.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Add a random amount of force to the shot
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_arrowMotion_4(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.arrowMotion.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.arrowMotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Add a random amount of force to the shot
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_arrowMotion_5(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.arrowMotion.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.arrowMotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Add a random amount of force to the shot
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_arrowMotion_6(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.arrowMotion.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.arrowMotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Damage of arrow with enchantments
	*/
	@Redirect(method = "setEnchantmentEffectsFromEntity(Lnet/minecraft/entity/EntityLivingBase;F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_arrowEnchantmentDamage_7(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.arrowEnchantmentDamage.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.arrowEnchantmentDamage.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Add inaccuracy to the shot
	*/
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_arrowInaccuracy_8(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.arrowInaccuracy.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.arrowInaccuracy.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Add inaccuracy to the shot
	*/
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_arrowInaccuracy_9(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.arrowInaccuracy.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.arrowInaccuracy.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Add inaccuracy to the shot
	*/
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_arrowInaccuracy_10(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.arrowInaccuracy.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.arrowInaccuracy.nextGaussian();
//		return rand.nextGaussian();
	}


}