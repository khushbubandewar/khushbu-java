package com.test.multithreading;

public class JoinThread extends Thread {
	public void run() {
		for(int i=1; i<10; i++) {
			System.out.println("Join Thread");
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				
			}
		}
	}
}
