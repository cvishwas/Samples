package com.springboot.concurrent;

import java.util.concurrent.Callable;

public class Sum implements Callable<Integer>{
	int stop;
	Sum(int v){
		stop = v;
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0;i<= stop; i++)
		{
			sum+=i;
		}
		return sum;
	}

}
