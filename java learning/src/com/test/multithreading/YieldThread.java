package com.test.multithreading;

public class YieldThread extends Thread{
	public void run() {
		for(int i=1; i<=10; i++) {
			Thread.yield();
			System.out.println("Child thread");
		}
	}
}
