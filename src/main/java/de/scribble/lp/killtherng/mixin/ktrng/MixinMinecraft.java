package de.scribble.lp.killtherng.mixin.ktrng;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import de.scribble.lp.killtherng.KillTheRNG;
import de.scribble.lp.killtherng.SeedingModes;
import net.minecraft.client.Minecraft;

@Mixin(Minecraft.class)
public class MixinMinecraft {
	
	@Inject(method = "runTickKeyboard", at = @At(value = "INVOKE", target = "Lorg/lwjgl/input/Keyboard;getEventKey()I", remap = false, ordinal = 0))
	public void changeSeedKeyboard(CallbackInfo ci) {
		if(!KillTheRNG.isLibrary) {
			SeedingModes.nextPlayerInput();
		}
	}
	
	@Inject(method = "runTickMouse", at = @At(value = "INVOKE", target = "Lorg/lwjgl/input/Mouse;getEventButton()I", remap = false, ordinal = 0))
	public void changeSeedMouse(CallbackInfo ci) {
		if(!KillTheRNG.isLibrary) {
			SeedingModes.nextPlayerInput();
		}
	}
	
}
