package de.scribble.lp.killtherng.random2mixin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
	@SuppressWarnings("unused")
	private List<String> umrlines=new ArrayList<String>();
	
	private File folder=new File(new File(".").getAbsolutePath(),"/mixin/ktrng/");
	
	private int counter=0;
	
	private String prevClassName;
	
	private String prevMethodName;
	
	private List<String> prevTargetNames=new ArrayList<>();
	
	private FileOutputStream out;
	
	public FileHandler() {
		folder.mkdirs();
		try {
			out=new FileOutputStream(new File(folder,"/log.csv"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			writeLine("Recognisable Name, Qualified Name, Target, Description, Ordinal, ClassAccess, MethodAccess");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void addRng(String className, String methodName, String methodDescriptor, String targetOwner, String targetName, String targetDescriptor, int classAccess, int methodAccess) throws IOException {
//		out.write(String.format("@Redirect(method=\"%s\", at=@At(value=\"INVOKE\", target=\"%s\"\n", methodName, targetDescriptor).getBytes());
		counter++;
		if(!className.equals(prevClassName)) {
			//When a new class is being processed
			prevClassName=className;
			prevTargetNames.clear();
		}
		if(!methodName.equals(prevMethodName)) {
			prevMethodName=methodName;
			prevTargetNames.clear();
		}
		
//		writeLine(String.format("random_%s,null,L%s;%s%s,L%s;%s%s,%s,%s,%s", counter, className.replace(".", "/"), methodName, methodDescriptor, targetOwner, targetName, targetDescriptor, countObject(prevTargetNames, targetName), "0x"+Integer.toHexString(classAccess), "0x"+Integer.toHexString(methodAccess)));
		System.out.println(counter+" "+className+" "+methodAccess);
		prevTargetNames.add(targetName);
	}
	
	private void writeLine(String line) throws IOException {
		line=line+"\n";
		out.write(line.getBytes());
	}
	
	@SuppressWarnings("unused")
	private int countObject(List<String> list, String string) {
		int counter=0;
		for(String listelement : list) {
			if(listelement.equals(string)) {
				counter++;
			}
		}
		return counter;
	}
}
