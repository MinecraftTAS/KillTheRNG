package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.passive.EntityChicken.class)
public class MixinEntityChicken{

	/**
	* Time until the chicken lays its first egg
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_chickenLaysFirstEgg_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.chickenLaysFirstEgg.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.chickenLaysFirstEgg.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Pitch of chicken laying an egg
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_chickenEggSound_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.chickenEggSound.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.chickenEggSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of chicken laying an egg
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_chickenEggSound_3(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.chickenEggSound.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.chickenEggSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of chicken laying an egg
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_chickenEggSound_4(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.chickenEggSound.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.chickenEggSound.nextInt(i);
//		return rand.nextInt(i);
	}


}