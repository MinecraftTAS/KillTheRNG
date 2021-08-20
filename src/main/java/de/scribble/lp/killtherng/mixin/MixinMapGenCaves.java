package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.MapGenCaves;

@Mixin(MapGenCaves.class)
public class MixinMapGenCaves {

	/**
	* null
	*/
	@Redirect(method = "addRoom(JIILnet/minecraft/world/chunk/ChunkPrimer;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1541_0(Random rand) {
		return KillTheRNG.randomness.random_1541.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1542_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1542.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1543_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1543.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1544_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1544.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1545_3(Random rand) {
		return KillTheRNG.randomness.random_1545.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_1546_4(Random rand) {
		return KillTheRNG.randomness.random_1546.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_1547_5(Random rand) {
		return KillTheRNG.randomness.random_1547.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_1548_6(Random rand) {
		return KillTheRNG.randomness.random_1548.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_random_1549_7(Random rand) {
		return KillTheRNG.randomness.random_1549.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 8))
	public float redirect_random_1550_8(Random rand) {
		return KillTheRNG.randomness.random_1550.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 9))
	public long redirect_random_1551_9(Random rand) {
		return KillTheRNG.randomness.random_1551.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 10))
	public float redirect_random_1552_10(Random rand) {
		return KillTheRNG.randomness.random_1552.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 11))
	public long redirect_random_1553_11(Random rand) {
		return KillTheRNG.randomness.random_1553.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 12))
	public float redirect_random_1554_12(Random rand) {
		return KillTheRNG.randomness.random_1554.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 13))
	public int redirect_random_1555_13(Random rand, int i) {
		return KillTheRNG.randomness.random_1555.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1556_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1556.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1557_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1557.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1558_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1558.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1559_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1559.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1560_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1560.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1561_5(Random rand, int i) {
		return KillTheRNG.randomness.random_1561.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_random_1562_6(Random rand, int i) {
		return KillTheRNG.randomness.random_1562.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_1563_7(Random rand, int i) {
		return KillTheRNG.randomness.random_1563.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_random_1564_8(Random rand, int i) {
		return KillTheRNG.randomness.random_1564.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 9))
	public long redirect_random_1565_9(Random rand) {
		return KillTheRNG.randomness.random_1565.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_random_1566_10(Random rand, int i) {
		return KillTheRNG.randomness.random_1566.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 11))
	public float redirect_random_1567_11(Random rand) {
		return KillTheRNG.randomness.random_1567.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 12))
	public float redirect_random_1568_12(Random rand) {
		return KillTheRNG.randomness.random_1568.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 13))
	public float redirect_random_1569_13(Random rand) {
		return KillTheRNG.randomness.random_1569.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 14))
	public float redirect_random_1570_14(Random rand) {
		return KillTheRNG.randomness.random_1570.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 15))
	public int redirect_random_1571_15(Random rand, int i) {
		return KillTheRNG.randomness.random_1571.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 16))
	public float redirect_random_1572_16(Random rand) {
		return KillTheRNG.randomness.random_1572.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 17))
	public float redirect_random_1573_17(Random rand) {
		return KillTheRNG.randomness.random_1573.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 18))
	public long redirect_random_1574_18(Random rand) {
		return KillTheRNG.randomness.random_1574.nextLong();
	}

}
