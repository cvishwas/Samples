package com.shopping.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> hs = new TreeSet<String>();
		hs.add("a");
		hs.add("b");
		hs.add("d");
		hs.add("c");
		hs.add("e");
		System.out.println(hs);
		System.out.println(hs.subSet("c", "e"));
	}

}
