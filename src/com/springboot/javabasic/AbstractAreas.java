package com.springboot.javabasic;

public class AbstractAreas {
	public static void main(String args[]){
		Rectangle r = new Rectangle(9,5);
		Triangle t = new Triangle(10,8);
		Figure figuref ;
		figuref = r;
		Figure figurefNew = new Rectangle(5,30);
		System.out.println(figurefNew.area());
	}
}
