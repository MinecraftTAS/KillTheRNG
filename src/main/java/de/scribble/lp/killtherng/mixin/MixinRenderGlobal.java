package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.renderer.RenderGlobal;

@Mixin(RenderGlobal.class)
public class MixinRenderGlobal {
	@Redirect(method = "renderStars(Lnet/minecraft/client/renderer/BufferBuilder;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1270(Random rand) {
		return KillTheRNG.randomness.random_1270.nextFloat();
	}

	@Redirect(method = "renderStars(Lnet/minecraft/client/renderer/BufferBuilder;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1271(Random rand) {
		return KillTheRNG.randomness.random_1271.nextFloat();
	}

	@Redirect(method = "renderStars(Lnet/minecraft/client/renderer/BufferBuilder;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1272(Random rand) {
		return KillTheRNG.randomness.random_1272.nextFloat();
	}

	@Redirect(method = "renderStars(Lnet/minecraft/client/renderer/BufferBuilder;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1273(Random rand) {
		return KillTheRNG.randomness.random_1273.nextFloat();
	}

	@Redirect(method = "renderStars(Lnet/minecraft/client/renderer/BufferBuilder;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_1274(Random rand) {
		return KillTheRNG.randomness.random_1274.nextDouble();
	}

	@Redirect(method = "calculateParticleLevel(Z)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1275(Random rand, int i) {
		return KillTheRNG.randomness.random_1275.nextInt(i);
	}

