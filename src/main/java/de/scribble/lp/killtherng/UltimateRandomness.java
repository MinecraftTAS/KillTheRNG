package de.scribble.lp.killtherng;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Maps;

import de.scribble.lp.killtherng.custom.CustomRandom;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.text.TextFormatting;

public class UltimateRandomness {
	public static Map<String, CustomRandom> RandomList= Maps.<String, CustomRandom>newHashMap();

	public static CustomRandom entitySoundSwim;
	public static CustomRandom entitySoundExtinguishFire;
	public static CustomRandom entitySoundSplash;
	public static CustomRandom entityParticleWaterBubble;
	public static CustomRandom entityParticleWaterSplash;
	public static CustomRandom entityParticleRunning;
	
	
	public static void set(long masterSeed, boolean isPseudo) {
		RandomList.put("entitySoundSwim",entitySoundSwim=new CustomRandom(masterSeed, isPseudo, TextFormatting.GOLD+"entitySoundSwim", TextFormatting.GRAY+"Changes the pitch of the sound, when an entity is walking in water", "1.0F + (this.rand."+TextFormatting.GREEN+"nextFloat"+TextFormatting.RESET+"() - rand."+TextFormatting.GREEN+"nextFloat"+TextFormatting.RESET+"()) * 0.4F"));
		RandomList.put("entitySoundExtinguishFire", entitySoundExtinguishFire=new CustomRandom(masterSeed, isPseudo, TextFormatting.GOLD+"entitySoundExtinguishFire", TextFormatting.GRAY+"Changes the pitch of the sound, when an entity is walking in water while burning", "1.6F + (this.rand."+TextFormatting.GREEN+"nextFloat"+TextFormatting.RESET+"() - rand."+TextFormatting.GREEN+"nextFloat"+TextFormatting.RESET+"()) * 0.4F"));
		RandomList.put("entitySoundSplash", entitySoundSplash= new CustomRandom(masterSeed, isPseudo, TextFormatting.GOLD+"entitySoundSplash", TextFormatting.GRAY+"Changes the pitch of the sound, when an entity is entering water", "1.0F + (random."+TextFormatting.GREEN+"nextFloat"+TextFormatting.RESET+"() - rand."+TextFormatting.GREEN+"nextFloat"+TextFormatting.RESET+"()) * 0.4F"));
		RandomList.put("entityParticleWaterBubble", entityParticleWaterBubble= new CustomRandom(masterSeed, isPseudo, TextFormatting.GOLD+"entityParticleWaterBubble", TextFormatting.GRAY+"Changes the x and z coordinates relative to the entity, where the waterbubble particles spawn", "this.rand."+TextFormatting.GREEN+"nextFloat"+TextFormatting.RESET+"() * 2.0F - 1.0F) * this.width"));
		RandomList.put("entityParticleWaterSplash", entityParticleWaterSplash= new CustomRandom(masterSeed, isPseudo, TextFormatting.GOLD+"entityParticleWaterSplash", TextFormatting.GRAY+"Changes the x and z coordinates relative to the entity, where the watersplash particles spawn", "this.rand."+TextFormatting.GREEN+"nextFloat"+TextFormatting.RESET+"() * 2.0F - 1.0F) * this.width"));
		RandomList.put("entityParticleRunning", entityParticleRunning= new CustomRandom(masterSeed, isPseudo, TextFormatting.GOLD+"entityParticleRunning", TextFormatting.GRAY+"Changes the x and z coordinates relative to the entity, where the running particles spawn", "this.posX + ((double)this.rand."+TextFormatting.GREEN+"nextFloat"+TextFormatting.RESET+"() - 0.5D) * (double)this.width"));
	}
	public static void setSeedAll(long masterSeed) {
		RandomList.forEach((k,v) -> v.setSeed(masterSeed));
	}
	public static void setPseudoAll(boolean pseudoIn) {
		RandomList.forEach((k,v) -> v.pseudoRandom=pseudoIn);
	}
	public static CustomRandom getRandomFromString(String stringIn) {
		return RandomList.get(stringIn);
	}
	public static boolean isRandomInList(String stringIn) {
		return RandomList.containsKey(stringIn);
	}
	public static boolean isRandominList(CustomRandom crandomIn) {
		return RandomList.containsValue(crandomIn);
	}
	public static String[] randomKeysAsStringArray() {
		return Arrays.copyOf(RandomList.keySet().toArray(),RandomList.keySet().size(), String[].class);
	}
	public static String getNameFromRandom(String stringIn) {
		return getRandomFromString(stringIn).getName();
	}
	public static String getDescriptionFromRandom(String stringIn) {
		return getRandomFromString(stringIn).getDescription();
	}
	/**
	 * Returns the variable how it's seen in the code and not the actual variable itself
	 * This should be useful for seedcracking without having to look up how the variable is represented in the code
	 * @param stringIn
	 * @return
	 */
	public static String getRandomVariableFromRandom(String stringIn) {
		return getRandomFromString(stringIn).getRandomvariable();
	}
}
