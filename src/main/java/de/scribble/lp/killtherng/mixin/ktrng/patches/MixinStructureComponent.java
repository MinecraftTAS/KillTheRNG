package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureComponent;

@Mixin(StructureComponent.class)
public class MixinStructureComponent {

	/**
	* null
	*/
	@Redirect(method = "generateMaybeBox(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Ljava/util/Random;FIIIIIILnet/minecraft/block/state/IBlockState;Lnet/minecraft/block/state/IBlockState;ZI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1651_1(Random rand) {
		return KillTheRNG.randomness.random_1651.nextFloat();
//		KillTheRNG.randomness.random_1651.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "randomlyPlaceBlock(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Ljava/util/Random;FIIILnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1652_2(Random rand) {
		return KillTheRNG.randomness.random_1652.nextFloat();
//		KillTheRNG.randomness.random_1652.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "generateChest(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/ResourceLocation;Lnet/minecraft/block/state/IBlockState;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_random_1653_3(Random rand) {
		return KillTheRNG.randomness.random_1653.nextLong();
//		KillTheRNG.randomness.random_1653.nextLong();
//		return rand.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "createDispenser(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;Lnet/minecraft/util/ResourceLocation;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_random_1654_4(Random rand) {
		return KillTheRNG.randomness.random_1654.nextLong();
//		KillTheRNG.randomness.random_1654.nextLong();
//		return rand.nextLong();
	}

}