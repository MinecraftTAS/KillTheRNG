package de.scribble.lp.killtherng.random2mixin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * Dumb fix for my stupid mistake
 * @author ScribbleLP
 *
 */
public class CsvFixer {

	public static void main(String[] args) {
		// Loading in the file
		File logfile = new File(".", "Randomness 1.12.2 extreme - Oh no.tsv");
		File logfile2= new File(".", "Classes.tsv");
		// Check if it exists
		if (!logfile.exists()) {
			return;
		}
		// Read lines
		List<String> lines = new ArrayList<>();
		try {
			lines = FileUtils.readLines(logfile, Charset.defaultCharset());
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileOutputStream stream=null;
		try {
			stream=new FileOutputStream(logfile2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String prevQualName=null;
		
		String prevClassName=null;
		
		List<String> prevTargetNames=new ArrayList<>();
		
		// process lines
		for (String line : lines) {
			if (line.startsWith("Recognisable"))
				continue;
			String[] split = line.split("\t");

			String name = split[0];
			String description = split[1];
			String qualName = split[2];
			String target = split[3];
			String ordinal = split[4];
			String classAccess = split[5];
			String methodAccess = split[6];
			String remap = split[7];
			String enabled = split[8];

			String className=getClassName(qualName);
			
			String out = "";
			if (!qualName.equals(prevQualName)) {
				// When a new class is being processed
				prevQualName = qualName;
				prevTargetNames.clear();
			}
			
			if(!className.equals(prevClassName)) {
				out=String.format("%s\tBoth\n", className);
				try {
					stream.write(out.getBytes());
				} catch (IOException e) {
					e.printStackTrace();
				}
				prevClassName=className;
			}

//			String out=String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n", name, description, qualName, target, countObject(prevTargetNames, target), classAccess, methodAccess, remap, enabled);
//			try {
//				stream.write(out.getBytes());
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
			prevTargetNames.add(target);
			
		}
		try {
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static int countObject(List<String> list, String string) {
		int counter=0;
		for(String listelement : list) {
			if(listelement.equals(string)) {
				counter++;
			}
		}
		return counter;
	}
	
	private static String getClassName(String qualName) {
		String[] split = qualName.split(";",2);
		String first = split[0];
		String[] split2 = first.split("/");
		return split2[split2.length-1];
	}
}
