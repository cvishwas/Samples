package com.springboot.javabasic;

public class ForLoopDemo {

	public static void main(String args[]) {
		ForLoopDemo fd = new ForLoopDemo();
		fd.a(false);
		System.out.println("true");
		fd.a(false);

	}
	
	public void a(boolean g){
		if(g)
			return;
		else
			System.out.println("false");
		
		System.out.println("dfdsf");
	}
}
