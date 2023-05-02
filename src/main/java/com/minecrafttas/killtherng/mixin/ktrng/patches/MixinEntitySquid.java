package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.passive.EntitySquid.class)
public class MixinEntitySquid{

	/**
	* Sets the seed of the random for no good reason "+net.minecraft.util.text.TextFormatting.RED+"Squids are evil!
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_squidIdioticSetSeed_1(Random rand, long seed) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.squidIdioticSetSeed.isEnabled()) {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.squidIdioticSetSeed.setSeed(seed, true);		} else {
			rand.setSeed(seed);
		}
	}

	/**
	* Initial rotation velocity of the squid. "+net.minecraft.util.text.TextFormatting.RED+"Squids are evil!
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_squidInitRotationVelocity_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.squidInitRotationVelocity.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.squidInitRotationVelocity.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.squidInitRotationVelocity.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* If the rotation should be changed. "+net.minecraft.util.text.TextFormatting.RED+"Squids are evil!
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_squidShouldChangeRotationVelocity_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.squidShouldChangeRotationVelocity.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.squidShouldChangeRotationVelocity.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.squidShouldChangeRotationVelocity.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* If the rotation should be changed. "+net.minecraft.util.text.TextFormatting.RED+"Squids are evil!
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_squidShouldChangeRotationVelocity_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.squidShouldChangeRotationVelocity.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.squidShouldChangeRotationVelocity.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.squidShouldChangeRotationVelocity.nextFloat();
			return rand.nextFloat();
		}
	}


}