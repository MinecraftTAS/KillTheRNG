package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockEnchantmentTable.class)
public class MixinBlockEnchantmentTable{

	/**
	* If enchantement table particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_enchantementTableParticleChance_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.enchantementTableParticleChance.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.enchantementTableParticleChance.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.enchantementTableParticleChance.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Get the X of the enchantment table particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_enchantementTableParticlePosX_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.enchantementTableParticlePosX.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.enchantementTableParticlePosX.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.enchantementTableParticlePosX.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Get the Y of the enchantment table particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_enchantementTableParticlePosY_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.enchantementTableParticlePosY.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.enchantementTableParticlePosY.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.enchantementTableParticlePosY.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Get the Z of the enchantment table particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_enchantementTableParticlePosZ_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.enchantementTableParticlePosZ.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.enchantementTableParticlePosZ.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.enchantementTableParticlePosZ.nextFloat();
			return rand.nextFloat();
		}
	}


}