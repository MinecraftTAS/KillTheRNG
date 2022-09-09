package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockPortal.class)
public class MixinBlockPortal{

	/**
	* Particles of the nether portal
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_netherPortalParticles_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Particles of the nether portal
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_netherPortalParticles_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Particles of the nether portal
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_netherPortalParticles_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Particles of the nether portal
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_netherPortalParticles_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Particles of the nether portal
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_netherPortalParticles_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Particles of the nether portal
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_netherPortalParticles_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Particles of the nether portal
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_netherPortalParticles_7(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Particles of the nether portal
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_netherPortalParticles_8(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Particles of the nether portal
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_netherPortalParticles_9(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Particles of the nether portal
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_netherPortalParticles_10(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Particles of the nether portal
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 8))
	public float redirect_netherPortalParticles_11(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.netherPortalParticles.nextFloat();
			return rand.nextFloat();
		}
	}


}