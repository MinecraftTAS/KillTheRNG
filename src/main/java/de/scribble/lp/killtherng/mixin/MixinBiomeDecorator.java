package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.biome.BiomeDecorator;

@Mixin(BiomeDecorator.class)
public class MixinBiomeDecorator {
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1114(Random rand, int i) {
		return KillTheRNG.randomness.random_1114.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1115(Random rand, int i) {
		return KillTheRNG.randomness.random_1115.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1116(Random rand, int i) {
		return KillTheRNG.randomness.random_1116.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1117(Random rand, int i) {
		return KillTheRNG.randomness.random_1117.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1118(Random rand, int i) {
		return KillTheRNG.randomness.random_1118.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1119(Random rand, int i) {
		return KillTheRNG.randomness.random_1119.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_1120(Random rand) {
		return KillTheRNG.randomness.random_1120.nextFloat();
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_1121(Random rand, int i) {
		return KillTheRNG.randomness.random_1121.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_random_1122(Random rand, int i) {
		return KillTheRNG.randomness.random_1122.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_random_1123(Random rand, int i) {
		return KillTheRNG.randomness.random_1123.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_random_1124(Random rand, int i) {
		return KillTheRNG.randomness.random_1124.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_random_1125(Random rand, int i) {
		return KillTheRNG.randomness.random_1125.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	public int redirect_random_1126(Random rand, int i) {
		return KillTheRNG.randomness.random_1126.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 13))
	public int redirect_random_1127(Random rand, int i) {
		return KillTheRNG.randomness.random_1127.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 14))
	public int redirect_random_1128(Random rand, int i) {
		return KillTheRNG.randomness.random_1128.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 15))
	public int redirect_random_1129(Random rand, int i) {
		return KillTheRNG.randomness.random_1129.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 16))
	public int redirect_random_1130(Random rand, int i) {
		return KillTheRNG.randomness.random_1130.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 17))
	public int redirect_random_1131(Random rand, int i) {
		return KillTheRNG.randomness.random_1131.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 18))
	public int redirect_random_1132(Random rand, int i) {
		return KillTheRNG.randomness.random_1132.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 19))
	public int redirect_random_1133(Random rand, int i) {
		return KillTheRNG.randomness.random_1133.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 20))
	public int redirect_random_1134(Random rand, int i) {
		return KillTheRNG.randomness.random_1134.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 21))
	public int redirect_random_1135(Random rand, int i) {
		return KillTheRNG.randomness.random_1135.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 22))
	public int redirect_random_1136(Random rand, int i) {
		return KillTheRNG.randomness.random_1136.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 23))
	public int redirect_random_1137(Random rand, int i) {
		return KillTheRNG.randomness.random_1137.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 24))
	public int redirect_random_1138(Random rand, int i) {
		return KillTheRNG.randomness.random_1138.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 25))
	public int redirect_random_1139(Random rand, int i) {
		return KillTheRNG.randomness.random_1139.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 26))
	public int redirect_random_1140(Random rand, int i) {
		return KillTheRNG.randomness.random_1140.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 27))
	public int redirect_random_1141(Random rand, int i) {
		return KillTheRNG.randomness.random_1141.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 28))
	public int redirect_random_1142(Random rand, int i) {
		return KillTheRNG.randomness.random_1142.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 29))
	public int redirect_random_1143(Random rand, int i) {
		return KillTheRNG.randomness.random_1143.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 30))
	public int redirect_random_1144(Random rand, int i) {
		return KillTheRNG.randomness.random_1144.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 31))
	public int redirect_random_1145(Random rand, int i) {
		return KillTheRNG.randomness.random_1145.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 32))
	public int redirect_random_1146(Random rand, int i) {
		return KillTheRNG.randomness.random_1146.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 33))
	public int redirect_random_1147(Random rand, int i) {
		return KillTheRNG.randomness.random_1147.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 34))
	public int redirect_random_1148(Random rand, int i) {
		return KillTheRNG.randomness.random_1148.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 35))
	public int redirect_random_1149(Random rand, int i) {
		return KillTheRNG.randomness.random_1149.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 36))
	public int redirect_random_1150(Random rand, int i) {
		return KillTheRNG.randomness.random_1150.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 37))
	public int redirect_random_1151(Random rand, int i) {
		return KillTheRNG.randomness.random_1151.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 38))
	public int redirect_random_1152(Random rand, int i) {
		return KillTheRNG.randomness.random_1152.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 39))
	public int redirect_random_1153(Random rand, int i) {
		return KillTheRNG.randomness.random_1153.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 40))
	public int redirect_random_1154(Random rand, int i) {
		return KillTheRNG.randomness.random_1154.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 41))
	public int redirect_random_1155(Random rand, int i) {
		return KillTheRNG.randomness.random_1155.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 42))
	public int redirect_random_1156(Random rand, int i) {
		return KillTheRNG.randomness.random_1156.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 43))
	public int redirect_random_1157(Random rand, int i) {
		return KillTheRNG.randomness.random_1157.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 44))
	public int redirect_random_1158(Random rand, int i) {
		return KillTheRNG.randomness.random_1158.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 45))
	public int redirect_random_1159(Random rand, int i) {
		return KillTheRNG.randomness.random_1159.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 46))
	public int redirect_random_1160(Random rand, int i) {
		return KillTheRNG.randomness.random_1160.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 47))
	public int redirect_random_1161(Random rand, int i) {
		return KillTheRNG.randomness.random_1161.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 48))
	public int redirect_random_1162(Random rand, int i) {
		return KillTheRNG.randomness.random_1162.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 49))
	public int redirect_random_1163(Random rand, int i) {
		return KillTheRNG.randomness.random_1163.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 50))
	public int redirect_random_1164(Random rand, int i) {
		return KillTheRNG.randomness.random_1164.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 51))
	public int redirect_random_1165(Random rand, int i) {
		return KillTheRNG.randomness.random_1165.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 52))
	public int redirect_random_1166(Random rand, int i) {
		return KillTheRNG.randomness.random_1166.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 53))
	public int redirect_random_1167(Random rand, int i) {
		return KillTheRNG.randomness.random_1167.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 54))
	public int redirect_random_1168(Random rand, int i) {
		return KillTheRNG.randomness.random_1168.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 55))
	public int redirect_random_1169(Random rand, int i) {
		return KillTheRNG.randomness.random_1169.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 56))
	public int redirect_random_1170(Random rand, int i) {
		return KillTheRNG.randomness.random_1170.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 57))
	public int redirect_random_1171(Random rand, int i) {
		return KillTheRNG.randomness.random_1171.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 58))
	public int redirect_random_1172(Random rand, int i) {
		return KillTheRNG.randomness.random_1172.nextInt(i);
	}

	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 59))
	public int redirect_random_1173(Random rand, int i) {
		return KillTheRNG.randomness.random_1173.nextInt(i);
	}

	@Redirect(method = "genStandardOre1(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1174(Random rand, int i) {
		return KillTheRNG.randomness.random_1174.nextInt(i);
	}

	@Redirect(method = "genStandardOre1(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1175(Random rand, int i) {
		return KillTheRNG.randomness.random_1175.nextInt(i);
	}

	@Redirect(method = "genStandardOre1(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1176(Random rand, int i) {
		return KillTheRNG.randomness.random_1176.nextInt(i);
	}

	@Redirect(method = "genStandardOre2(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1177(Random rand, int i) {
		return KillTheRNG.randomness.random_1177.nextInt(i);
	}

	@Redirect(method = "genStandardOre2(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1178(Random rand, int i) {
		return KillTheRNG.randomness.random_1178.nextInt(i);
	}

	@Redirect(method = "genStandardOre2(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1179(Random rand, int i) {
		return KillTheRNG.randomness.random_1179.nextInt(i);
	}

	@Redirect(method = "genStandardOre2(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1180(Random rand, int i) {
		return KillTheRNG.randomness.random_1180.nextInt(i);
	}

}
