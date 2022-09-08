package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraft.world.gen.structure.WoodlandMansionPieces$Grid")
public class MixinWoodlandMansionPieces$Grid{

	/**
	* Type and Direction of Woodland Mansion Pieces
	*/
	@Redirect(method = "identifyRooms(Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$SimpleGrid;Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$SimpleGrid;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_woodlandMansionRng_1(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.woodlandMansionRng.nextBoolean();
		de.scribble.lp.killtherng.KillTheRNG.randomness.woodlandMansionRng.nextBoolean();
		return rand.nextBoolean();
	}

	/**
	* Type and Direction of Woodland Mansion Pieces
	*/
	@Redirect(method = "identifyRooms(Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$SimpleGrid;Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$SimpleGrid;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_woodlandMansionRng_2(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.woodlandMansionRng.nextBoolean();
		de.scribble.lp.killtherng.KillTheRNG.randomness.woodlandMansionRng.nextBoolean();
		return rand.nextBoolean();
	}

	/**
	* Type and Direction of Woodland Mansion Pieces
	*/
	@Redirect(method = "recursiveCorridor(Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$SimpleGrid;IILnet/minecraft/util/EnumFacing;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_woodlandMansionRng_3(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.woodlandMansionRng.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.woodlandMansionRng.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Type and Direction of Woodland Mansion Pieces
	*/
	@Redirect(method = "recursiveCorridor(Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$SimpleGrid;IILnet/minecraft/util/EnumFacing;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_woodlandMansionRng_4(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.woodlandMansionRng.nextBoolean();
		de.scribble.lp.killtherng.KillTheRNG.randomness.woodlandMansionRng.nextBoolean();
		return rand.nextBoolean();
	}

	/**
	* Type and Direction of Woodland Mansion Pieces
	*/
	@Redirect(method = "setupThirdFloor()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_woodlandMansionRng_5(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.woodlandMansionRng.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.woodlandMansionRng.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Type and Direction of Woodland Mansion Pieces
	*/
	@Redirect(method = "setupThirdFloor()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_woodlandMansionRng_6(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.woodlandMansionRng.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.woodlandMansionRng.nextInt(i);
		return rand.nextInt(i);
	}


}