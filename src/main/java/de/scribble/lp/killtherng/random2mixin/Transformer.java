package de.scribble.lp.killtherng.random2mixin;

import java.io.IOException;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import net.minecraft.launchwrapper.IClassTransformer;

public class Transformer implements IClassTransformer{

	FileHandler handler=new FileHandler();
	
	@Override
	public byte[] transform(String className, String transformedName, byte[] basicClass) {
		ClassReader reader = new ClassReader(basicClass);
		ClassWriter writer = new ClassWriter(reader, 0);
		int access=reader.getAccess();
		reader.accept(classVisitor(writer, className, access), 0);
		return writer.toByteArray();
	}

	public ClassVisitor classVisitor(ClassVisitor writer, String className, int access2) {
		return new ClassVisitor(Opcodes.ASM5, writer) {
			
			@Override
			public MethodVisitor visitMethod(int access, String methodName, String methodDescriptor, String signature, String[] exceptions) {
				
				return methodVisitor(super.visitMethod(access, methodName, methodDescriptor, signature, exceptions), className, methodName, methodDescriptor, access2, access);
			}
		};
	}
	
	public MethodVisitor methodVisitor(MethodVisitor writer, String className, String methodName, String methodDescriptor, int classAccess, int methodAccess) {
		return new MethodVisitor(Opcodes.ASM5, writer) {
			@SuppressWarnings("unused")
			@Override
			public void visitMethodInsn(int opcode, String targetOwner, String targetName, String targetDescriptor, boolean isInterface) {
				if(opcode==Opcodes.INVOKEVIRTUAL&&false) {
					if("java/util/Random".equalsIgnoreCase(targetOwner)) {
						try {
							handler.addRng(className, methodName, methodDescriptor, targetOwner, targetName, targetDescriptor, classAccess, methodAccess);
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}else if(opcode==Opcodes.INVOKESTATIC) {
					if("java/lang/Math".equalsIgnoreCase(targetOwner)&&"random".equals(targetName)) {
						try {
							handler.addRng(className, methodName, methodDescriptor, targetOwner, targetName, targetDescriptor, classAccess, methodAccess);
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
				super.visitMethodInsn(opcode, targetOwner, targetName, targetDescriptor, isInterface);
			}
		};
	}
	
}
