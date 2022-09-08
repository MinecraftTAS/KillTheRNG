package de.scribble.lp.killtherng.random2mixin.csv2mixin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Csv2Mixin2 {

	private static final File dir = new File("../");

	private static final File dirKTRNG = new File(dir, "src/main/java/de/scribble/lp/killtherng/mixin/ktrng/patches");

	private static final Map<String, MixinClassData> mixinData = new HashMap<>();
	
	private static final Logger LOGGER = LogManager.getLogger("Random2Mixin");
	
	public static void main(String[] args) {
		if (!dirKTRNG.exists()) {
			dirKTRNG.mkdirs();
		}

		File randomnessFile = new File(dir, "Randomness 1.12.2 extreme - Oh no.tsv");

		// Check if it exists
		if (!randomnessFile.exists()) {
			LOGGER.error("Randomness file does not exist");
			return;
		}

		// Read lines
		List<String> lines = new ArrayList<>();
		try {
			lines = FileUtils.readLines(randomnessFile, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (String line : lines) {
			if (line.startsWith("Recognisable"))
				continue;
			String[] split = line.split("\t");

			// The name of the randomness in question: "blockupdateLCG"
			String name = split[0];
			// The description of what the randomness does: "Linear Congruential Generator
			// seed, for random block updates. Called when joining a World"
			String description = split[1];
			// The qualified name of the class and method that should be mixed into:
			// "Lnet/minecraft/world/World;<init>(Lnet/minecraft/world/storage/ISaveHandler;Lnet/minecraft/world/storage/WorldInfo;Lnet/minecraft/world/WorldProvider;Lnet/minecraft/profiler/Profiler;Z)V"
			String qualName = split[2];
			// The qualified name of the redirect target: "Ljava/util/Random;nextInt()I"
			String target = split[3];
			// The ordinal of the randomness. If multiple redirect targets are the same, the
			// ordinal will increase: "0"
			String ordinal = split[4];
			// The access information of the class, something like public, abstract, private
			// etc... some special cases need this: "0x421"
			int classAccess = Integer.parseInt(split[5].replaceFirst("0x", ""), 16);
			// The access of the method that should be mixed into, something like public,
			// private, protected, static etc... : "0x4"
			int methodAccess = Integer.parseInt(split[6].replaceFirst("0x", ""), 16);
			// If the random should be remapped. Some stuff like forge classes are still
			// deobfuscated in the finished jar, which throws an error... : "FALSE"
			boolean remap = split[7].equals("TRUE") ? true : false;
			// If the random should be enabled. If the value is "TRUE" it will be disabled
			// in the mixin: "TRUE"
			boolean enabled = split[8].equals("TRUE") ? false : true;
			// If the mixin should be called on the client
			boolean client = split[9].equals("TRUE") ? true : false;
			// If the mixin should be set to private static
			boolean staticmethod = split[10].equals("TRUE") ? true : false;

			/**** Process qualified name ****/
			String className = getClassName(qualName); // The actual class name to mix into without the package information: "World"
			String classNameWithPath = getClassNameWithPath(qualName); // The class name with the path, this is used for classes that are private:
																		// "net.minecraft.world.World"
			String methodName = getMethodName(qualName); // The method name plus descriptor:
															// "<init>(Lnet/minecraft/world/storage/ISaveHandler;Lnet/minecraft/world/storage/WorldInfo;Lnet/minecraft/world/WorldProvider;Lnet/minecraft/profiler/Profiler;Z)V"

			MixinMethodData newData = new MixinMethodData(name, description, qualName, target, ordinal, classAccess, methodAccess, remap, enabled, client, className, classNameWithPath, methodName, staticmethod);
			
			MixinClassData classData = mixinData.getOrDefault(className, new MixinClassData("de.scribble.lp.killtherng.mixin.ktrng.patches", classNameWithPath, className, classAccess));
			
			classData.add(newData);
			
			mixinData.put(className, classData);
			
		}
		
//		createLogFile();
		
		mixinData.forEach((classname, classdata) -> {
			LOGGER.info("Saving class {}", classname);
			classdata.saveAs(dirKTRNG, "de.scribble.lp.killtherng.KillTheRNG.randomness");
		});
	}
	
	private static void createLogFile() {
		LOGGER.info("Creating random2mixinLog.txt");
		FileOutputStream logfileStream = null;
		try {
			logfileStream = new FileOutputStream(new File(dir, "random2mixinLog.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}
		
		Set<Entry<String, MixinClassData>> mixinSet = mixinData.entrySet();
		
		Iterator<Entry<String, MixinClassData>> split = mixinSet.iterator();
		while(split.hasNext()) {
			Entry<String, MixinClassData> entry = split.next();
			MixinClassData classData = entry.getValue();
			
			writeStream(logfileStream, classData.toString());
		}
		try {
			logfileStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String getMethodName(String qualName) {
		String[] split = qualName.split(";",2);
		return split[1];
	}

	private static String getClassName(String qualName) {
		String[] split = qualName.split(";",2);
		String first = split[0];
		String[] split2 = first.split("/");
		return split2[split2.length-1];
	}

	private static String getClassNameWithPath(String qualName) {
		String[] split = qualName.split(";",2);
		String first = split[0].replace("/", ".");
		String replaced=first.replaceFirst("L", "");
		return replaced;
	}
	
	private static void writeStream(FileOutputStream stream, String line) {
		line=line.concat("\n");
		try {
			stream.write(line.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
