package com.springboot.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(3);
		Future<Integer> f;
		Future<Double> f2;
		Future<Integer> f3;
		
		System.out.println("Starting");
		f = es.submit(new Sum(10));
		f2 = es.submit(new SumDoub(10.0));
		f3 = es.submit(new Factorial(3));
		
		try {
			System.out.println("1 -> "+f.get());
			System.out.println("2 -> "+f2.get());
			System.out.println("3 -> "+f3.get());			
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		es.shutdown();
		System.out.println("Done");

	}

}
