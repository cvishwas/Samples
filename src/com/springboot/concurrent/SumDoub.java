package com.springboot.concurrent;

import java.util.concurrent.Callable;

public class SumDoub implements Callable<Double>{
	double stop;
	SumDoub(double v){
		stop = v;
	}

	@Override
	public Double call() throws Exception {
		// TODO Auto-generated method stub
		double sum = 0;
		for(int i=0;i <= stop; i++)
		{
			sum+=i;
		}
		return sum;
	}

}
