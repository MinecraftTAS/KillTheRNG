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
	public float redirect_endGatewayParticle_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the end gateway particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_endGatewayParticle_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the end gateway particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_endGatewayParticle_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the end gateway particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_endGatewayParticle_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the end gateway particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_endGatewayParticle_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the end gateway particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_endGatewayParticle_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the end gateway particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_endGatewayParticle_7(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Where the end gateway particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_endGatewayParticle_8(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.nextBoolean();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.nextBoolean();
			return rand.nextBoolean();
		}
	}

	/**
	* Where the end gateway particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_endGatewayParticle_9(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the end gateway particle spawns
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_endGatewayParticle_10(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.endGatewayParticle.nextFloat();
			return rand.nextFloat();
		}
	}


}