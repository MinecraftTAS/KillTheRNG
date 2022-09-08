package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.monster.EntityIllusionIllager.class)
public class MixinEntityIllusionIllager{

	/**
	* Sound of IllusionIllager shooting an arrow
	*/
	@Redirect(method = "attackEntityWithRangedAttack(Lnet/minecraft/entity/EntityLivingBase;F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_illuasionIllagerSound_1(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.illuasionIllagerSound.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.illuasionIllagerSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Where the illusions will be places
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_illusionIllagerIllusionPosition_2(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.illusionIllagerIllusionPosition.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.illusionIllagerIllusionPosition.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Where the illusions will be places
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_illusionIllagerIllusionPosition_3(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.illusionIllagerIllusionPosition.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.illusionIllagerIllusionPosition.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Where the illusions will be places
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_illusionIllagerIllusionPosition_4(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.illusionIllagerIllusionPosition.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.illusionIllagerIllusionPosition.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Where the illusions will be places
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_illusionIllagerIllusionPosition_5(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.illusionIllagerIllusionPosition.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.illusionIllagerIllusionPosition.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Where the illusions will be places
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_illusionIllagerIllusionPosition_6(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.illusionIllagerIllusionPosition.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.illusionIllagerIllusionPosition.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Where the illusions will be places
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_illusionIllagerIllusionPosition_7(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.illusionIllagerIllusionPosition.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.illusionIllagerIllusionPosition.nextDouble();
//		return rand.nextDouble();
	}


}