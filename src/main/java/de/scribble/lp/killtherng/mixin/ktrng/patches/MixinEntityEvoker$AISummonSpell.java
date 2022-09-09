package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraft.entity.monster.EntityEvoker$AISummonSpell")
public class MixinEntityEvoker$AISummonSpell{

	/**
	* null
	*/
	@Redirect(method = "castSpell()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_800_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_800.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_800.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_800.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "castSpell()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_801_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_801.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_801.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_801.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "castSpell()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_802_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_802.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_802.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_802.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_799_4(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_799.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_799.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_799.nextInt(i);
			return rand.nextInt(i);
		}
	}


}