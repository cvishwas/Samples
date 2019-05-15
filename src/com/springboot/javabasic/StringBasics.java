package com.springboot.javabasic;

public class StringBasics {
	public final static String Q1_TRUE = "YES";
	final String Q1_FALSE = "NO";
	public static void main(String[] args) {
		UseStatic.calc(45);
		String s1 = new String("A"); // not recommended, use String s1 = "A"
		String s2 = new String("A"); // not recommended, use String s2 = "A"
		// standard: follows the == and equals() rule like plain java objects.
		if (s1 == s2) { 
			System.out.println("references/identities are equal"); 
		}
		if (s1.equals(s2)) { // deep comparison
			System.out.println("values are equal"); // this line is printed
		}
		// variation: does not follow the == and equals rule
		String s3 = "A"; // goes into a String pool.
		String s4 = "A"; // refers to String already in the pool.
		if (s3 == s4) { // shallow comparison
			System.out.println("references/identities are equal"); // this line
																	// is
																	// printed
		}
		if (s3.equals(s4)) { // deep comparison
			System.out.println("values are equal"); // this line is also printed
		}
	}
}
