package com.shopping.io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteArrayOutputStream bos1 = new ByteArrayOutputStream();
		String str = "JavaDemos";
		byte strBytes[] = str.getBytes();
		try {
			bos1.write(strBytes);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(bos1.toString());
		try(FileOutputStream fos = new FileOutputStream("fos.txt")){
			bos1.writeTo(fos);
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
