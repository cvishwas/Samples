package com.springboot.concurrent;

import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable {
	String name;
	CountDownLatch latch;
	
	MyThread(CountDownLatch c,String n){
		name = n;
		latch = c;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println(name + ": "+i);
			latch.countDown();
		}
		
	}
	
	

}
