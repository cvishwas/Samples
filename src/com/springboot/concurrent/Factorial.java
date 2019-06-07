package com.springboot.concurrent;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Integer>{
	int stop;
	Factorial(int v){
		stop = v;
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		int fact = 1;
		for(int i= 2;i<= stop; i++)
		{
			fact*=i;
		}
		return fact;
	}

}
