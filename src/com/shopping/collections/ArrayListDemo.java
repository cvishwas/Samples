package com.shopping.collections;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList<String> a1 = new ArrayList<String>();
		ArrayList<String> a2 = new ArrayList<String>();
		System.out.println("Initial size = "+a1.size());
		a1.add("Element 1");
		a1.add("Element 2");
		a1.add("Element 3");
		a1.add("Element 4");
		a1.add("Element 1");
		a2.addAll(a1);
		System.out.println("Final size = "+a1.size());
		System.out.println("ArrayList = "+a1);
//		int i = 0;
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
			a1.remove(i);
//			i++;
		}
		
	}
}
