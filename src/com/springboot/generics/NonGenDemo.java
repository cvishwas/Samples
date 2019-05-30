package com.springboot.generics;

public class NonGenDemo {

	public static void main(String[] args) {

		NonGen iOb;
		
		iOb = new NonGen(88);
		iOb.showType();
		
		int v = (Integer)iOb.getob();
		System.out.println(v);
		
	}

}
