package com.shopping.io;

import java.io.FileReader;
import java.util.ArrayList;

public class FileReaderDemo {
	public static void main(String args[]) {
		try(FileReader fr = new FileReader("c:/temp/Properties.txt")){
			int c;
			ArrayList<String> props = new ArrayList<String>();
			while((c = fr.read()) != -1) {
				props.add(c+"");
				System.out.print((char) c);
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