	@Redirect(method = "calculateParticleLevel(Z)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1276(Random rand, int i) {
		return KillTheRNG.randomness.random_1276.nextInt(i);
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1277(Random rand) {
		return KillTheRNG.randomness.random_1277.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1278(Random rand) {
		return KillTheRNG.randomness.random_1278.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1279(Random rand) {
		return KillTheRNG.randomness.random_1279.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1280(Random rand) {
		return KillTheRNG.randomness.random_1280.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_1281(Random rand) {
		return KillTheRNG.randomness.random_1281.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_1282(Random rand) {
		return KillTheRNG.randomness.random_1282.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_1283(Random rand) {
		return KillTheRNG.randomness.random_1283.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_random_1284(Random rand) {
		return KillTheRNG.randomness.random_1284.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 8))
	public float redirect_random_1285(Random rand) {
		return KillTheRNG.randomness.random_1285.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 9))
	public float redirect_random_1286(Random rand) {
		return KillTheRNG.randomness.random_1286.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 10))
	public float redirect_random_1287(Random rand) {
		return KillTheRNG.randomness.random_1287.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 11))
	public float redirect_random_1288(Random rand) {
		return KillTheRNG.randomness.random_1288.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 12))
	public float redirect_random_1289(Random rand) {
		return KillTheRNG.randomness.random_1289.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 13))
	public float redirect_random_1290(Random rand) {
		return KillTheRNG.randomness.random_1290.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 14))
	public float redirect_random_1291(Random rand) {
		return KillTheRNG.randomness.random_1291.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 15))
	public float redirect_random_1292(Random rand) {
		return KillTheRNG.randomness.random_1292.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 16))
	public float redirect_random_1293(Random rand) {
		return KillTheRNG.randomness.random_1293.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 17))
	public float redirect_random_1294(Random rand) {
		return KillTheRNG.randomness.random_1294.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 18))
	public float redirect_random_1295(Random rand) {
		return KillTheRNG.randomness.random_1295.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 19))
	public float redirect_random_1296(Random rand) {
		return KillTheRNG.randomness.random_1296.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 20))
	public float redirect_random_1297(Random rand) {
		return KillTheRNG.randomness.random_1297.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 21))
	public float redirect_random_1298(Random rand) {
		return KillTheRNG.randomness.random_1298.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 22))
	public float redirect_random_1299(Random rand) {
		return KillTheRNG.randomness.random_1299.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 23))
	public float redirect_random_1300(Random rand) {
		return KillTheRNG.randomness.random_1300.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 24))
	public float redirect_random_1301(Random rand) {
		return KillTheRNG.randomness.random_1301.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 25))
	public float redirect_random_1302(Random rand) {
		return KillTheRNG.randomness.random_1302.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 26))
	public float redirect_random_1303(Random rand) {
		return KillTheRNG.randomness.random_1303.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 27))
	public float redirect_random_1304(Random rand) {
		return KillTheRNG.randomness.random_1304.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 28))
	public float redirect_random_1305(Random rand) {
		return KillTheRNG.randomness.random_1305.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 29))
	public float redirect_random_1306(Random rand) {
		return KillTheRNG.randomness.random_1306.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 30))
	public float redirect_random_1307(Random rand) {
		return KillTheRNG.randomness.random_1307.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 31))
	public float redirect_random_1308(Random rand) {
		return KillTheRNG.randomness.random_1308.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 32))
	public float redirect_random_1309(Random rand) {
		return KillTheRNG.randomness.random_1309.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 33))
	public float redirect_random_1310(Random rand) {
		return KillTheRNG.randomness.random_1310.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 34))
	public float redirect_random_1311(Random rand) {
		return KillTheRNG.randomness.random_1311.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 35))
	public float redirect_random_1312(Random rand) {
		return KillTheRNG.randomness.random_1312.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 36))
	public float redirect_random_1313(Random rand) {
		return KillTheRNG.randomness.random_1313.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 37))
	public float redirect_random_1314(Random rand) {
		return KillTheRNG.randomness.random_1314.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 38))
	public float redirect_random_1315(Random rand) {
		return KillTheRNG.randomness.random_1315.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 39))
	public float redirect_random_1316(Random rand) {
		return KillTheRNG.randomness.random_1316.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 40))
	public double redirect_random_1317(Random rand) {
		return KillTheRNG.randomness.random_1317.nextDouble();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 41))
	public double redirect_random_1318(Random rand) {
		return KillTheRNG.randomness.random_1318.nextDouble();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 42))
	public double redirect_random_1319(Random rand) {
		return KillTheRNG.randomness.random_1319.nextDouble();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 43))
	public double redirect_random_1320(Random rand) {
		return KillTheRNG.randomness.random_1320.nextDouble();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 44))
	public double redirect_random_1321(Random rand) {
		return KillTheRNG.randomness.random_1321.nextGaussian();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 45))
	public double redirect_random_1322(Random rand) {
		return KillTheRNG.randomness.random_1322.nextGaussian();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 46))
	public double redirect_random_1323(Random rand) {
		return KillTheRNG.randomness.random_1323.nextGaussian();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 47))
	public double redirect_random_1324(Random rand) {
		return KillTheRNG.randomness.random_1324.nextGaussian();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 48))
	public double redirect_random_1325(Random rand) {
		return KillTheRNG.randomness.random_1325.nextDouble();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 49))
	public double redirect_random_1326(Random rand) {
		return KillTheRNG.randomness.random_1326.nextGaussian();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 50))
	public double redirect_random_1327(Random rand) {
		return KillTheRNG.randomness.random_1327.nextDouble();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 51))
	public double redirect_random_1328(Random rand) {
		return KillTheRNG.randomness.random_1328.nextDouble();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 52))
	public double redirect_random_1329(Random rand) {
		return KillTheRNG.randomness.random_1329.nextDouble();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 53))
	public float redirect_random_1330(Random rand) {
		return KillTheRNG.randomness.random_1330.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 54))
	public float redirect_random_1331(Random rand) {
		return KillTheRNG.randomness.random_1331.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 55))
	public double redirect_random_1332(Random rand) {
		return KillTheRNG.randomness.random_1332.nextGaussian();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 56))
	public double redirect_random_1333(Random rand) {
		return KillTheRNG.randomness.random_1333.nextDouble();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 57))
	public double redirect_random_1334(Random rand) {
		return KillTheRNG.randomness.random_1334.nextGaussian();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 58))
	public float redirect_random_1335(Random rand) {
		return KillTheRNG.randomness.random_1335.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 59))
	public float redirect_random_1336(Random rand) {
		return KillTheRNG.randomness.random_1336.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 60))
	public float redirect_random_1337(Random rand) {
		return KillTheRNG.randomness.random_1337.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 61))
	public float redirect_random_1338(Random rand) {
		return KillTheRNG.randomness.random_1338.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 62))
	public float redirect_random_1339(Random rand) {
		return KillTheRNG.randomness.random_1339.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 63))
	public double redirect_random_1340(Random rand) {
		return KillTheRNG.randomness.random_1340.nextDouble();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 64))
	public float redirect_random_1341(Random rand) {
		return KillTheRNG.randomness.random_1341.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 65))
	public float redirect_random_1342(Random rand) {
		return KillTheRNG.randomness.random_1342.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 66))
	public float redirect_random_1343(Random rand) {
		return KillTheRNG.randomness.random_1343.nextFloat();
	}

	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 67))
	public float redirect_random_1344(Random rand) {
		return KillTheRNG.randomness.random_1344.nextFloat();
	}

}
