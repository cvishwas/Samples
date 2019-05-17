package com.shopping.io;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "JavaDemos";
		byte b[] = str.getBytes();
		ByteArrayInputStream bis1 = new ByteArrayInputStream(b);
		for(int i=0; i<10;i++) {
			int a;
			while((a = bis1.read()) != -1) {
				if(i == 5) {
					System.out.print((char)a);
				}else {
					System.out.print(Character.toUpperCase((char)a));
				}
			}
			bis1.reset();
		}
	}

}
