package com.test.multithreading;

public class PriorityEx extends Thread {
	public void run() {
		System.out.println("PriortyExa");
		for(int i=1;i<=10;i++) {
			System.out.println(""+i);
		}
	}
}
