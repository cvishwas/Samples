package com.springboot.generics;

public class GenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<Integer,String> iOb;
		
		iOb = new Gen<Integer,String>(88,"Gen Demo");
		
		iOb.showType();
		
		int v = iOb.getOb1();
		System.out.println("v --> "+v);

		String str = iOb.getOb2();
		System.out.println("Str --> "+str);
		
		
	}

}
