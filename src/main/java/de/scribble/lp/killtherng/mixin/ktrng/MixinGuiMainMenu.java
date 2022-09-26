package de.scribble.lp.killtherng.mixin.ktrng;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.lwjgl.input.Keyboard;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;

/**
 * This adds the seeds to the IngameMenu and makes a simple way to edit it.
 * @author Pancake
 * 
 * * * * * * * * * * * * * * * * * * * * * * *
 * Updated to KillTheRNG by Scribble 29.08.21
 * Removed the necessity to set 3 seeds in total
 */
@Mixin(GuiMainMenu.class)
public abstract class MixinGuiMainMenu extends GuiScreen {

	private String currentSeed = "";
	
	int blinkCursor = 0;
	
	@Override
	public void updateScreen() {
		blinkCursor++;
		super.updateScreen();
	}
	
	/**
	 * Displays all seeds
	 * @author Pancake
	 * @param ci Mixin
	 * 
	 * * * * * *
	 * Scribble: Trimmed down a bit...
	 */
	@Inject(at = @At("RETURN"), method = "drawScreen")
	public void drawMore(CallbackInfo ci) {
		
		drawString(mc.fontRenderer, "[DEL] to clear the seed.", 1, 2, 0xFFFFFF);
		
		// Draw Seeds
		drawString(mc.fontRenderer, "Seed: " + currentSeed + ((blinkCursor % 20 < 10) ? "_" : ""), 1, 14, 0xFFFFFF);
	}
	
	/**
	 * Watch for the keys 'TAB', 'BACK', 'DEL' and do something.
	 * And watch for all digits and add them to the current seed
	 */
	@Override
	protected void keyTyped(char typedChar, int keyCode) throws IOException {
		if (keyCode == 14) {
			if (currentSeed.length() != 0) {
				currentSeed = currentSeed.substring(0, currentSeed.length() - 1);
			}
			
		} else if (keyCode == 211) {
			currentSeed = "";
			
		} else if (Character.isDigit(typedChar) && (currentSeed.length() + 1) <= 18) {
			currentSeed += typedChar;
			
		} else if (keyCode==1) {
			return;
		} else if (isCtrlKeyDown()&&keyCode==47) {
			Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
			String out="";
			try {
				out=(String) c.getData(DataFlavor.stringFlavor);
			} catch (UnsupportedFlavorException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				Long.parseLong(out);
			} catch (NumberFormatException e) {
				return;
			}
			currentSeed=out;
			
		} else if (isCtrlKeyDown()&&keyCode==46) {
			StringSelection selection = new StringSelection(currentSeed);
			Clipboard c =Toolkit.getDefaultToolkit().getSystemClipboard();
			c.setContents(selection, selection);
		}
		KillTheRNG.clientRandom.setSeedAll(Long.parseLong(currentSeed.isEmpty() ? "0" : currentSeed));
		super.keyTyped(typedChar, keyCode);
	}
	
	@Override
	public void onGuiClosed() {
		Keyboard.enableRepeatEvents(false);
		super.onGuiClosed();
	}
}
