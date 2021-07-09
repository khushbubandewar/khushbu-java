package com.test.multithreading;

public class Display {
	public synchronized void wish(String name) {
		for(int i=1; i<5; i++) {
			System.out.print("First Block  :");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
			System.out.println(name);
		}
	}
}
