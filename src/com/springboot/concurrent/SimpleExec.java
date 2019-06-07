package com.springboot.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDownLatch cdl1 = new CountDownLatch(5);
		CountDownLatch cdl2 = new CountDownLatch(5);
		CountDownLatch cdl3 = new CountDownLatch(5);
		CountDownLatch cdl4 = new CountDownLatch(5);
		
		System.out.println("Starting the Executor");
		ExecutorService es = Executors.newFixedThreadPool(2);
		System.out.println("Starting the Threads");
		es.execute(new MyThread(cdl1,"A"));
		es.execute(new MyThread(cdl2,"B"));
		es.execute(new MyThread(cdl3,"C"));
		es.execute(new MyThread(cdl4,"D"));
		
		try {
			cdl1.await();
			cdl2.await();
			cdl3.await();
			cdl4.await();
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		es.shutdown();
		System.out.println("Finished");

	}

}
