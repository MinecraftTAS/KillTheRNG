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
	public static CustomRandom entityAgeableParticleVillagerHappy;
	
	public static CustomRandom blockrotationprocessorProcessBlock;
	
	
	public static void set(long masterSeed, boolean isPseudo) {
		RandomList.put("entitySoundSwim",entitySoundSwim=new CustomRandom(masterSeed, isPseudo, "entitySoundSwim", TextFormatting.GRAY+"Changes the pitch of the sound, when an entity is walking in water", "1.0F + (this.rand."+TextFormatting.GREEN+"nextFloat"+TextFormatting.RESET+"() - rand."+TextFormatting.GREEN+"nextFloat"+TextFormatting.RESET+"()) * 0.4F"));
		RandomList.put("entitySoundExtinguishFire", entitySoundExtinguishFire=new CustomRandom(masterSeed, isPseudo, "entitySoundExtinguishFire", TextFormatting.GRAY+"Changes the pitch of the sound, when an entity is walking in water while burning", "1.6F + (this.rand."+TextFormatting.GREEN+"nextFloat"+TextFormatting.RESET+"() - rand."+TextFormatting.GREEN+"nextFloat"+TextFormatting.RESET+"()) * 0.4F"));
		RandomList.put("entitySoundSplash", entitySoundSplash= new CustomRandom(masterSeed, isPseudo, "entitySoundSplash", TextFormatting.GRAY+"Changes the pitch of the sound, when an entity is entering water", "1.0F + (random."+TextFormatting.GREEN+"nextFloat"+TextFormatting.RESET+"() - rand."+TextFormatting.GREEN+"nextFloat"+TextFormatting.RESET+"()) * 0.4F"));
		RandomList.put("entityParticleWaterBubble", entityParticleWaterBubble= new CustomRandom(masterSeed, isPseudo, "entityParticleWaterBubble", TextFormatting.GRAY+"Changes the x and z coordinates relative to the entity, where the waterbubble particles spawn", "this.rand."+TextFormatting.GREEN+"nextFloat"+TextFormatting.RESET+"() * 2.0F - 1.0F) * this.width"));
		RandomList.put("entityParticleWaterSplash", entityParticleWaterSplash= new CustomRandom(masterSeed, isPseudo, "entityParticleWaterSplash", TextFormatting.GRAY+"Changes the x and z coordinates relative to the entity, where the watersplash particles spawn", "this.rand."+TextFormatting.GREEN+"nextFloat"+TextFormatting.RESET+"() * 2.0F - 1.0F) * this.width"));
		RandomList.put("entityParticleRunning", entityParticleRunning= new CustomRandom(masterSeed, isPseudo, "entityParticleRunning", TextFormatting.GRAY+"Changes the x and z coordinates relative to the entity, where the running particles spawn", "this.posX + ((double)this.rand."+TextFormatting.GREEN+"nextFloat"+TextFormatting.RESET+"() - 0.5D) * (double)this.width"));
		RandomList.put("entityAgeableParticleVillagerHappy", entityAgeableParticleVillagerHappy= new CustomRandom(masterSeed, isPseudo, "entityAgeableParticleVillagerHappy", TextFormatting.GRAY+"Changes the x,y and z coordinates relative to the entity, where the villager-happy particles spawn", "this.posX + (double)(this.rand."+TextFormatting.GREEN+"nextFloat"+TextFormatting.RESET+"() * this.width * 2.0F) - (double)this.width, this.posY + 0.5D + (double)(this.rand."+TextFormatting.GREEN+"nextFloat"+TextFormatting.RESET+"() * this.height)"));
		
		RandomList.put("blockrotationprocessorProcessBlock", blockrotationprocessorProcessBlock= new CustomRandom(masterSeed, isPseudo, "blockrotationprocessorProcessBlock", TextFormatting.GRAY+"Changes the amount of blocks missing, when loading a structure from structureblocks. Chance is the integrity of the structure", "this.chance < 1.0F && this.random."+TextFormatting.GREEN+"nextFloat"+TextFormatting.RESET+"() > this.chance ? null : blockInfoIn"));
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
	public static long getSeedFromRandom(String stringIn) {
		return getRandomFromString(stringIn).getSeed();
	}
	public static long getCallsFromRandom(String stringIn) {
		return getRandomFromString(stringIn).getTimesCalled();
	}
}
