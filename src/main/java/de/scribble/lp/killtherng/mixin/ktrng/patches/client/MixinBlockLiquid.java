package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockLiquid.class)
public class MixinBlockLiquid{

	/**
	* If the water flowing sound should play
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_waterAmbientSoundActivate_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.waterAmbientSoundActivate.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.waterAmbientSoundActivate.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.waterAmbientSoundActivate.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Pitch of the water flowing sound
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_waterAmbientSound_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.waterAmbientSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.waterAmbientSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.waterAmbientSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of the water flowing sound
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_waterAmbientSound_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.waterAmbientSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.waterAmbientSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.waterAmbientSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* If a water particle should spawn
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_waterParticleSuspendedActivate_4(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.waterParticleSuspendedActivate.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.waterParticleSuspendedActivate.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.waterParticleSuspendedActivate.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Water particle position
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_waterParticleSuspendedPos_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.waterParticleSuspendedPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.waterParticleSuspendedPos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.waterParticleSuspendedPos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Water particle position
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_waterParticleSuspendedPos_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.waterParticleSuspendedPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.waterParticleSuspendedPos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.waterParticleSuspendedPos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Water particle position
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_waterParticleSuspendedPos_7(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.waterParticleSuspendedPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.waterParticleSuspendedPos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.waterParticleSuspendedPos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* If the lava pop sound should activate
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_lavaPopSoundActivate_8(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.lavaPopSoundActivate.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.lavaPopSoundActivate.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.lavaPopSoundActivate.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of lava pop particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_lavaPopParticle_9(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.lavaPopParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.lavaPopParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.lavaPopParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of lava pop particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_lavaPopParticle_10(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.lavaPopParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.lavaPopParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.lavaPopParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Postion of lava pop sound
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_lavaPopSoundPitch_11(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.lavaPopSoundPitch.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.lavaPopSoundPitch.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.lavaPopSoundPitch.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Postion of lava pop sound
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 8))
	public float redirect_lavaPopSoundPitch_12(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.lavaPopSoundPitch.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.lavaPopSoundPitch.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.lavaPopSoundPitch.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* If the lava flowing sound should play
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_lavaAmbientSoundActivate_13(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.lavaAmbientSoundActivate.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.lavaAmbientSoundActivate.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.lavaAmbientSoundActivate.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Pitch of flowing lava sound
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 9))
	public float redirect_lavaAmbientSound_14(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.lavaAmbientSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.lavaAmbientSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.lavaAmbientSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of flowing lava sound
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 10))
	public float redirect_lavaAmbientSound_15(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.lavaAmbientSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.lavaAmbientSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.lavaAmbientSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* If a drip particle should spawn
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_liquidDripParticleActivate_16(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.liquidDripParticleActivate.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.liquidDripParticleActivate.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.liquidDripParticleActivate.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of drip particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 11))
	public float redirect_liquidDripParticle_17(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.liquidDripParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.liquidDripParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.liquidDripParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of drip particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 12))
	public float redirect_liquidDripParticle_18(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.liquidDripParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.liquidDripParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.liquidDripParticle.nextFloat();
			return rand.nextFloat();
		}
	}


}