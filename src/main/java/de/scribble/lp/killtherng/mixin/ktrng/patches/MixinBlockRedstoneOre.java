package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockRedstoneOre.class)
public class MixinBlockRedstoneOre{

	/**
	* Amount of xp dropped by redstone ore
	*/
	@Redirect(method = "getExpDrop(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;I)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	public int redirect_redstoneOreXpDrop_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.redstoneOreXpDrop.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.redstoneOreXpDrop.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.redstoneOreXpDrop.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Amount of redstone dropped from ore
	*/
	@Redirect(method = "quantityDropped(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_restoneOreDrop_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.restoneOreDrop.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.restoneOreDrop.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.restoneOreDrop.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Amount of redstone dropped from ore with fortune
	*/
	@Redirect(method = "quantityDroppedWithBonus(ILjava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_redstoneOreDropFortuneBonus_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.redstoneOreDropFortuneBonus.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.redstoneOreDropFortuneBonus.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.redstoneOreDropFortuneBonus.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Particles of redstone ore
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_redstoneOreParticles_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.redstoneOreParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.redstoneOreParticles.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.redstoneOreParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Particles of redstone ore
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_redstoneOreParticles_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.redstoneOreParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.redstoneOreParticles.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.redstoneOreParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Particles of redstone ore
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_redstoneOreParticles_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.redstoneOreParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.redstoneOreParticles.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.redstoneOreParticles.nextFloat();
			return rand.nextFloat();
		}
	}


}