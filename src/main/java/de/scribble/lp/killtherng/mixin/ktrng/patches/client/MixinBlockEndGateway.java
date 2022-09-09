package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockEndGateway.class)
public class MixinBlockEndGateway{

	/**
	* Where the end gateway particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_endGatewayParticlePos_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the end gateway particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_endGatewayParticlePos_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the end gateway particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_endGatewayParticlePos_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the end gateway particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_endGatewayParticlePos_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the end gateway particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_endGatewayParticlePos_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the end gateway particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_endGatewayParticlePos_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the end gateway particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_endGatewayParticlePos_7(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Where the end gateway particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_endGatewayParticlePos_8(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.nextBoolean();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.nextBoolean();
			return rand.nextBoolean();
		}
	}

	/**
	* Where the end gateway particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_endGatewayParticlePos_9(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the end gateway particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_endGatewayParticlePos_10(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticlePos.nextFloat();
			return rand.nextFloat();
		}
	}


}