package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockFire.class)
public class MixinBlockFire{

	/**
	* Chance if fire makes a sound
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_fireSoundChance_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireSoundChance.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireSoundChance.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireSoundChance.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Something about fire sound
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_fireSound_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Something about fire sound
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_fireSound_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Get the X of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_fireParticlePosX_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosX.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosX.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosX.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Get the Y of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_fireParticlePosY_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosY.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosY.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosY.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Get the Z of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_fireParticlePosZ_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosZ.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosZ.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosZ.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Get the X of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_fireParticlePosX_7(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosX.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosX.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosX.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Get the Y of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_fireParticlePosY_8(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosY.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosY.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosY.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Get the Z of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_fireParticlePosZ_9(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosZ.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosZ.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosZ.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Get the X of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 6))
	public double redirect_fireParticlePosX_10(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosX.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosX.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosX.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Get the Y of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 7))
	public double redirect_fireParticlePosY_11(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosY.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosY.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosY.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Get the Z of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 8))
	public double redirect_fireParticlePosZ_12(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosZ.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosZ.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosZ.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Get the X of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 9))
	public double redirect_fireParticlePosX_13(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosX.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosX.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosX.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Get the Y of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 10))
	public double redirect_fireParticlePosY_14(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosY.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosY.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosY.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Get the Z of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 11))
	public double redirect_fireParticlePosZ_15(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosZ.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosZ.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosZ.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Get the X of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 12))
	public double redirect_fireParticlePosX_16(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosX.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosX.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosX.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Get the Y of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 13))
	public double redirect_fireParticlePosY_17(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosY.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosY.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosY.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Get the Z of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 14))
	public double redirect_fireParticlePosZ_18(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosZ.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosZ.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosZ.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Get the X of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 15))
	public double redirect_fireParticlePosX_19(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosX.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosX.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosX.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Get the Y of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 16))
	public double redirect_fireParticlePosY_20(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosY.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosY.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosY.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Get the Z of a fire particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 17))
	public double redirect_fireParticlePosZ_21(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosZ.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosZ.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.fireParticlePosZ.nextDouble();
			return rand.nextDouble();
		}
	}


}