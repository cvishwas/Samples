package com.springboot.javabasic;

//Create a second thread.
class NewThread implements Runnable {
	Thread t;

	NewThread() {
		// Create a new, second thread
		t = new Thread(this, "Demo Thread");
		System.out.println("Child thread: " + t);
		t.start(); // Start the thread
	}

	// This is the entry point for the second thread.
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
//				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}

}