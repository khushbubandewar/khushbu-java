package com.test.multithreading;

public class MyThread2 extends Thread {
		public void start() {
			super.start();
			System.out.println(" Start Method ");
		}
		public void run() {
			System.out.println(" Run Method ");
		}
}
