package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
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
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireSoundChance.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireSoundChance.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireSoundChance.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Random volume of fire crackling
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_fireSoundVolume_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireSoundVolume.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireSoundVolume.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireSoundVolume.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Random pitch of fire crackling
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_fireSoundPitch_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireSoundPitch.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireSoundPitch.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireSoundPitch.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* The position of smoke particles for fire on the EAST side
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_fireParticleEast_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticleEast.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticleEast.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticleEast.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* The position of smoke particles for fire on the EAST side
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_fireParticleEast_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticleEast.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticleEast.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticleEast.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* The position of smoke particles for fire on the EAST side
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_fireParticleEast_6(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticleEast.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticleEast.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticleEast.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* The position of smoke particles for fire on the WEST side
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_fireParticlePosWest_7(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosWest.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosWest.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosWest.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* The position of smoke particles for fire on the WEST side
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_fireParticlePosWest_8(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosWest.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosWest.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosWest.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* The position of smoke particles for fire on the WEST side
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_fireParticlePosWest_9(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosWest.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosWest.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosWest.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* The position of smoke particles for fire on the SOUTH side
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 6))
	public double redirect_fireParticlePosSouth_10(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosSouth.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosSouth.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosSouth.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* The position of smoke particles for fire on the SOUTH side
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 7))
	public double redirect_fireParticlePosSouth_11(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosSouth.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosSouth.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosSouth.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* The position of smoke particles for fire on the SOUTH side
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 8))
	public double redirect_fireParticlePosSouth_12(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosSouth.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosSouth.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosSouth.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* The position of smoke particles for fire on the NORTH side
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 9))
	public double redirect_fireParticlePosNorth_13(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosNorth.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosNorth.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosNorth.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* The position of smoke particles for fire on the NORTH side
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 10))
	public double redirect_fireParticlePosNorth_14(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosNorth.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosNorth.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosNorth.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* The position of smoke particles for fire on the NORTH side
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 11))
	public double redirect_fireParticlePosNorth_15(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosNorth.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosNorth.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosNorth.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* The position of smoke particles for fire on the DOWN side
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 12))
	public double redirect_fireParticlePosDown_16(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosDown.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosDown.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosDown.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* The position of smoke particles for fire on the DOWN side
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 13))
	public double redirect_fireParticlePosDown_17(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosDown.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosDown.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosDown.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* The position of smoke particles for fire on the DOWN side
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 14))
	public double redirect_fireParticlePosDown_18(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosDown.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosDown.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosDown.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* The position of smoke particles for fire on the UP side
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 15))
	public double redirect_fireParticlePosUp_19(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosUp.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosUp.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosUp.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* The position of smoke particles for fire on the UP side
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 16))
	public double redirect_fireParticlePosUp_20(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosUp.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosUp.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosUp.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* The position of smoke particles for fire on the UP side
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 17))
	public double redirect_fireParticlePosUp_21(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosUp.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosUp.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.fireParticlePosUp.nextDouble();
			return rand.nextDouble();
		}
	}


}