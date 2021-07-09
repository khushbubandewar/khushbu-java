package com.test.multithreading;

public class InterruptedEx extends Thread {
	public void run() {
		try {
			for (int i = 1; i < 10; i++) {
				System.out.println("Interrupted");
				Thread.sleep(6000);
			}
		} catch (InterruptedException e) {
			System.out.println(" I got Interrupted");
		}

	}
}
