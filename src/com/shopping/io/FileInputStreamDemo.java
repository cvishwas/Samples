package com.shopping.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String args[]) {
		int size;
		
		try(FileInputStream f= new FileInputStream("C:\\work\\java-springboot\\Samples\\src\\com\\shopping\\io\\FileDemo.java")){
			size = f.available();
			System.out.println("Total available bytes:"+size);
			int n = size/10;
			System.out.println("First "+n+" bytes of the file to be read");
			for(int i=0;i< n; i++) {
//				System.out.println(f.read());
				System.out.println((char)f.read());
			}
			System.out.println("Still available bytes:"+f.available());

			
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
