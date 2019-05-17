package com.shopping.io;

import java.io.File;

public abstract class FileDemo {
	public static void main(String args[]) {
		File f = new File("C:/temp/FileTest.txt");
		System.out.println("File Name"+f.getName());
		System.out.println("File absolute path"+f.getAbsolutePath());
		System.out.println("File Name"+f.exists());
//		System.out.println("File Name"+f.c);
	}
}
