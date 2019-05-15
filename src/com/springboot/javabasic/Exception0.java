package com.springboot.javabasic;

public class Exception0 {
	static void demoThrow() throws IllegalAccessException{
			System.out.println("Inside demo throw");
			throw new IllegalAccessException("demo");
	}
	
	public static void main(String args[]){

			try {
				demoThrow();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
