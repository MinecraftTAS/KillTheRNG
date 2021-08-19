package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.MapGenCaves;

@Mixin(MapGenCaves.class)
public class MixinMapGenCaves {
	@Redirect(method = "addRoom(JIILnet/minecraft/world/chunk/ChunkPrimer;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1541(Random rand) {
		return KillTheRNG.randomness.random_1541.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1542(Random rand, int i) {
		return KillTheRNG.randomness.random_1542.nextInt(i);
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1543(Random rand, int i) {
		return KillTheRNG.randomness.random_1543.nextInt(i);
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1544(Random rand, int i) {
		return KillTheRNG.randomness.random_1544.nextInt(i);
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1545(Random rand) {
		return KillTheRNG.randomness.random_1545.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_1546(Random rand) {
		return KillTheRNG.randomness.random_1546.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_1547(Random rand) {
		return KillTheRNG.randomness.random_1547.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_1548(Random rand) {
		return KillTheRNG.randomness.random_1548.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_random_1549(Random rand) {
		return KillTheRNG.randomness.random_1549.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 8))
	public float redirect_random_1550(Random rand) {
		return KillTheRNG.randomness.random_1550.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 9))
	public long redirect_random_1551(Random rand) {
		return KillTheRNG.randomness.random_1551.nextLong();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 10))
	public float redirect_random_1552(Random rand) {
		return KillTheRNG.randomness.random_1552.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 11))
	public long redirect_random_1553(Random rand) {
		return KillTheRNG.randomness.random_1553.nextLong();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 12))
	public float redirect_random_1554(Random rand) {
		return KillTheRNG.randomness.random_1554.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 13))
	public int redirect_random_1555(Random rand, int i) {
		return KillTheRNG.randomness.random_1555.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1556(Random rand, int i) {
		return KillTheRNG.randomness.random_1556.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1557(Random rand, int i) {
		return KillTheRNG.randomness.random_1557.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1558(Random rand, int i) {
		return KillTheRNG.randomness.random_1558.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1559(Random rand, int i) {
		return KillTheRNG.randomness.random_1559.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1560(Random rand, int i) {
		return KillTheRNG.randomness.random_1560.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1561(Random rand, int i) {
		return KillTheRNG.randomness.random_1561.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_random_1562(Random rand, int i) {
		return KillTheRNG.randomness.random_1562.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_1563(Random rand, int i) {
		return KillTheRNG.randomness.random_1563.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_random_1564(Random rand, int i) {
		return KillTheRNG.randomness.random_1564.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 9))
	public long redirect_random_1565(Random rand) {
		return KillTheRNG.randomness.random_1565.nextLong();
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_random_1566(Random rand, int i) {
		return KillTheRNG.randomness.random_1566.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 11))
	public float redirect_random_1567(Random rand) {
		return KillTheRNG.randomness.random_1567.nextFloat();
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 12))
	public float redirect_random_1568(Random rand) {
		return KillTheRNG.randomness.random_1568.nextFloat();
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 13))
	public float redirect_random_1569(Random rand) {
		return KillTheRNG.randomness.random_1569.nextFloat();
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 14))
	public float redirect_random_1570(Random rand) {
		return KillTheRNG.randomness.random_1570.nextFloat();
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 15))
	public int redirect_random_1571(Random rand, int i) {
		return KillTheRNG.randomness.random_1571.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 16))
	public float redirect_random_1572(Random rand) {
		return KillTheRNG.randomness.random_1572.nextFloat();
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 17))
	public float redirect_random_1573(Random rand) {
		return KillTheRNG.randomness.random_1573.nextFloat();
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 18))
	public long redirect_random_1574(Random rand) {
		return KillTheRNG.randomness.random_1574.nextLong();
	}

}
