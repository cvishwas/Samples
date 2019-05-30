package com.springboot.lamdas;

public class BlockLambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumericFunc factorial = (n) -> {
			int result = 1;
			for(int i=1; i <=n ;i++)
				result = i * result;
			
			return result;
		};
		
		System.out.println("3 factorial is "+factorial.func(3));
		System.out.println("10 factorial is "+factorial.func(10));
	}

}
