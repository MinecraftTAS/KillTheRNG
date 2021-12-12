package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.biome.BiomeDecorator;

@Mixin(BiomeDecorator.class)
public class MixinBiomeDecorator {

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_biomeDecoration_1(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_biomeDecoration_2(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_biomeDecoration_3(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_biomeDecoration_4(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_biomeDecoration_5(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_biomeDecoration_6(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_biomeDecoration_7(Random rand) {
//		return KillTheRNG.randomness.biomeDecoration.nextFloat();
		KillTheRNG.randomness.biomeDecoration.nextFloat();
		return rand.nextFloat();
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_biomeDecoration_8(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_biomeDecoration_9(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_biomeDecoration_10(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_biomeDecoration_11(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_biomeDecoration_12(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_biomeDecoration_13(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	public int redirect_biomeDecoration_14(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 13))
	public int redirect_biomeDecoration_15(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 14))
	public int redirect_biomeDecoration_16(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 15))
	public int redirect_biomeDecoration_17(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 16))
	public int redirect_biomeDecoration_18(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 17))
	public int redirect_biomeDecoration_19(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 18))
	public int redirect_biomeDecoration_20(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 19))
	public int redirect_biomeDecoration_21(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 20))
	public int redirect_biomeDecoration_22(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 21))
	public int redirect_biomeDecoration_23(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 22))
	public int redirect_biomeDecoration_24(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 23))
	public int redirect_biomeDecoration_25(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 24))
	public int redirect_biomeDecoration_26(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 25))
	public int redirect_biomeDecoration_27(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 26))
	public int redirect_biomeDecoration_28(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 27))
	public int redirect_biomeDecoration_29(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 28))
	public int redirect_biomeDecoration_30(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 29))
	public int redirect_biomeDecoration_31(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 30))
	public int redirect_biomeDecoration_32(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 31))
	public int redirect_biomeDecoration_33(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 32))
	public int redirect_biomeDecoration_34(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 33))
	public int redirect_biomeDecoration_35(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 34))
	public int redirect_biomeDecoration_36(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 35))
	public int redirect_biomeDecoration_37(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 36))
	public int redirect_biomeDecoration_38(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 37))
	public int redirect_biomeDecoration_39(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 38))
	public int redirect_biomeDecoration_40(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 39))
	public int redirect_biomeDecoration_41(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 40))
	public int redirect_biomeDecoration_42(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 41))
	public int redirect_biomeDecoration_43(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 42))
	public int redirect_biomeDecoration_44(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 43))
	public int redirect_biomeDecoration_45(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 44))
	public int redirect_biomeDecoration_46(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 45))
	public int redirect_biomeDecoration_47(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 46))
	public int redirect_biomeDecoration_48(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 47))
	public int redirect_biomeDecoration_49(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 48))
	public int redirect_biomeDecoration_50(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 49))
	public int redirect_biomeDecoration_51(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 50))
	public int redirect_biomeDecoration_52(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 51))
	public int redirect_biomeDecoration_53(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 52))
	public int redirect_biomeDecoration_54(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 53))
	public int redirect_biomeDecoration_55(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 54))
	public int redirect_biomeDecoration_56(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 55))
	public int redirect_biomeDecoration_57(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 56))
	public int redirect_biomeDecoration_58(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 57))
	public int redirect_biomeDecoration_59(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 58))
	public int redirect_biomeDecoration_60(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genStandardOre1(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_biomeDecoration_61(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genStandardOre1(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_biomeDecoration_62(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genStandardOre1(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_biomeDecoration_63(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genStandardOre2(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_biomeDecoration_64(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genStandardOre2(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_biomeDecoration_65(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genStandardOre2(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_biomeDecoration_66(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Biome Decoration
	*/
	@Redirect(method = "genStandardOre2(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_biomeDecoration_67(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDecoration.nextInt(i);
		KillTheRNG.randomness.biomeDecoration.nextInt(i);
		return rand.nextInt(i);
	}

}
