package com.shopping.io;

import java.io.File;

public class DirList {
	
	public static void displayFilesFromDirectory(File dir) {
		File files[] = dir.listFiles();
		for(File file:files) {
			if(file.isDirectory()) {
				System.out.println("Directory="+file.getName());
				displayFilesFromDirectory(file);
			}else {
				System.out.println(file.getName());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirname = "C:\\work\\java-springboot\\Bank1\\src";
		displayFilesFromDirectory(new File(dirname));
	}

}
