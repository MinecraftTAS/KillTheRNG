package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntityZombieVillager;

@Mixin(EntityZombieVillager.class)
public class MixinEntityZombieVillager {
	@Redirect(method = "processInteract(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_764(Random rand, int i) {
		return KillTheRNG.randomness.random_764.nextInt(i);
	}

	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_765(Random rand) {
		return KillTheRNG.randomness.random_765.nextFloat();
	}

	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_766(Random rand) {
		return KillTheRNG.randomness.random_766.nextFloat();
	}

	@Redirect(method = "getConversionProgress()I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_767(Random rand) {
		return KillTheRNG.randomness.random_767.nextFloat();
	}

	@Redirect(method = "getConversionProgress()I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_768(Random rand) {
		return KillTheRNG.randomness.random_768.nextFloat();
	}

	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_769(Random rand) {
		return KillTheRNG.randomness.random_769.nextFloat();
	}

	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_770(Random rand) {
		return KillTheRNG.randomness.random_770.nextFloat();
	}

	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_771(Random rand) {
		return KillTheRNG.randomness.random_771.nextFloat();
	}

	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_772(Random rand) {
		return KillTheRNG.randomness.random_772.nextFloat();
	}

}
