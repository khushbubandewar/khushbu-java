package com.test.multithreading;

public class MyRunnable implements Runnable {
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Child Thread");
		}
	}
}
