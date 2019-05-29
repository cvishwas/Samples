package com.shopping.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String acctDet="FirstName:LastName:Checking:NYC";
		
		char buf[] = new char[acctDet.length()];
		acctDet.getChars(0, acctDet.length(), buf, 0);
		try(FileWriter fw = new FileWriter("c:/temp/acct.txt")) {
			for(int i =0;i < buf.length;i++) {
				fw.write(buf[i]);
			}
			System.out.println("Write completed");
		}catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
