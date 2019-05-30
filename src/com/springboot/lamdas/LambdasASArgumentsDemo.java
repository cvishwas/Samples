package com.springboot.lamdas;

public class LambdasASArgumentsDemo {
	
	static String stringOp(StringFunc sf,String s) {
		return sf.func(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output = stringOp((str) ->{
			String result = "Java ";
			result += str;
			return result;
		},"is beautiful");
		System.out.println("Output is "+output);
		
	}

}
