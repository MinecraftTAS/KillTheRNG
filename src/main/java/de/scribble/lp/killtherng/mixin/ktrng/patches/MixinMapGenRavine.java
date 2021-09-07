package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.MapGenRavine;

@Mixin(MapGenRavine.class)
public class MixinMapGenRavine {

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1575_1(Random rand, int i) {
//		return KillTheRNG.randomness.random_1575.nextInt(i);
		KillTheRNG.randomness.random_1575.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1576_2(Random rand, int i) {
//		return KillTheRNG.randomness.random_1576.nextInt(i);
		KillTheRNG.randomness.random_1576.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1577_3(Random rand) {
//		return KillTheRNG.randomness.random_1577.nextFloat();
		KillTheRNG.randomness.random_1577.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1578_4(Random rand) {
//		return KillTheRNG.randomness.random_1578.nextFloat();
		KillTheRNG.randomness.random_1578.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1579_5(Random rand) {
//		return KillTheRNG.randomness.random_1579.nextFloat();
		KillTheRNG.randomness.random_1579.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1580_6(Random rand) {
//		return KillTheRNG.randomness.random_1580.nextFloat();
		KillTheRNG.randomness.random_1580.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_1581_7(Random rand) {
//		return KillTheRNG.randomness.random_1581.nextFloat();
		KillTheRNG.randomness.random_1581.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_1582_8(Random rand) {
//		return KillTheRNG.randomness.random_1582.nextFloat();
		KillTheRNG.randomness.random_1582.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_1583_9(Random rand) {
//		return KillTheRNG.randomness.random_1583.nextFloat();
		KillTheRNG.randomness.random_1583.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_random_1584_10(Random rand) {
//		return KillTheRNG.randomness.random_1584.nextFloat();
		KillTheRNG.randomness.random_1584.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 8))
	public float redirect_random_1585_11(Random rand) {
//		return KillTheRNG.randomness.random_1585.nextFloat();
		KillTheRNG.randomness.random_1585.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 9))
	public float redirect_random_1586_12(Random rand) {
//		return KillTheRNG.randomness.random_1586.nextFloat();
		KillTheRNG.randomness.random_1586.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1587_13(Random rand, int i) {
//		return KillTheRNG.randomness.random_1587.nextInt(i);
		KillTheRNG.randomness.random_1587.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1588_14(Random rand, int i) {
//		return KillTheRNG.randomness.random_1588.nextInt(i);
		KillTheRNG.randomness.random_1588.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1589_15(Random rand, int i) {
//		return KillTheRNG.randomness.random_1589.nextInt(i);
		KillTheRNG.randomness.random_1589.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1590_16(Random rand, int i) {
//		return KillTheRNG.randomness.random_1590.nextInt(i);
		KillTheRNG.randomness.random_1590.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1591_17(Random rand, int i) {
//		return KillTheRNG.randomness.random_1591.nextInt(i);
		KillTheRNG.randomness.random_1591.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1592_18(Random rand, int i) {
//		return KillTheRNG.randomness.random_1592.nextInt(i);
		KillTheRNG.randomness.random_1592.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1593_19(Random rand) {
//		return KillTheRNG.randomness.random_1593.nextFloat();
		KillTheRNG.randomness.random_1593.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1594_20(Random rand) {
//		return KillTheRNG.randomness.random_1594.nextFloat();
		KillTheRNG.randomness.random_1594.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1595_21(Random rand) {
//		return KillTheRNG.randomness.random_1595.nextFloat();
		KillTheRNG.randomness.random_1595.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1596_22(Random rand) {
//		return KillTheRNG.randomness.random_1596.nextFloat();
		KillTheRNG.randomness.random_1596.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_random_1597_23(Random rand) {
//		return KillTheRNG.randomness.random_1597.nextLong();
		KillTheRNG.randomness.random_1597.nextLong();
		return rand.nextLong();
	}

}
