package de.scribble.lp.killtherng.mixin.ktrng.patches;

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
	public float redirect_random_1541_1(Random rand) {
//		return KillTheRNG.randomness.random_1541.nextFloat();
		KillTheRNG.randomness.random_1541.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1542_2(Random rand, int i) {
//		return KillTheRNG.randomness.random_1542.nextInt(i);
		KillTheRNG.randomness.random_1542.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1543_3(Random rand, int i) {
//		return KillTheRNG.randomness.random_1543.nextInt(i);
		KillTheRNG.randomness.random_1543.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1544_4(Random rand, int i) {
//		return KillTheRNG.randomness.random_1544.nextInt(i);
		KillTheRNG.randomness.random_1544.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1545_5(Random rand) {
//		return KillTheRNG.randomness.random_1545.nextFloat();
		KillTheRNG.randomness.random_1545.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1546_6(Random rand) {
//		return KillTheRNG.randomness.random_1546.nextFloat();
		KillTheRNG.randomness.random_1546.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1547_7(Random rand) {
//		return KillTheRNG.randomness.random_1547.nextFloat();
		KillTheRNG.randomness.random_1547.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1548_8(Random rand) {
//		return KillTheRNG.randomness.random_1548.nextFloat();
		KillTheRNG.randomness.random_1548.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_1549_9(Random rand) {
//		return KillTheRNG.randomness.random_1549.nextFloat();
		KillTheRNG.randomness.random_1549.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_1550_10(Random rand) {
//		return KillTheRNG.randomness.random_1550.nextFloat();
		KillTheRNG.randomness.random_1550.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_random_1551_11(Random rand) {
//		return KillTheRNG.randomness.random_1551.nextLong();
		KillTheRNG.randomness.random_1551.nextLong();
		return rand.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_1552_12(Random rand) {
//		return KillTheRNG.randomness.random_1552.nextFloat();
		KillTheRNG.randomness.random_1552.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	public long redirect_random_1553_13(Random rand) {
//		return KillTheRNG.randomness.random_1553.nextLong();
		KillTheRNG.randomness.random_1553.nextLong();
		return rand.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_random_1554_14(Random rand) {
//		return KillTheRNG.randomness.random_1554.nextFloat();
		KillTheRNG.randomness.random_1554.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1555_15(Random rand, int i) {
//		return KillTheRNG.randomness.random_1555.nextInt(i);
		KillTheRNG.randomness.random_1555.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1556_16(Random rand, int i) {
//		return KillTheRNG.randomness.random_1556.nextInt(i);
		KillTheRNG.randomness.random_1556.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1557_17(Random rand, int i) {
//		return KillTheRNG.randomness.random_1557.nextInt(i);
		KillTheRNG.randomness.random_1557.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1558_18(Random rand, int i) {
//		return KillTheRNG.randomness.random_1558.nextInt(i);
		KillTheRNG.randomness.random_1558.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1559_19(Random rand, int i) {
//		return KillTheRNG.randomness.random_1559.nextInt(i);
		KillTheRNG.randomness.random_1559.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1560_20(Random rand, int i) {
//		return KillTheRNG.randomness.random_1560.nextInt(i);
		KillTheRNG.randomness.random_1560.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1561_21(Random rand, int i) {
//		return KillTheRNG.randomness.random_1561.nextInt(i);
		KillTheRNG.randomness.random_1561.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_random_1562_22(Random rand, int i) {
//		return KillTheRNG.randomness.random_1562.nextInt(i);
		KillTheRNG.randomness.random_1562.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_1563_23(Random rand, int i) {
//		return KillTheRNG.randomness.random_1563.nextInt(i);
		KillTheRNG.randomness.random_1563.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_random_1564_24(Random rand, int i) {
//		return KillTheRNG.randomness.random_1564.nextInt(i);
		KillTheRNG.randomness.random_1564.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_random_1565_25(Random rand) {
//		return KillTheRNG.randomness.random_1565.nextLong();
		KillTheRNG.randomness.random_1565.nextLong();
		return rand.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_random_1566_26(Random rand, int i) {
//		return KillTheRNG.randomness.random_1566.nextInt(i);
		KillTheRNG.randomness.random_1566.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1567_27(Random rand) {
//		return KillTheRNG.randomness.random_1567.nextFloat();
		KillTheRNG.randomness.random_1567.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1568_28(Random rand) {
//		return KillTheRNG.randomness.random_1568.nextFloat();
		KillTheRNG.randomness.random_1568.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1569_29(Random rand) {
//		return KillTheRNG.randomness.random_1569.nextFloat();
		KillTheRNG.randomness.random_1569.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1570_30(Random rand) {
//		return KillTheRNG.randomness.random_1570.nextFloat();
		KillTheRNG.randomness.random_1570.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_random_1571_31(Random rand, int i) {
//		return KillTheRNG.randomness.random_1571.nextInt(i);
		KillTheRNG.randomness.random_1571.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_1572_32(Random rand) {
//		return KillTheRNG.randomness.random_1572.nextFloat();
		KillTheRNG.randomness.random_1572.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_1573_33(Random rand) {
//		return KillTheRNG.randomness.random_1573.nextFloat();
		KillTheRNG.randomness.random_1573.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	public long redirect_random_1574_34(Random rand) {
//		return KillTheRNG.randomness.random_1574.nextLong();
		KillTheRNG.randomness.random_1574.nextLong();
		return rand.nextLong();
	}

}
