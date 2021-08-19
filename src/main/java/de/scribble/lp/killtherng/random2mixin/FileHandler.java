package de.scribble.lp.killtherng.random2mixin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
	private List<String> umrlines=new ArrayList<String>();
	
	private File folder=new File(new File(".").getAbsolutePath(),"/mixin/ktrng/");
	
	private int counter=0;
	
	private int ordinal=0;
	
	private String prevClassName;
	
	private String prevMethodName;
	
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
			ordinal=0;
		}
		if(!methodName.equals(prevMethodName)) {
			prevMethodName=methodName;
			ordinal=0;
		}
//		writeLine(String.format("random_%s,L%s;%s%s,L%s;%s%s,null,%s,%s,%s", counter, className.replace(".", "/"), methodName, methodDescriptor, targetOwner, targetName, targetDescriptor, ordinal, "0x"+Integer.toHexString(classAccess), "0x"+Integer.toHexString(methodAccess)));
		System.out.println(counter+" "+classAccess+" "+methodAccess);
		ordinal++;
	}
	
	private void writeLine(String line) throws IOException {
		line=line+"\n";
		out.write(line.getBytes());
	}
	
	private void writeLine(String line, int heck) {
		
	}
}
