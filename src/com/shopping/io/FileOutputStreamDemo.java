package com.shopping.io;

import java.io.IOException;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {
	public static void main(String args[]) {
		String source = "Java IO Test";
		byte buf[] = source.getBytes();
		FileOutputStream f0 = null;
		try {
			f0 = new FileOutputStream("fileop1.txt");
			for(int i=0; i < buf.length;i++) {
				f0.write(buf[i]);
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}finally {
			try {
				f0.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
