package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraft.world.gen.structure.WoodlandMansionPieces$FirstFloor")
public class MixinWoodlandMansionPieces$FirstFloor{

	/**
	* Type and Direction of Woodland Mansion Pieces
	*/
	@Redirect(method = "get1x1(Ljava/util/Random;)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_woodlandMansionRng_1(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.woodlandMansionRng.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.woodlandMansionRng.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Type and Direction of Woodland Mansion Pieces
	*/
	@Redirect(method = "get1x1Secret(Ljava/util/Random;)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_woodlandMansionRng_2(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.woodlandMansionRng.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.woodlandMansionRng.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Type and Direction of Woodland Mansion Pieces
	*/
	@Redirect(method = "get1x2FrontEntrance(Ljava/util/Random;Z)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_woodlandMansionRng_3(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.woodlandMansionRng.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.woodlandMansionRng.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Type and Direction of Woodland Mansion Pieces
	*/
	@Redirect(method = "get1x2Secret(Ljava/util/Random;)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_woodlandMansionRng_4(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.woodlandMansionRng.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.woodlandMansionRng.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Type and Direction of Woodland Mansion Pieces
	*/
	@Redirect(method = "get1x2SideEntrance(Ljava/util/Random;Z)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_woodlandMansionRng_5(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.woodlandMansionRng.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.woodlandMansionRng.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Type and Direction of Woodland Mansion Pieces
	*/
	@Redirect(method = "get2x2(Ljava/util/Random;)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_woodlandMansionRng_6(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.woodlandMansionRng.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.woodlandMansionRng.nextInt(i);
		return rand.nextInt(i);
	}


}