package com.springboot.lamdas;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber myNum;
		
		MyNumber isEven = (n) -> (n % 2) == 0;
		if(isEven.test(10))
			System.out.println("Is Even");
		else
			System.out.println("Is odd");
		
		MyNumber isNeg = (n) -> (n < 0) ;
		if(isNeg.test(5))
			System.out.println("Is Negative");
		else
			System.out.println("Is Positive");
	}

}
