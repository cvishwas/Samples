package com.springboot.lamdas;

public class GenericFunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomeFunc<String> reverse = (str) -> {
			String result = "";
			int i;
			for(i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);

			}return result;
			

		};
		System.out.println("reverse of java is "+reverse.func("Java"));
	}

}
