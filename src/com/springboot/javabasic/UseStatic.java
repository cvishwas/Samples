package com.springboot.javabasic;

public class UseStatic {
	static int a = 3;
	static int b;
	
	static void calc(int x){
		System.out.println("x="+x);
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	
	static{
		System.out.println("Static block initialised");
		b = a * 100;
	}
	
	public void test(){
		calc(45);
	}
	
	public static void main(String args[]){
//		UseStatic us = new UseStatic();
//		us.test();
//		test();
		UseStatic.calc(45);
	}

}
