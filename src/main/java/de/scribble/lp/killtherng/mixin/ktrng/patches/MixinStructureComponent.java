package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.StructureComponent.class)
public class MixinStructureComponent{

	/**
	* World Generation Utility
	*/
	@Redirect(method = "createDispenser(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;Lnet/minecraft/util/ResourceLocation;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_worldGenUtil_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.worldGenUtil.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.worldGenUtil.nextLong();
		} else {
				de.scribble.lp.killtherng.KillTheRNG.randomness.worldGenUtil.nextLong();
				return rand.nextLong();
		}
	}

	/**
	* World Generation Utility
	*/
	@Redirect(method = "generateChest(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/ResourceLocation;Lnet/minecraft/block/state/IBlockState;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_worldGenUtil_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.worldGenUtil.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.worldGenUtil.nextLong();
		} else {
				de.scribble.lp.killtherng.KillTheRNG.randomness.worldGenUtil.nextLong();
				return rand.nextLong();
		}
	}

	/**
	* World Generation Utility
	*/
	@Redirect(method = "generateMaybeBox(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Ljava/util/Random;FIIIIIILnet/minecraft/block/state/IBlockState;Lnet/minecraft/block/state/IBlockState;ZI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_worldGenUtil_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.worldGenUtil.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.worldGenUtil.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.worldGenUtil.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* World Generation Utility
	*/
	@Redirect(method = "randomlyPlaceBlock(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Ljava/util/Random;FIIILnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_worldGenUtil_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.worldGenUtil.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.worldGenUtil.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.worldGenUtil.nextFloat();
			return rand.nextFloat();
		}
	}


}